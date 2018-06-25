package com.vladmeh.webapp.storage;

import com.vladmeh.webapp.model.Resume;

import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    private Resume[] storage = new Resume[10000];

    public void clear() {
        Arrays.fill(storage, null);
    }

    public void save(Resume resume) {
        for (int i = 0; i < size(); i++) {
            if (storage[i] == null) {
                storage[i] = resume;
                break;
            }
        }
    }

    public Resume get(String uuid) {
        Resume resume = new Resume();
        try {
            resume = Arrays.stream(storage).filter(r -> r.getUuid().equals(uuid)).findFirst().get();
        } catch (NullPointerException e) {
            System.out.println("Резюме uuid:"+ uuid + " - не найдено.");
        }
        return resume;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (storage[i].getUuid().equals(uuid)){
                storage[i] = null;
                break;
            }
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        return Arrays.stream(storage)
                .filter(s -> (s != null))
                .toArray(Resume[]::new);
    }

    public int size() {
        return storage.length;
    }
}
