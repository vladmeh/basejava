package ru.javawebinar.basejava.storage;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 28.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class FileStorageTest extends AbstractStorageTest {

    public FileStorageTest() {
        super(new FileStorage(STORAGE_DIR, new ObjectStreamStrategy()));
    }
}