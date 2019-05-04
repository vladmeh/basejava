package ru.javawebinar.basejava;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 04.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class MainString {
    public static void main(String[] args) {
        String[] strArray = new String[]{"1", "2", "3", "4", "5"};
//        String result = "";
        StringBuilder sb = new StringBuilder();
        for (String str : strArray) {
            sb.append(str).append(", ");
        }
        System.out.println(sb.toString());

        String str1 = "abc";
        String str3 = "c";
        String str2 = ("ab" + str3).intern();
        System.out.println(str1 == str2);
    }
}
