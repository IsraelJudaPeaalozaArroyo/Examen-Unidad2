package exa2;
import java.util.*;
public class Exa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] arreglo=new int[10];
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0; i< arreglo.length; i++){
            System.out.println("Ingresa el numero: ");
            arreglo[i]=sc.nextInt();
    }
        
        for(int e=0;e<arreglo.length; e++){
           if(arreglo[e]%2==0){
               System.out.println(arreglo[e]);
           }
           else if(arreglo[e]%2!=0){
               System.out.println(arreglo[e]);
           }
        }
     
    }
    
    
                    
  
}
