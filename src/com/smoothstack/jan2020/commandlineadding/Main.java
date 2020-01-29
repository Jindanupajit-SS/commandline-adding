package com.smoothstack.jan2020.commandlineadding;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.printf("Calculate %s\n", String.join(" + ", args));

        try {
            System.out.printf("The total is %s.\n\n", Objects.requireNonNull(StringUtils.sumStringArray(args)));
        } catch (NullPointerException e) {
            System.err.println("Could not parse all arguments as numbers.");
        }
    }

}
