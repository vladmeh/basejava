package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.storage.serializer.JsonStreamSerializer;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 05.06.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class JsonPathSerializerTest extends AbstractStorageTest {

    public JsonPathSerializerTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new JsonStreamSerializer()));
    }
}