package ru.javawebinar.basejava.exception;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 04.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ExistStorageException extends StorageException {

    public ExistStorageException(String uuid) {
        super("Resume " + uuid + " already exist", uuid);
    }
}
