import java.awt.*;
import javax.swing.*;

public class HabrPage extends JFrame{
	
	private  JEditorPane  page ;  // наш редактор
    private  String   url = "https://habr.com/ru/company/ruvds/blog/529122/";    ;  // текстовое поле с адресом
    private  final String notFound = "Адрес недоступен";	// сообщение в случае ошибки

    public HabrPage()
    {
        super("Просмотр страницы Habr-a");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createGUI();
        setSize(1260, 600);
        setVisible(true);
    }

    private void createGUI()
    {
        try {
            page = new JEditorPane(url);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, notFound);
        }
        page.setContentType("text/html");
        page.setEditable(false);
		setLayout(new BorderLayout());
		JScrollPane scrollPane = new JScrollPane(page);
		add(scrollPane, BorderLayout.CENTER);
//		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }

    public static void main(String[] args) {
        new HabrPage();
    }
}