package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.storage.serializer.ObjectStreamSerializer;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 28.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ObjectFileStorageTest extends AbstractStorageTest {

    public ObjectFileStorageTest() {
        super(new FileStorage(STORAGE_DIR, new ObjectStreamSerializer()));
    }
}