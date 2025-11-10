package com.practice.wrapperclasses;

public class CompareExample {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 200;

        if (a < b) {
            System.out.println(a + " is less than " + b);
        }

        // Safe object comparison
        System.out.println("Equal? " + a.equals(b)); // false

        // Wrong way – identity check (may return false even if values are same)
        Integer x = 127;
        Integer y = 127;
        System.out.println("x == y? " + (x == y)); // true (cached)

        Integer m = 128;
        Integer n = 128;
        System.out.println("m == n? " + (m == n)); // false (not cached)
    }
}

