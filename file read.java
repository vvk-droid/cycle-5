import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class fileread {
    public static void main(String args[]) throws IOException {
       
   BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
    int i=1;
    String line;
    try{
    while((line = fin.readLine()) != null)
    { 
       System.out.println(i+" "+line);
       i++;
    }
}catch(IOException e){System.out.print("Error");}
   
   fin.close();
 }
}
