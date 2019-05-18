package ru.javawebinar.basejava.model;

import java.util.Objects;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 18.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class Link {
    private final String name;
    private final String url;

    public Link(String name, String url) {
        Objects.requireNonNull(name, "Name mast not be null");
        Objects.requireNonNull(url, "Url mast not be null");
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Link)) return false;

        Link link = (Link) o;

        if (!getName().equals(link.getName())) return false;
        return getUrl().equals(link.getUrl());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getUrl().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Link(" + name + ',' + url + ')';
    }
}
