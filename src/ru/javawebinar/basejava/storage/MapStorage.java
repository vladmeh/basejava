package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.exception.ExistStorageException;
import ru.javawebinar.basejava.exception.NotExistStorageException;
import ru.javawebinar.basejava.model.Resume;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 10.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class MapStorage extends AbstractStorage {

    Map<String, Resume> storage = new HashMap<>();


    @Override
    public Resume[] getAll() {
        return storage.values().toArray(new Resume[0]);
    }

    @Override
    public Resume get(String uuid) {
        Resume r = storage.get(uuid);
        if (null == storage.get(uuid)) {
            throw new NotExistStorageException(uuid);
        }
        return r;
    }

    @Override
    public void clear() {
        storage.clear();
        size = storage.size();
    }

    @Override
    public void update(Resume r) {
        storage.replace(r.getUuid(), r);
    }

    @Override
    public void save(Resume r) {
        if (storage.get(r.getUuid()) != null)
            throw new ExistStorageException(r.getUuid());

        storage.put(r.getUuid(), r);
        size = storage.size();
    }

    @Override
    public void delete(String uuid) {
        if (storage.get(uuid) == null)
            throw new NotExistStorageException(uuid);

        storage.remove(uuid);
        size = storage.size();
    }
}
