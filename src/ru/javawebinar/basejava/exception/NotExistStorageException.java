package ru.javawebinar.basejava.exception;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 04.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class NotExistStorageException extends StorageException {
    public NotExistStorageException(String uuid) {
        super("Resume " + uuid + " not exist", uuid);
    }
}
