package a01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    leerEntero();
    }
    static void leerEntero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir numero: ");
        try{
            int num = sc.nextInt();
        }catch(Exception e){
            System.out.print("Error");
        }
    }
}
