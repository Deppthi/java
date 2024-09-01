import java.util.Scanner;
public  class binarysearch
{
	static void binarySearch(int arr[], int first, int last, int value)
{
 int mid=(first + last)/2;
 while(first<=last){
    if(arr[mid]<value){
        first= mid+1;
    }
    else if(arr[mid]==value){
        System.out.println("element found at index "+mid);
        return;
    }
    else{
        last=mid-1;
    }
    mid=(first+last)/2;
 }
 if(first>last){
    System.out.println("element not found");
 }
}
public static void main(String args[]){  
    int arr[] = {8,16,28,29,35,40};  
    int value = 35;  
    int last=arr.length-1;  
    binarySearch(arr,0,last,value);     
}  
}                                                                 