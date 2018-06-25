package com.vladmeh.webapp.storage;

import com.vladmeh.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];

    private int size = 0;

    public void clear() {
        Arrays.fill(storage, null);
        size = 0;
    }

    public void update(Resume resume) {
        Integer k = getKey(resume.getUuid());
        if (k != null) {
            storage[k] = resume;
        } else {
            System.out.println("Резюме uuid:" + resume.getUuid() + " - не найдено.");
        }
    }

    public void save(Resume resume) {
        String uuid = resume.getUuid();

        if (getKey(uuid) == null) {
            storage[size] = resume;
            size++;
        } else {
            System.out.println("Резюме uuid:" + uuid + " - уже существует.");
        }
    }

    public Resume get(String uuid) {
        Integer k = getKey(uuid);
        if (k != null) {
            return storage[k];
        } else {
            System.out.println("Резюме uuid:" + uuid + " - не найдено.");
        }
        return null;
    }

    public void delete(String uuid) {
        Integer k = getKey(uuid);
        if (k != null) {
            storage[k] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        } else {
            System.out.println("Резюме uuid:" + uuid + " - не найдено.");
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    public int size() {
        return size;
    }

    private Integer getKey(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return null;
    }
}
