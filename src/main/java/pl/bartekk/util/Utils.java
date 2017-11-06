package pl.bartekk.util;

import pl.bartekk.entity.IrregularVerb;
import pl.bartekk.entity.Level;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<IrregularVerb> sortByLevel(List<IrregularVerb> verbs, Level level) {
        List<IrregularVerb> sortedList = new ArrayList<>();
        for (IrregularVerb verb :
                verbs) {
            if (verb.getLevel().ordinal() < level.ordinal()) {
                sortedList.add(verb);
            }
        }
        return sortedList;
    }

    /*public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("/home/bartek/IdeaProjects/engapp2/src/main/resources/irregularData.txt", "UTF-8");

        File input = new File("/home/bartek/IdeaProjects/engapp2/src/main/resources/irregular.xml");
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
            writer.print(";");
            writer.print(secondForm.text());
            writer.print(";");
            writer.print(thirdForm.text());
            writer.print(";");
            writer.print(polish.text());
            writer.print(";");
            writer.println(className.substring(4,6));

        }
        writer.close();
    }*/
}
