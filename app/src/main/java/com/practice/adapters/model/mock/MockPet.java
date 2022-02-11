package com.practice.adapters.model.mock;

import android.content.Context;

import com.practice.adapters.R;
import com.practice.adapters.model.Pet;
import com.practice.adapters.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockPet {

    public static List<Pet> getPetList(Context context, int quantity){
        List<Pet> list = new ArrayList<>();
        for (int a=0;a< quantity;a++)
            list.add(new Pet(getNameRandom(), context.getResources().getString(R.string.text_loremIpsum),
                    MockImagePet.getImagesRandom(), MockBadge.getBadges(4), MockBehaviors.getBehaviors(), new User()));

        return list;
    }
    private static String getNameRandom(){
        String[] names = new String[]{"Coco",
                "Thor",
                "Max",
                "Rocky",
                "Toby",
                "Simba",
                "Leo",
                "Lucas",
                "Zeus",
                "Bruno",
                "Luna",
                "Nala",
                "Kira",
                "Lola",
                "Bimba",
                "Mia",
                "Noa",
                "Kiara",
                "Dana",
                "Gala",
                "Trufa",
                "Bimbo",
                "Candy",
                "Taco",
                "Oreo",
                "Macarrón",
                "Choco",
                "Lima",
                "Kinder",
                "Sushi",
                "Jack",
                "Loki",
                "Arya ",
                "Río",
                "Leia",
                "Klaus",
                "Tokyo",
                "Luke",
                "Logan",
                "Olaf",
                "India",
                "Asia",
                "Kenya",
                "África",
                "Siria",
                "Congo",
                "Nairobi",
                "Dubai",
                "Bali",
                "Chile",
                "Havana",
                "Kira",
                "Leo",
                "Mia",
                "Lucas",
                "Noa",
                "Kiara",
                "Bruno",
                "Gala",
                "Jack",
                "Maya",
                "Chiara",
                "Gigi",
                "Kim",
                "Kendall",
                "Paquita",
                "Kloe",
                "North",
                "Kylie",
                "Stormy",
                "Güachiman",
                "Chucho",
                "Chancla",
                "Madaleno",
                "Chachi",
                "Golfo",
                "Chula",
                "Narco",
                "Bribón",
                "Rufián",
                "Pulgoso"};
        return names[new Random().nextInt(names.length)];
    }
}
