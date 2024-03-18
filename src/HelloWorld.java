public class HelloWorld {
    public static void main(String[] args){

        int number = 10;
        boolean isSended = false;

        String name = "AntoMtnez";
        String saludo = "Hola mundo desde Java";

        System.out.println(saludo);
        System.out.println("Soy " + name.toUpperCase() + ", tu creador");

        if(isSended){
            System.out.println(number + 5);
            isSended = true;
        }else{
            System.out.println(number);
        }
    }
}
