
public class BinarySearch {
	
	BinarySearch(int arr[], int SearchElement){
		int size = arr.length;
		
		int left = 0, right = size-1, mid;
		boolean check = true;
		
		while(left<=right){
			//mid = left + (right - left)/2;
			mid=(left+right)>>1;
			
			//System.out.println(left + " " +right);

			if(arr[mid] == SearchElement){
				System.out.println("Item found and position is " +mid);
				check = false;
				break;
			}
			
			if(SearchElement < arr[mid]){
				right = mid-1;
				
			}
			else if(SearchElement > arr[mid]){
				left = mid+1;
			}
			
		}
		
		
		if(check){
			System.out.println("Item not found");
			
		}
		
	}
}
