package ru.javawebinar.basejava.model;

import java.util.List;
import java.util.Objects;

/**
 * @author Vladimir Mikhaylov <vladmeh@gmail.com> on 18.05.2019.
 * @link https://github.com/vladmeh/basejava
 */

public class OrganizationSection extends Section {

    private final List<Organization> organizations;

    public OrganizationSection(List<Organization> organizations) {
        Objects.requireNonNull(organizations, "Organizations mast not be null");
        this.organizations = organizations;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrganizationSection)) return false;

        OrganizationSection that = (OrganizationSection) o;

        return getOrganizations().equals(that.getOrganizations());

    }

    @Override
    public int hashCode() {
        return getOrganizations().hashCode();
    }
}
