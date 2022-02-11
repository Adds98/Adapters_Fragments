package com.practice.adapters.model.mock;

import com.practice.adapters.model.User;

import java.util.Random;
import java.util.UUID;

public class MockUser {
    static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

    public static User getRandom(){

        return new User(UUID.randomUUID().toString(), getRandomName(), getRandomEmail());
    }

    private static String getRandomEmail() {

        return String.format("%s@%s.com", getRandomName(), getDomain());
    }

    private static Object getDomain() {
        String[] domain = new String[]{"hotmail","gmail","outlook"};
        return domain[new Random().nextInt(domain.length)];
    }

    private static String getRandomName() {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < new Random().nextInt(5)+5; i++)
            builder.append(letters.charAt(new Random().nextInt(letters.length())));
        return builder.toString();
    }
}
