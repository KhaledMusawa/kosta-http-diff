package com.github.konstantinevashalomidze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KHttpDiff {

    public static void main(String[] args) {
        System.out.println("khttpdiff starting...");
        new KHttpDiff().run(args);
    }

    private void run(String[] args) {
        Map<String, String> options = new HashMap<>();
        List<String> urls = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) {
                String key = args[i].replaceFirst("^-+", ""); // Remove leading dashes
                if (i + 1 < args.length && !args[i + 1].startsWith("-")) {
                    options.put(key, args[++i]);
                } else {
                    options.put(key, "true");
                }
            } else {
                urls.add(args[i]);
            }
        }

        if (urls.size() != 2) {
            System.err.println("Error: Exactly two URLs are required");
            System.err.println("Usage: khttpdiff [options] url1 url2");
            System.exit(2);
        }


        System.out.println("Options: " + options);
        System.out.println("Urls: " + urls);
    }



}