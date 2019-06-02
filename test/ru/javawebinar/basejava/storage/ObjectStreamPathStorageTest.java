package ru.javawebinar.basejava.storage;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 28.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ObjectStreamPathStorageTest extends AbstractStorageTest {

    public ObjectStreamPathStorageTest() {
        super(new ObjectStreamPathStorage(STORAGE_DIR.getAbsolutePath()));
    }
}