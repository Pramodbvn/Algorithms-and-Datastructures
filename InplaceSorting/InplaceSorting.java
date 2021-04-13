import java.util.Arrays;

public class InplaceSorting {

	public static void main(String[] args) {
		int[] A= {0,2,1,2,2,0,1,0,0,0,0,2,0,2,1,1,1,0,2,1,0,2};
		int low=0;
		int mid=0;
		int high=A.length-1;
		
		while(mid<=high) {
			if(A[mid]==0) {
				swap(A,low,mid);
				low++;
				mid++;
				
			}
			if(A[mid]==1) {
				mid++;
	
			}
			if(A[mid]==2) {
				swap(A,mid,high);
				high--;
				
			}
		}
		
		System.out.println(Arrays.toString(A));
		
	}
	
	public static void swap(int[] array,int i, int j) {
			int temp =array[i];
			array[i]=array[j];
			array[j]=temp;
	}

}
