package com.oslot.animales;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Horse();
        a.eat();
        b.eat();
         //b.buck();
        a.privado();
        b.privado();
    }
}
