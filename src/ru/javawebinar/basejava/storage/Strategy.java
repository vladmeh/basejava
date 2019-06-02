package ru.javawebinar.basejava.storage;

import ru.javawebinar.basejava.model.Resume;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 02.06.2019.
 * @link https://github.com/vladmeh/basejava
 */

public interface Strategy {
    void doWrite(Resume r, OutputStream os) throws IOException;

    Resume doRead(InputStream is) throws IOException;
}
