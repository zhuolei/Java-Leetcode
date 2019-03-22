package com.mercury.interview;

public class A {
    String constant;

    public int hashcode() {
        return constant.hashCode();
    }

    public boolean equal(Object o) {
        if (o instanceof A) {
            return o.hashCode() == hashcode();
        }
        return false;
    }
}
