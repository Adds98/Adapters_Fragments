package com.practice.adapters.model;

import java.util.Objects;

public class Sex {
    private String name;

    public Sex() {
    }

    public Sex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sex)) return false;
        Sex sex = (Sex) o;
        return Objects.equals(name, sex.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
