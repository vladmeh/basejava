package ru.javawebinar.basejava.storage;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 09.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public abstract class AbstractStorage implements Storage {
    int size = 0;

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public Resume[] getAll() {
//        return new Resume[0];
//    }
//
//    @Override
//    public Resume get(String uuid) {
//        return null;
//    }
//
//    @Override
//    public void clear() {
//
//    }
//
//    @Override
//    public void update(Resume r) {
//
//    }
//
//    @Override
//    public void save(Resume r) {
//
//    }
//
//    @Override
//    public void delete(String uuid) {
//
//    }
}
