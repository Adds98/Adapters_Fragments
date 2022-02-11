package com.practice.adapters.model.mock;

import com.practice.adapters.R;
import com.practice.adapters.model.Behavioral;

import java.util.ArrayList;
import java.util.List;

public class MockBehaviors {

    public static List<Behavioral> getBehaviors() {
        List<Behavioral> list = new ArrayList<>();
        list.add(new Behavioral("Name 1", R.drawable.pig));
        list.add(new Behavioral("Name 2", R.drawable.pig));
        list.add(new Behavioral("Name 3", R.drawable.pig));
        return list;
    }
}
