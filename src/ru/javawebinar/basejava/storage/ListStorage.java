package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 12.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ListStorage extends AbstractStorage {

    private List<Resume> list = new ArrayList<>();

    @Override
    protected Object getSearchKey(String uuid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUuid().equals(uuid)) {
                return i;
            }
        }
        return null;
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return searchKey != null;
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        list.set((Integer) searchKey, r);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        list.add(r);
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return list.get((Integer) searchKey);
    }

    @Override
    protected void doDelete(Object searchKey) {
        list.remove(((Integer) searchKey).intValue());
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Resume[] getAll() {
        return list.toArray(new Resume[0]);
    }

    @Override
    public int size() {
        return list.size();
    }
}
