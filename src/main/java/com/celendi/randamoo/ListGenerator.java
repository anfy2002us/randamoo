package com.celendi.randamoo;

import java.util.List;

/**
 * Created by rado on 08-Feb-17.
 */
public class ListGenerator<T> extends CollectionGenerator<T> {

    ListGenerator() {

    }

    public ListGenerator<T> size(int size) {
        return this;
    }

    public List<T> build() {
        return null;
    }
}
