package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Map.Entry.comparingByKey;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 12.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

// TODO implement
// TODO create new MapStorage with search key not uuid
public class MapUuidStorage extends AbstractStorage {

    private Map<String, Resume> map = new HashMap<>();

    @Override
    protected Object getSearchKey(String uuid) {
        return uuid;
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return map.containsKey(searchKey.toString());
    }

    @Override
    protected void doUpdate(Resume r, Object searchKey) {
        map.replace(searchKey.toString(), r);
    }

    @Override
    protected void doSave(Resume r, Object searchKey) {
        map.put(searchKey.toString(), r);
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return map.get(searchKey.toString());
    }

    @Override
    protected void doDelete(Object searchKey) {
        map.remove(searchKey.toString());
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Resume[] getAll() {
        Map<String, Resume> sortedMap = map
                .entrySet()
                .stream()
                .sorted(comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e2,
                        LinkedHashMap::new)
                );

        return sortedMap.values().toArray(new Resume[0]);
    }

    @Override
    public int size() {
        return map.size();
    }
}
