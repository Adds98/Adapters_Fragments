package com.practice.adapters.model.mock;

import com.practice.adapters.R;
import com.practice.adapters.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MockCategory {

    public static List<Category> getCategories(){
        List<Category> list = new ArrayList<>();
        list.add(new Category("Dogs", R.drawable.dog));
        list.add(new Category("Cats",R.drawable.cat));
        list.add(new Category("Birds",R.drawable.macaw));
        list.add(new Category("Pigs",R.drawable.pig));
        return  list;
    }
}
