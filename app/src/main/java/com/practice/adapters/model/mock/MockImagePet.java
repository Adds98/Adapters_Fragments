package com.practice.adapters.model.mock;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockImagePet {

    public static List<Uri> getImagesRandom() {
        List<Uri> list = new ArrayList<>();
        String[] urls = new String[]{
                "https://cdn.mequieroir.com/wp-content/uploads/2019/10/mascota-espana-blanca-1024x639.jpg",
                "https://www.respetmascotas.com/_Assets/img/181129-Imagen-AlimentacionMascotas.jpg",
                "https://ca-times.brightspotcdn.com/dims4/default/1d338c3/2147483647/strip/true/crop/4928x3264+0+0/resize/840x556!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F45%2F09%2F7c8d7171490d9c8744534920524a%2Fpet-store-adobestock-285952143.jpeg",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/mascotas-dni-cosmopolitan-1634478243.jpg",
                "https://icatcare.org/app/uploads/2019/09/The-Kitten-Checklist-1.png",
                "https://s36537.pcdn.co/wp-content/uploads/2018/06/bringing-home-kitty-mouth-open-wide.jpg.optimal.jpg",
                "https://img.lalr.co/cms/2018/08/16181927/Mini-pig.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSO2PSsEf9x4Pck9kqS7is4PpNhfARjkZrd3tBM4XdIiW5lIUSOduAXm6mefCuBgxuD7iQ&usqp=CAU"
        };
        for(int a=0;a < 3 ; a++)
            list.add(Uri.parse(urls[new Random().nextInt(urls.length)]));
        return list;
    }
}
