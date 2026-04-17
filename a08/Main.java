package a08;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        String texto = "";
        
        try(BufferedReader in = new BufferedReader(new FileReader("fichero.txt"));){
            String linea = in.readLine();
            while(linea != null){
                texto = texto + linea + '\n';
                linea = in.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre de archivo: ");
        String fic = sc.nextLine();

        try(BufferedWriter out = new BufferedWriter(new FileWriter ("copia_de_" + fic + ".txt"))){
            String text = texto;
            out.write(text);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}