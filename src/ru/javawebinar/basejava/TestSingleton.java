package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.SectionType;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 17.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class TestSingleton {
    private static TestSingleton instance;

    private TestSingleton() {
    }

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        TestSingleton.getInstance().toString();
        Singleton instance = Singleton.valueOf("INSTANCE");
        System.out.println(instance);
        System.out.println(instance.ordinal());

        for (SectionType type : SectionType.values()) {
            System.out.println(type.getTitle());
        }
    }

    public enum Singleton {
        INSTANCE
    }
}
