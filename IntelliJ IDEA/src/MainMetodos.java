public class MainMetodos {
    public static void main(String[] args){
        System.out.println("Main para probar metodos y variables");
        String nombre = "Borja";
        saludar(nombre);
        despedir();

    }

    public static void saludar(String data){
        System.out.println("Enhorabuena "+data+" has llamado a tu primer metodo");
    }

    public static void despedir(){
        System.out.println("Hasta luego, hemos terminado");
    }

}
