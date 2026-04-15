package a04;
import java.io.*;

public class Main {
    static final String fichero = "C:\\dam\\prog\\code\\NumerosReales.txt";
    
    public static void main(String[] args){
        String texto = "";
        BufferedReader in = null;
        double suma = 0;
        int cont = 0;
        
        try{
            in = new BufferedReader(new FileReader(fichero));
            String linea = in.readLine();
            if(linea != null){
                String[] numeros = linea.split(" ");
                for(String num : numeros){
                    double valor = Double.valueOf(num);
                    suma += valor;
                    cont++;
                }
            }
            in.close();
            double media = (cont > 0) ? suma / cont : 0;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if(in != null){
                try{
                    in.close();
                }catch(IOException e){
                    System.out.println(e);
                }
            }
        }
    }
}