package pl.bartekk;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/bartek/IdeaProjects/engapp/src/main/resources/irregularData.txt"));

        List<IrregularVerb> verbs = new ArrayList<>();

        try {
            String line = br.readLine();

            while (line != null) {

                String[] strings = line.split(",");
                IrregularVerb verb = new IrregularVerb();
                verb.setInfinitive(strings[0]);
                verb.setPastSimple(strings[1]);
                verb.setPastParticiple(strings[2]);
                verb.setTranslation(strings[3]);
                // narazie level pomijam
                verbs.add(verb);
                line = br.readLine();
            }
        } finally {
            br.close();
        }




        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        reader.close();

    }

    /*public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("/home/bartek/IdeaProjects/engapp/src/main/resources/irregularData.txt", "UTF-8");

        File input = new File("/home/bartek/IdeaProjects/engapp/src/main/resources/irregular.xml");
        Document doc = Jsoup.parse(input, "UTF-8", "");
        Elements links = doc.select("div");
        System.out.println("SIZE: " + links.size());
        for (Element link :
                links) {

            Element firstForm = link.select("p").first();
            Element secondForm = link.select("p").get(1);
            Element thirdForm = link.select("p").get(2);
            Element polish = link.select("p").get(3);
            Element level = link.select("p[class]").first();
            String className = level.className();

            writer.print(firstForm.text().substring(4));
            writer.print(",");
            writer.print(secondForm.text());
            writer.print(",");
            writer.print(thirdForm.text());
            writer.print(",");
            writer.print(polish.text());
            writer.print(",");
            writer.println(className.substring(4,6));

        }
        writer.close();
    }*/
}
