import java.util.Scanner;

public class Default {

	public static void main(String[] args) {
		int n,SearchElement;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please give the array size: ");
		
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Please give the array element: ");
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		
		BubbleSort bs = new BubbleSort(arr);
		
//		
//		for(int i=0;i<n;i++){
//			System.out.println(arr[i]+ " ");
//		}

		
		System.out.println("Please give the searching element: ");
		
		SearchElement = sc.nextInt();
		
		
		BinarySearch BSearch = new BinarySearch(arr, SearchElement);
		
		
		
		
	}

}
