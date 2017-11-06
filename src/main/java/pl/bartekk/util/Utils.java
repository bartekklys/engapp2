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
}
