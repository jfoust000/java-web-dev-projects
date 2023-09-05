package org.example;

public abstract class AbstractEntity {

    private int id;
    private int nextId = 1;

    AbstractEntity() {

        this.id = nextId;
        nextId++;

    }

    public int getId() {
        return id;
    }

}
