package a03;
import java.io.*;

public class Main {
    static final String fichero = "C:\\dam\\prog\\code\\U07_Herencia\\src\\main\\java\\a00\\Main.java";
        
    public static void main(String[] args){
        String texto = "";
        BufferedReader in = null;

    try{
        in = new BufferedReader(new FileReader(fichero));
        String linea = in.readLine();
        while(linea != null){
            texto = texto + linea + '\n';
            linea = in.readLine();
        }
    }catch(IOException e){
        System.out.println(e.getMessage());
    }finally{
        if(in != null){
            try{
                in.close();
            }catch(IOException e){
                System.out.println(e);
            }
        }
    }
    System.out.println(texto);
    }
}