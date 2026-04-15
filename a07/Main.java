package a07;
import java.io.*;

public class Main {
    static final String fichero = "C:\\dam\\prog\\code\\fichero.txt";
        
    public static void main(String[] args){
        BufferedWriter out = null;

        try{
            out = new BufferedWriter(new FileWriter(fichero));
            String linea1 = "En un lugar de La Mancha,";
            String linea2 = "de cuyo nombre no quiero acordarme";
            for(int i = 0; i < linea1.length(); i++){
                out.write(linea1.charAt(i));
            }
            out.newLine();
            out.write(linea2);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if(out != null){
                try{
                    out.close();
                }catch(IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}