package ru.javawebinar.basejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 20.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class MainFile {
    public static void main(String[] args) {
        String filePath = ".\\.gitignore";

        File file = new File(filePath);
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            throw new RuntimeException("Error", e);
        }

        File dir = new File("./src/ru/javawebinar/basejava");
        System.out.println(dir.isDirectory());
        String[] list = dir.list();
        if (list != null) {
            for (String name : list) {
                System.out.println(name);
            }
        }

        try (FileInputStream fis = new FileInputStream(filePath)) {
            System.out.println(fis.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        printDirectoryDeeply(dir, 0);
    }

    // TODO: make pretty output
    private static void printDirectoryDeeply(File dir, int level) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                for (int i = 0; i < level; i++)
                    System.out.print("\t");

                if (file.isFile()) {
                    System.out.println("File: " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getName());
                    printDirectoryDeeply(file, level +1);
                }
            }
        }
    }
}
