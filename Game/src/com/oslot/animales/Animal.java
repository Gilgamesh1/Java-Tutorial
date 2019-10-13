package com.oslot.animales;

import java.io.File;
import java.io.IOException;

public class Animal {
    public void eat() {
        System.out.println("Generic eat");
    }

    protected void privado() {
        System.out.println("metodo de animal protegido");
    }

    public void  archivos()throws IOException {
        File file=new File("C:\\a.txt");

    }
}
