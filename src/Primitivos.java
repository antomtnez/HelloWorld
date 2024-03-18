public class Primitivos {
    public static void main(String[] args) {

        byte numberByte = 127;
        System.out.println(numberByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor maximo de un byte " + Byte.MIN_VALUE);

        short numberShort = 32767;
        System.out.println(numberShort);
        System.out.println("Tipo byte corresponde en short a " + Short.BYTES);
        System.out.println("Tipo byte corresponde en short a " + Short.SIZE);
        System.out.println("Valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor maximo de un short " + Short.MIN_VALUE);

        int numberInt = 2147483647;
        System.out.println(numberInt);
        System.out.println("Tipo byte corresponde en int a " + Integer.BYTES);
        System.out.println("Tipo byte corresponde en int a " + Integer.SIZE);
        System.out.println("Valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor maximo de un int " + Integer.MIN_VALUE);

        long numberLong = 9223372036854775807L;
        System.out.println(numberLong);
        System.out.println("Tipo byte corresponde en long a " + Long.BYTES);
        System.out.println("Tipo byte corresponde en long a " + Long.SIZE);
        System.out.println("Valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("Valor maximo de un long " + Long.MIN_VALUE);

        var numberVar = 32767;
    }
}
