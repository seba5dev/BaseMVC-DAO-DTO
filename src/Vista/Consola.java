package Vista;

import java.util.Scanner;

public class Consola {
    private Scanner sc;

    public Consola(){
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String pMen){
        System.out.println(pMen);
    }

    public int leerEntero(String pStr){
        System.out.println(pStr);
        int num = sc.nextInt();
        sc.nextLine();
        return num;
    }

    public String leerString(String pStr){
        System.out.println(pStr);
        String str = sc.nextLine();
        return str;
    }

    public double leerDouble(String pStr){
        System.out.println(pStr);
        double d = sc.nextDouble();
        sc.nextLine();
        return d;
    }

    public long leerLong(String pStr){
        System.out.println(pStr);
        long l = sc.nextLong();
        sc.nextLine();
        return l;
    }
}
