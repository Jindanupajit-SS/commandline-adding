package com.smoothstack.jan2020.commandlineadding;

import java.math.BigDecimal;

public class StringUtils {

    public static BigDecimal parseBigDecimal(final String s) {

        return new BigDecimal(s);
    }

    public static String sumStringArray(final String[] strings) {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (String arg : strings) {
            try {
                bigDecimal = bigDecimal.add(StringUtils.parseBigDecimal(arg));
            } catch (NumberFormatException|NullPointerException e) {
                return null;
            }
        }

        return bigDecimal.toString();
    }
}
