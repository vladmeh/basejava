package ru.javawebinar.basejava.storage;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 28.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ObjectStreamStorageTest extends AbstractStorageTest {

    public ObjectStreamStorageTest() {
        super(new ObjectStreamStorage(STORAGE_DIR));
    }
}