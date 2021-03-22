package com.example.regax;

import com.example.util.PrintUtil;

public class Regex {

    public static void main(String[] args) {
        validate("数値のみ", "[0-9]+", "123", "5万");
        validate("1~5文字", ".{1,5}", "", "a", "abcde", "abcdef");
        validate("元号", "(大正|昭和|平成|令和)", "平成", "平成生まれ");
    }

    private static void validate(String description, String regex, String... strList) {
        PrintUtil.println(description + " / " + regex);
        for (String s : strList) {
            PrintUtil.println("> " + s + ": " + s.matches(regex));
        }
        PrintUtil.println();
    }

}
