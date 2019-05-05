package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.Resume;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 05.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class MainReflection {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Resume r = new Resume();

        Field field = r.getClass().getDeclaredFields()[0];
        field.setAccessible(true);
        System.out.println(field.getName());
        System.out.println(field.get(r));
        field.set(r, "new_uuid");

        Method method = r.getClass().getMethod("toString");
        System.out.println(method.invoke(r));
        // TODO : invoke r.toString via reflection
        System.out.println(r);
    }
}
