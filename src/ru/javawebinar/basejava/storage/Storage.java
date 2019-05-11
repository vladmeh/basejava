package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public interface Storage {

    int size();

    Resume[] getAll();

    Resume get(String uuid);

    void clear();

    void update(Resume r);

    void save(Resume r);

    void delete(String uuid);
}
