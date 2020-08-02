//selectionsort
import java.util.Arrays;
public class SelectionSort{
  public static void main(String[] args{
        int[] arr={10,45,35,2,5,-10,48,65};
        for(int i=arr.length-1;i>0;i--){
            int max=0;
            for(int j=0;j<i+1;j++){
              if(arr[j]>arr[max]){
                  max=j;
                 }
            }
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
         }
         System.out.println(Arrays.toString(arr));
     }
   }
