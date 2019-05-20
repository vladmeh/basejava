package ru.javawebinar.basejava.exception;

import java.io.IOException;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 04.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class StorageException extends RuntimeException {
    private final String uuid;

    public StorageException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }

    public StorageException(String message, String uuid, IOException e) {
        super(message, e);
        this.uuid = uuid;
    }

    public String getUuid() {
        return uuid;
    }
}
