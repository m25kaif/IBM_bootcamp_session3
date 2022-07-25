// WAP to find smallest and largest element in an array

public class Main
{   
  
	public static void main(String[] args) {
	    int[] arr={5,47,7,2};
	    int smallest=arr[0];
      int largest=arr[0];
      for(int i=0;i<arr.length;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            else if (arr[i]<smallest){
                smallest=arr[i];
            }
       }
       System.out.println("Smallest number is :"+smallest);
       System.out.println("largest number is :"+largest);
		
	}
}
