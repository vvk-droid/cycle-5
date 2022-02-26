import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileintsum {
    public static void main(String args[]) throws IOException {
       
   
       
        BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
         int sum =0;
         String line;
         try{
         while((line = fin.readLine()) != null)
         { 
           String Words[] = line.split(" ");
           for(String str : Words)
            sum = sum + Integer.parseInt(str);

           
           
         }
         }catch(IOException e){System.out.print("Error");}
         System.out.println("The Sum is "+ sum);
        fin.close();
      }
     }
     
