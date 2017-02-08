package com.celendi.randamoo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rado on 08-Feb-17.
 */
public class SetGenerator<T> extends CollectionGenerator<T> {

    SetGenerator() {

    }

    public SetGenerator<T> withSize(int size) {
        return this;
    }

    public SetGenerator<T> mutable(boolean mutable) {
        return this;
    }

    public Set<T> build() {
        return new HashSet<T>();
    }
}
