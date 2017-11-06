package pl.bartekk;

import pl.bartekk.entity.IrregularVerb;
import pl.bartekk.entity.Level;
import pl.bartekk.util.Colors;
import pl.bartekk.util.Constants;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(Constants.IRREGULAR_VERBS));

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj poziom: ");
        String levelString = reader.nextLine().toUpperCase();
        Level level = Level.valueOf(levelString.substring(0,2));

        List<IrregularVerb> verbs = new ArrayList<>();

        try {
            String line = br.readLine();

            while (line != null) {

                String[] strings = line.split(";");
                IrregularVerb verb = new IrregularVerb();
                verb.setInfinitive(strings[0]);
                verb.setPastSimple(strings[1]);
                verb.setPastParticiple(strings[2]);
                verb.setTranslation(strings[3]);
                verb.setLevel(Level.valueOf(strings[4].toUpperCase()));
                if (levelString.substring(levelString.length()-2).equalsIgnoreCase("-o")) {
                    if (verb.getLevel().ordinal() == level.ordinal()) {
                        verbs.add(verb);
                    }
                }else if (verb.getLevel().ordinal() <= level.ordinal()) {
                    verbs.add(verb);
                }
                line = br.readLine();
            }
        } finally {
            br.close();
        }


        for (int i = 0 ; i < 10 ; i++) {

            IrregularVerb verb = pickRandom(verbs);
            System.out.println(verb.getTranslation() + " " + Colors.printLevel(verb));

            IrregularVerb answer;
            int attempt = 1;

            do {
                if (attempt > 1) {
                    System.out.println(verb.getInfinitive() + " " + verb.getPastSimple() + " " + verb.getPastParticiple());
                }
                String userInput = reader.nextLine();
                while (userInput.equals("")) {
                    System.out.println(Colors.ANSI_YELLOW + "Hint: " + verb.getInfinitive() + " " + verb.getPastSimple() + " " + verb.getPastParticiple() + Colors.ANSI_RESET);
                    userInput = reader.nextLine();
                }
                String[] strings = userInput.split(" ");
                answer = new IrregularVerb(strings[0], strings[1], strings[2]);
                attempt++;
            }
            while (!answer.getInfinitive().equals(verb.getInfinitive()) || !answer.getPastSimple().equals(verb.getPastSimple())
                    || !answer.getPastParticiple().equals(verb.getPastParticiple()));


        }
        reader.close();

    }

    private static IrregularVerb pickRandom(List<IrregularVerb> verbs) {
        Random random = new Random();
        int randomIndex = random.nextInt(verbs.size());
        return verbs.remove(randomIndex);

    }
}
