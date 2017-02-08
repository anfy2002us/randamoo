package com.celendi.randamoo;

/**
 * Random object generator
 * <p>
 * Useful when you need some random objects, containing utility methods for generating of all types of
 * random data.
 * </p>
 */
public final class Generator<T> {

    private Generator() {

    }

    public static <T> Generator newGeneratorFor(Class<T> clazz) {
        return new Generator<T>();
    }

    public Generator<T> ignoreInherited(boolean ignore) {
        return this;
    }

    public Generator<T> ignoreProps(String... ignored) {
        return this;
    }

    public Generator<T> setPropWith(String property, Object value) {
        return this;
    }

    public T build() {
        return null;
    }

    public ListGenerator<T> list() {
        return new ListGenerator<T>();
    }

    public SetGenerator<T> set() {
        return new SetGenerator<T>();
    }
}
