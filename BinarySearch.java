import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70};
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the numbers to Search:");
        int target=Scanner.nextInt();
        int result=binarySearch(arr,target);
        if(result == -1){
            System.out.println("Element not Found.");
        }else{
            System.out.println("element Found at index:" + result);
        }
        Scanner.close();
    }
    public static int binarySearch(int [] array,int key){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid] == key) {
                return mid;
            } else if(array[mid] < key) {
                low=mid +1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
