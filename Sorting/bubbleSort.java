//bubblesort
import java.util.Arrays;
public class BubbleSort{
  public static void main(String[] args){
    int[] array ={2,1,17,3,100,55,23,1,85};
    for(int i=array.length-1;i>0;i--){
      for(int j=0;j<i;j++){
        if(array[j]>array[j+1]){
          swap(array,j,j+1)
        }
      }
    }
    System.out.println(Arrays.toString(array);
  public static void swap(int[] array, int a, int b){
    temp=array[a];
    array[a]=array[b];
    array[b]=temp;
  }
                       }

    
    
