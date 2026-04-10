package a01;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Integer num = leerEntero();
        System.out.print("Número introducido: " + num);
    }
    static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        Integer num = null;
        boolean valido = false;
        
        do{
            System.out.print("Introducir numero: ");
            try{
                num = sc.nextInt();
                valido = true;
            }catch(InputMismatchException e){
                System.out.println("Error.");
                sc.next();
            }
        }while(!valido);
        return num;
    }
}