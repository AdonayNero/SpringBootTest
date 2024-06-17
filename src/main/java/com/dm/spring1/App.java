package com.dm.spring1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

/**
 * Hello world!
 */
public final class App {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // registrar los fichero de anotaciones que son de consiguracion con component
        //scan
        context.register(App.class);

        //refresa el contenido
        context.refresh();

        //invoca el bean
        HolaService miService = context.getBean(HolaService.class);
        System.out.println(miService.mensaje());
        context.close();
    }
}
