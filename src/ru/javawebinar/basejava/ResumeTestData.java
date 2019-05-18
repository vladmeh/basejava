package ru.javawebinar.basejava;

import ru.javawebinar.basejava.model.ContactType;
import ru.javawebinar.basejava.model.Resume;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 18.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class ResumeTestData {
    public static void main(String[] args) {
        Resume resume = new Resume("r1", "Test");

        resume.setContact(ContactType.PHONE, "999-222-33-11");


        System.out.println(resume.getContact(ContactType.PHONE));
    }
}
