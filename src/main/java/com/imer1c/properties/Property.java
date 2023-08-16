package com.imer1c.properties;

public class Property<E> implements IProperty<E>{
    private final String id;
    private final E value;

    public Property(String id, E value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String formatAsGet() {
        String value = this.value instanceof Enum<?> ? String.valueOf(((Enum<?>) this.value).ordinal()) : this.value.toString();

        return String.format("%s=%s", id, value);
    }

    @Override
    public String getId() {
        return id;
    }
}
