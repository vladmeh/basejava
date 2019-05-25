package ru.javawebinar.basejava.util;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 19.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class DateUtil {
    public static final LocalDate NOW = LocalDate.of(3000, 1, 1);

    public static LocalDate of(int year, Month month) {
        return LocalDate.of(year, month, 1);
    }
}
