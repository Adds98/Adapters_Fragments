package com.practice.adapters.utils;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class Convert {

    public static List<String> urisToStrings(List<Uri> uris) {
        List<String> strings = new ArrayList<>();
        uris.forEach(uri -> { strings.add(uri.toString());});
        return strings;
    }

    public static List<Uri> stringsToUris(List<String> strings) {
        List<Uri> uris = new ArrayList<>();
        strings.forEach(url -> { uris.add(Uri.parse(url));});
        return uris;
    }
}
