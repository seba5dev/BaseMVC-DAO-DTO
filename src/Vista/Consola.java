package Vista;
//Importar el paquete de scanner para entradas
import java.util.Scanner;

public class Consola {
    //Variable sc para llamar rapidamente al scanner
    private Scanner sc;

    //Constuctor
    public Consola(){
        sc = new Scanner(System.in);
    }

    //Metodo para mostrar un mensaje en consola, se debe enviar un String
    public void printMsg(String pMen){
        System.out.println(pMen);
    }
    
    //Metodo para leer String
    public String readString(String pStr){
        System.out.println(pStr);
        String str = sc.nextLine();
        return str;
    }
    
    //Metodo para leer enteros
    public int readInt(String pStr){
        int i;
        try {
            System.out.println(pStr);
            i = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("El dato ingresado no es un numero.");
            i = 0;
        }
        return i;
    }
    
    //Metodo para leer Double
    public double readDouble(String pStr){
        double d;
        try {
            System.out.println(pStr);
            d = sc.nextDouble();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("El dato ingresado no es un numero.");
            d = 0;
        }
        return d;
    }

    //Metodo para leer long
    public long readLong(String pStr){
        long l;
        try {
            System.out.println(pStr);
            l = sc.nextLong();
            sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("El dato ingresado no es un numero.");
            l = 0;
        }
        return l;
    }

    //Proximamente añadire mas lecturas para diferentes tipos de variable
}
