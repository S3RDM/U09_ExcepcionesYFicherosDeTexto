package a07;
import java.io.*;

public class MainV2 {
    static final String fichero = "C:\\dam\\prog\\code\\fichero.txt";
        
    public static void main(String[] args){
        try(BufferedWriter out = new BufferedWriter(new FileWriter (fichero))){
            String linea1 = "En un lugar de La Mancha,";
            for(int i = 0; i < linea1.length(); i++){
                out.write(linea1.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e);
        }
        
        try(BufferedWriter out2 = new BufferedWriter(new FileWriter (fichero, true))){
            String linea2 = "de cuyo nombre no quiero acordarme";
            out2.newLine();
            out2.write(linea2);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}