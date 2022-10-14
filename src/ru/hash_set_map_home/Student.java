package ru.hash_set_map_home;

import java.util.*;

public class Student {

    private final Integer id;
    private String[] group = new String[2];


    private static final Map<Integer, List<String>> db = new HashMap<>();

    public Student(Integer id, String name, String group) {
        this.id = id;
        this.group = new String[]{
                name,
                group
        };
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        return obj instanceof Map.Entry<?, ?> e
                && Objects.equals(this.id, e.getKey())
                && Objects.equals(this.group[0], e.getValue())
                && Objects.equals(this.group[1], e.getValue());
    }
}

