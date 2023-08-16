package com.imer1c.properties;

public interface IPropertyFactory<E> {
    IProperty<E> create(E value);

    String getId();

    static<T> IPropertyFactory<T> createFactory(String id) {
        return new PropertyFactory<>(id);
    }
}
