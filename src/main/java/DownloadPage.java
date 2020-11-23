import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class DownloadPage {
    private static Document doc;

    private static String getTextPage(){
        try {
            String url = "https://habr.com/ru/post/529180/";
            doc = Jsoup.parse(new URL(url), 5000);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements link = doc.getElementsByAttributeValue("class", "post__text post__text-html post__text_v1");
        return String.valueOf(link);
    }

    private static void viewPage() {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        JEditorPane site;
        site = new JEditorPane();
        site.setContentType("text/html");
        site.setText(getTextPage());
        site.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(site);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(1200, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        getTextPage();
        viewPage();
    }
}
