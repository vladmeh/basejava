package ru.javawebinar.basejava.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 18.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class Organization {

    private final Link link;

    private final LocalDate startDate;
    private final LocalDate endDate;
    private final String title;
    private final String description;


    public Organization(String name, String url, LocalDate startDate, LocalDate endDate, String title, String description) {
        Objects.requireNonNull(startDate, "StartDate mast not be null");
        Objects.requireNonNull(endDate, "EndDate mast not be null");
        Objects.requireNonNull(title, "Title mast not be null");

        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.description = description;

        this.link = new Link(name, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Organization)) return false;

        Organization that = (Organization) o;

        if (!startDate.equals(that.startDate)) return false;
        if (!endDate.equals(that.endDate)) return false;
        if (!title.equals(that.title)) return false;
        return Objects.equals(description, that.description);

    }

    @Override
    public int hashCode() {
        int result = startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "link=" + link +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
