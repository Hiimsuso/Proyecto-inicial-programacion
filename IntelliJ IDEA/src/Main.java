public class Main {
    //esto es un comentario
    // TODO me falta esto
    int edadGlobal = 12;
    public static void main(String[] args){ //Esto es un método
        System.out.println("Este es mi primer programa en Java");
        String miNombre; // null
        // String miNombre = "Borja"; // da error
        miNombre = "Borja"; //Esto es correcto porque no redfinimos, solo añadimos un valor
        System.out.println("Mi nombre es: "+miNombre);
        miNombre = "Jesús";
        System.out.println("Mi nombre es: "+miNombre);
        char letraDNI = 'z'; //entre comillas simples
        System.out.println("La letra de mi dni es: "+letraDNI);
        letraDNI = 109; //Me deja igualarlo a un número porque lo saca de ASCI pero va sin comillas
        System.out.println("La letra de mi dni es: "+letraDNI);
        int edad = 33; // número sin decimales
        System.out.println("Mi edad es: "+edad);
        edad++; //sumamos 1 a edad
        System.out.println("Mi edad es: "+edad);
        double altura = 1.850123139; // puede guardar muchos decimales
        System.out.println("Mi altura es: "+altura+" cm");
        float peso = 98.7f;
        System.out.println("Mi peso es: "+peso+" kg");
        boolean experiencia = true;
        System.out.println("Tengo experiencia en java es: "+experiencia);
        experiencia = false;
        System.out.println("Tengo experiencia en java es: "+experiencia);
        // Character compleja, char primitiva
        // Integer compleja, int primitiva
        // Double compleja, double primitiva
        // Float compleja, float primitiva
        // Boolean compleja, boolean primitiva
        // Las complejas usan más memoria. Son clases envolventes y usan más memoria pero tienen funcionalidades
        // Cualquier variables primitiva tiene su envolvente
        // En java existe una clase padre llamada Object, que es el método más genérico y puede guardar cualquier tipo de dato
        // El método principal es el método main y puedes llamar otros métodos desde dentro.
        Integer edadCompleja = 12;
        edadCompleja.intValue();
        edadCompleja.toString();

        Object numeroGenerico = 6;
        numeroGenerico.toString();

        final String DNI = "73591253Q"; // final sirve para asignar valor constante a una variable y se escribe como PALABRA_MAYUSCULA
        System.out.println("Mi DNI es: "+DNI);

        System.out.println("El valor del número PI es: "+Math.PI); // Hay constantes matematicas ya guardadas en la libreria Math
        Integer numero = 1;
        System.out.println("El valor maximo de un int es: "+Integer.MAX_VALUE);

        System.out.print("miNombre es de tipo: "+miNombre.getClass().getName());
    }
    public void nombreMetodo(){
        int edadMetodo = 12;
        int edadGlobal = 123412421;
        System.out.println(edadMetodo);
        System.out.println(edadGlobal); //lamará la edadGlobal local de bloque, no la global
        System.out.println(this.edadGlobal); //lamará la edadGlobal global,porque señalas con this a la global
    }

    public void nombreMetodo1(){
        // System.out.println(edadMetodo);  edadMetodo es una variable local, no va a dejar ejecutar
        System.out.println(edadGlobal);
    }
}
