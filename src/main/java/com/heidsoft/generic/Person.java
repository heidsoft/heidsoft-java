package com.heidsoft.generic;

/**
 * 这是一个泛型
 * @param <T>
 */
public class Person<T> {
    public T fistName;
    public T lastName;

    public Person(){
        this.fistName = null;
        this.lastName = null;
    }

    public Person(T fistName, T lastName){
        this.fistName = fistName;
        this.lastName = lastName;
    }

    public T getFistName() {
        return fistName;
    }

    public void setFistName(T fistName) {
        this.fistName = fistName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }
}
