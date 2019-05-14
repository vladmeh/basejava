package ru.javawebinar.basejava.model;

import java.util.Objects;
import java.util.UUID;

/**
 * com.urise.webapp.model.ru.javawebinar.basejava.model.Resume class
 */
public class Resume {

    // Unique identifier
    private final String uuid;

    private final String fullName;

    public Resume(String fullName) {
        this(UUID.randomUUID().toString(), fullName);
    }

    public Resume(String uuid, String fullName) {
        Objects.requireNonNull(uuid, "Uuid mast not be null");
        Objects.requireNonNull(fullName, "FullName mast not be null");

        this.uuid = uuid;
        this.fullName = fullName;
    }

    public String getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return uuid + '(' + fullName + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Resume)) return false;

        Resume resume = (Resume) o;

        if (!getUuid().equals(resume.getUuid())) return false;
        return fullName.equals(resume.fullName);

    }

    @Override
    public int hashCode() {
        int result = getUuid().hashCode();
        result = 31 * result + fullName.hashCode();
        return result;
    }
}
