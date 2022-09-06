import java.util.Scanner;

public class BubbleSort {
	
	static void bubbleSort(int[] input_arr) {  
        int length_arr = input_arr.length;  
        int temp = 0;  
         for(int i=0; i < length_arr; i++){  
                 for(int j=1; j < (length_arr-i); j++){  
                          if(input_arr[j-1] > input_arr[j]){    
                                 temp = input_arr[j-1];  
                                 input_arr[j-1] = input_arr[j];  
                                 input_arr[j] = temp;  
                          }  
                          
                 }  
         }  
  
    } 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter No. Element in array:");
		int size = s.nextInt();
		
		int arr[] = new int[size];  
         
        for(int i=0; i < size; i++){  
                arr[i] = s.nextInt();  
        }  
        System.out.println();  
          
        bubbleSort(arr);  
         
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

	}


}