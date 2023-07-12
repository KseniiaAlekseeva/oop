package org.example.lesson3.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> res = new ArrayList<>();
        for (int i = (int) ('a'); i <= (int) ('z'); i++)
            res.add(String.valueOf((char) i));
        return res;
    }
}
