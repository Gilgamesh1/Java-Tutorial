package com.oslot.animales;

import java.sql.SQLException;

public class Horse extends Animal {

    public void eat() {
        System.out.println("Horse eating hay,aots and horse treats");
    }

    public void buck() {
        System.out.println("buck");
    }

    public void privado() {
        System.out.println("metodo sobre escrito de privado de animal");
    }

    public void archivos()throws SQLException {

    }
}
