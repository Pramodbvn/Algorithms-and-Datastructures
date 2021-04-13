
public class Increasing_Decreaing_max {
	
	public static int findMaxValue(int[] array, int low,int high) {
		if(low==high) {
			return array[low];
		}
		if(high==low+1) {
			if(array[high]>=array[low]) {
				return array[high];
			}
		}
		int mid =(low+high)/2;
		
		if((array[mid]>array[mid-1]) && (array[mid]>array[mid+1]) ) {
			return array[mid];
		}
		else if((array[mid]>array[mid-1]) && array[mid+1]>array[mid]) {
			return findMaxValue(array,mid+1,high);
		}
		else {
			return findMaxValue(array,low,mid-1);
		}
	}
		
	public static void main(String[] args) {
		int[] A = { 2,5, 6, 8, 9, 10,45,9,2,3,1};
		System.out.println(findMaxValue(A,0,A.length-1));

	}

}
