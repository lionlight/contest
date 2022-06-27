package com.lionlight.algorithms;

import java.util.Scanner;

public class RLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(rle(string));
    }
    private static String rle(String s) {
        char lastSym = s.charAt(0);
        int lastPos = 0;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != lastSym) {
                ans.append(pack(lastSym, i - lastPos));
                lastPos = i;
                lastSym = s.charAt(i);
            }
        }

        ans.append(pack(s.charAt(lastPos), s.length() - lastPos));
        return ans.toString();
    }

    public static String pack(char ch, int cnt) {
        if (cnt > 1) {
            return ch + "" + cnt;
        } else return String.valueOf(ch);
    }
}
