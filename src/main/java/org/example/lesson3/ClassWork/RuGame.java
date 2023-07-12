package org.example.lesson3.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> res = new ArrayList<>();
        for (int i = (int) ('а'); i <= (int) ('я'); i++)
            res.add(String.valueOf((char) i));
        return res;
    }
}
