package ru.javawebinar.basejava.storage;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 29.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class PathStorageTest extends AbstractStorageTest {

    public PathStorageTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new ObjectStreamStrategy()));
    }
}