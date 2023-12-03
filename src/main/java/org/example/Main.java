package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> idollist = new ArrayList<String>();
        idollist.add("AKB48");
        idollist.add("乃木坂46");
        idollist.add("Perfume");
        idollist.add("モーニング娘");

        idollist.forEach(System.out::println);


    }
}
