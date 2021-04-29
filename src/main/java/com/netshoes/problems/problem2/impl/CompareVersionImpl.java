package com.netshoes.problems.problem2.impl;

// Nao alterar o nome dessa classe!
public class CompareVersionImpl {

    // Nao alterar a assinatura desse metodo
    public static int compareVersion(String version1, String version2) {
        double n1 = toNumeric(version1);
        double n2 = toNumeric(version2);


        return Double.compare(n1, n2);
    }

    private static double toNumeric(String version) {
        double value = 0;
        double q = 1;
        String[] split = version.split("\\.");

        for (String s : split) {
            Integer i = Integer.valueOf(s);
            value = value + (i * q);
            q = q / 100;
        }
        return value;
    }
}
