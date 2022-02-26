import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class filedisplay {
    public static void main(String args[]) throws IOException {
       
        BufferedReader fin = new BufferedReader(new FileReader("input.txt"));
         int countline = 0,countchar=0,countwords=0;
         String line;
         try{
         
  
        
        while((line = fin.readLine()) != null)
         { 
           countline++;
           String word[] = line.split(" ");
           countwords = countwords + word.length;
           for(int i =0; i<line.length();i++)
           {
               if(line.charAt(i)!=' ')
                countchar++;
           
           }

        
         }
        


            
         
     }catch(IOException e){System.out.print("Error");}
        System.out.println("Number of Words : "+countwords);
        System.out.println("Number of Charachter : "+countchar);
        System.out.println("Number of Lines : "+countline);
        fin.close();
      }
     }
     
