package com.imer1c.properties;

public class PropertyFactory<E> implements IPropertyFactory<E> {
    private final String id;

    public PropertyFactory(String id) {
        this.id = id;
    }

    public IProperty<E> create(E value) {
        return new Property<>(id, value);
    }

    @Override
    public String getId() {
        return id;
    }
}
