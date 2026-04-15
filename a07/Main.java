package a07;
import java.io.*;

public class Main {
    static final String fichero = "C:\\dam\\prog\\code\\fichero.txt";
        
    public static void main(String[] args){
        BufferedWriter out = null;
        BufferedWriter out2 = null;
        try{
            out = new BufferedWriter(new FileWriter (fichero));
            out2 = new BufferedWriter(new FileWriter (fichero, true));
            String linea1 = "En un lugar de La Mancha,";
            String linea2 = "de cuyo nombre no quiero acordarme";
            
            for(int i = 0; i < linea1.length(); i++){
                out.write(linea1.charAt(i));
            }
            out2.newLine();
            out2.write(linea2);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if(out != null){
                try{
                    out.close();
                    out2.close();
                }catch(IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}