package org.example.lesson3.ClassWork;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        List<String> res=new ArrayList<>();
        for (int i = 0; i < 10; i++)
            res.add(String.valueOf(i));
        return res;
    }
}
