package pl.bartekk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
//        words.put("insekt", "insect");
//        words.put("mrówka", "ant");
//        words.put("pszczoła", "bee");
//        words.put("robak", "bug");
//        words.put("motyl", "butterfly");
//        words.put("karaluch", "cockroach");
//        words.put("stworzenie", "creature");
//        words.put("mucha", "fly");
//        words.put("komar", "mosquito");
//        words.put("pająk", "spider");
//        words.put("sieć", "web");
/*        words.put("chrząszcz", "beetle");
        words.put("pchła", "flea");
        words.put("żądło", "sting");
        words.put("osa", "wasp");
        words.put("trzmiel", "bumblebee");
        words.put("ważka", "dragonfly");
        words.put("konik polny", "grasshopper");
        words.put("szerszeń", "hornet");
//        words.put("biedronka", "ladybird");
        words.put("pluskwa", "bedbug");
        words.put("gąsiennica", "caterpillar");
//        words.put("cykada", "cicada");
//        words.put("truteń", "drone");
        words.put("bąk", "gadfly");
        words.put("szarańcza", "locust");
        words.put("wesz", "louse");
        words.put("modliszka", "mantis");
        words.put("ćma", "moth");
        words.put("stonka ziemniaczana", "potato beetle");
        words.put("jedwabnik", "silkworm");
        words.put("termit", "termite");*/

        words.put("nieuczciwy", "dishonest");
        words.put("troskliwy", "thoughtful");
        words.put("troskliwość", "thoughtfulness");
        words.put("dobroć", "kindness");
        words.put("odwaga", "bravery");
        words.put("tchórzostwo", "cowardice");
        words.put("konsekwentny", "consistent");

        words.put("kotwica", "anchor");
        words.put("brzuch", "belly");
        words.put("panna", "maiden");
        words.put("handlowiec", "merchant");
        words.put("sokół", "falcon");
        words.put("węzeł", "knot");
        words.put("zawdzięczać", "owe");
        words.put("pragnienie", "desire");
        words.put("los", "fate");
        words.put("uczucie", "affection");
        words.put("traktować", "treat");
        words.put("wiano", "dowry");
        words.put("zemsta", "vengeance");
        words.put("przysługa", "favor");
        words.put("stos pogrzebowy", "pyre");
        words.put("od urodzenia", "congenitally");
        words.put("zamieszanie", "distraction");

        Scanner sc = new Scanner(System.in);

        Map<String, String> secondRound = new HashMap<>();

        System.out.println("First round:");

        for (String word :
                words.keySet()) {
            System.out.print(word + " : ");
            String answer = sc.nextLine();
            while (!answer.equals(words.get(word)) || answer.equals("")) {
                System.out.print(word + " : ");
                answer = sc.nextLine();
                secondRound.put(word, answer);
            }

        }
        if (!secondRound.isEmpty()) {
            System.out.println("Second round:");

            for (String word :
                    secondRound.keySet()) {
                System.out.print(word + " : ");
                String answer = sc.nextLine();
                while (!answer.equals(secondRound.get(word)) || answer.equals("")) {
                    System.out.print(word + " : ");
                    answer = sc.nextLine();
                }
            }
        }

        sc.close();
    }
}
