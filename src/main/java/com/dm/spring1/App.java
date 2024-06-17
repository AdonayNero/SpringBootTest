package com.dm.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 */

public  class App {

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // registrar los fichero de anotaciones que son de consiguracion con component
        //scan
        context.register(SpringConfigurador.class);

        //refresa el contenido
        context.refresh();

        //invoca el bean
        HolaService miService = context.getBean(HolaService.class);
        System.out.println(miService.mensaje());
        context.close();
    }
}
