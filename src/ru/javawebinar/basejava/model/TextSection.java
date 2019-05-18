package ru.javawebinar.basejava.model;

import java.util.Objects;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 18.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class TextSection extends Section {

    private final String content;

    public TextSection(String content) {
        Objects.requireNonNull(content, "Content mast not be null");
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TextSection)) return false;

        TextSection that = (TextSection) o;

        return getContent().equals(that.getContent());

    }

    @Override
    public int hashCode() {
        return getContent().hashCode();
    }

    @Override
    public String toString() {
        return content;
    }
}
