package com.practice.adapters.model.mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockBadge {

    public static List<String> getBadges(int quantity) {
        List<String> list = new ArrayList<>();
        for(int a=0;a<quantity;a++)
            list.add("Badge #"+ (new Random().nextInt(100)+1));
        return list;
    }
}
