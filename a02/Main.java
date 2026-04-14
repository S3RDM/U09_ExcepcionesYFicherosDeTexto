package a02;
import java.io.*;

public class Main {
    static final String fichero = "C:\\dam\\prog\\code\\U07_Herencia\\src\\main\\java\\a00\\Main.java";
        
    public static void main(String[] args){
        String texto = "";
        FileReader in = null;

    try{
        in = new FileReader(fichero);
        int c = in.read();
        while (c != -1){
            texto = texto + (char) c;
            c = in.read();
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