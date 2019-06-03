package ru.javawebinar.basejava.storage.serializer;

import ru.javawebinar.basejava.model.Resume;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 03.06.2019.
 * @link https://github.com/vladmeh/basejava
 */

public interface StreamSerializer {

    void doWrite(Resume r, OutputStream file) throws IOException;

    Resume doRead(InputStream file) throws IOException;

}
