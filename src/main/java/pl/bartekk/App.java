package pl.bartekk;

import pl.bartekk.entity.IrregularVerb;
import pl.bartekk.entity.Level;
import pl.bartekk.util.Constants;
import pl.bartekk.util.DataLoader;
import pl.bartekk.util.Utils;

import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(Constants.IRREGULAR_VERBS));

        Scanner reader = new Scanner(System.in);
//        System.out.println("Podaj poziom: ");
//        Level level = Level.valueOf(reader.nextLine());

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

//        System.out.println(Level.A2);
//        verbs = Utils.sortByLevel(verbs, level);


        for (int i = 0 ; i < 10 ; i++) {

            IrregularVerb verb = pickRandom(verbs);
            System.out.println(verb.getTranslation());

            IrregularVerb answer;
            int attempt = 1;

            do {
                if (attempt > 1) {
                    System.out.println(verb.getInfinitive() + " " + verb.getPastSimple() + " " + verb.getPastParticiple());
                }
                String userInput = reader.nextLine();
                String[] strings = userInput.split(" ");
                answer = new IrregularVerb(strings[0], strings[1], strings[2]);
                attempt++;
            }
            while (!answer.getInfinitive().equals(verb.getInfinitive()) || !answer.getPastSimple().equals(verb.getPastSimple())
                    || !answer.getPastParticiple().equals(verb.getPastParticiple()));


        }
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

    private static IrregularVerb pickRandom(List<IrregularVerb> verbs) {
        Random random = new Random();
        int randomIndex = random.nextInt(verbs.size());
        return verbs.remove(randomIndex);

    }
}
