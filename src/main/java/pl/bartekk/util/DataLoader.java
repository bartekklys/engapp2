package pl.bartekk.util;

import pl.bartekk.entity.IrregularVerb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    /*public List<IrregularVerb> loadVerbsFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(Constants.IRREGULAR_VERBS));

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
    }*/

}
