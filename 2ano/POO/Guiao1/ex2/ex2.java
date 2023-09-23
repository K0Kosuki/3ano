import java.util.*;


public class ex2{
    public static void main(String []args)
    {
           
          
           int array[] = {23,432,52,42,1,7,5,1};
            int max=array[0];
           int min=array[0];
        //*Scanner input = new Scanner(System.in);
            System.out.println(array[0]);
             System.out.println(array[1]);
             System.out.println(array[2]);
             System.out.println(array[3]);
             System.out.println(array[4]);
             System.out.println(array[5]);
             
             for(int i=0;i<array.length;i++)
             {
                if(array[i]>max)
                {
                     max = array[i];
                }
             
            }
             for(int j:array) //: each 
             {
                if(j<min)
                {
                     min = j;
                }
             
            }
            System.out.println("max: "+ max);
            System.out.println("min: "+ min);
            
    int soma = 0;
    int media= 0;
    for(int k:array){
    soma += k;
    
    }
    media = soma/array.length;
     System.out.println("media: "+ media);
     
     int mediana= soma/2;
          System.out.println("mediana: "+ mediana);
          ///////valores distindos
          int aux[]= new int[array.length];
          int freq[]= new int[array.length];
          int index = 0;
          
          for(int y:array){
              int z= 0;
              while(z< index && aux[z] != y)
              z++;
              
              if(z >= index){
              aux[index++] = y;
            }
            else
              freq[z]++;
          
          
      }
        System.out.println("valor diferentes: "+ index);
        
        int imax = freq[0];
        for(int i=0; i<index;i++){
           if(freq[i]>freq[imax]){
               imax = i;
            } 
        }
         System.out.println("Modo: "+aux[imax]);
        
    }
}
