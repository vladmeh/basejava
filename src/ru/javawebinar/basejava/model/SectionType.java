package ru.javawebinar.basejava.model;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 17.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public enum SectionType {
    PERSONAL("Личные качества"),
    OBJECTIVE("Позиция"),
    ACHIEVEMENT("Достижения"),
    QUALIFICATIONS("Квалификация"),
    EXPERIENCE("Опыт работы"),
    EDUCATION("Образование");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
