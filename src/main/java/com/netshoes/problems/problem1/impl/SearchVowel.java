package com.netshoes.problems.problem1.impl;

import com.netshoes.problems.problem1.api.Stream;

import java.util.ArrayList;
import java.util.HashMap;

// NAO RENOMEAR ESSA CLASSE!
public class SearchVowel {

    // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    // NAO ALTERAR ESSA ASSINATURA!
    public static char firstChar(Stream input) {
        ArrayList<Character> solutionsStack = new ArrayList<>();
        HashMap<Character, Integer> charsCountMap = new HashMap<>();

        char cm2 = 0;
        char cm1 = 0;
        char cm0 = 0;

        while (input.hasNext()) {
            char next = input.getNext();

            cm2 = cm1;
            cm1 = cm0;
            cm0 = next;

            if (isVowel(next)) {
                Integer count = charsCountMap.computeIfAbsent(next, character -> 0);
                charsCountMap.put(next, count + 1);
            }

            if (isVowel(cm2) && isConsonant(cm1) && isVowel(cm0)) {
                solutionsStack.add(cm0);
            }

        }

        for (Character solution : solutionsStack) {
            if (charsCountMap.get(solution) <= 1) {
                return solution;
            }
        }


        return '0';
    }

    public static boolean isVowel(Character c) {
        String s = c.toString();
        return s.matches("[aeiouAEIOU]");
    }

    public static boolean isConsonant(Character c) {
        String s = c.toString();
        return s.matches("[a-zA-Z]") && !s.matches("[aeiouAEIOU]");
    }

}
