package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.storage.serializer.XmlStreamSerializer;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 05.06.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class XmlPathSerializerTest extends AbstractStorageTest {

    public XmlPathSerializerTest() {
        super(new PathStorage(STORAGE_DIR.getAbsolutePath(), new XmlStreamSerializer()));
    }
}