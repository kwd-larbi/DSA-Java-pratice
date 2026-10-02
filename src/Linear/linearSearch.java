package Linear;

public class linearSearch {
    public static void main(String[] args){
        // given array
        int arr[] = {2,3,4,10,40};

        // Search x= 6
        int x = 10;
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.println("The element is not present in array");
        else
            System.out.print("The element is present" + " at index " + result);

    }
    // recursion of the procedure
    public static int search(int arr[], int x){
        // length of array
        int n = arr.length;

        // Traverse or checking or iterating through the array
        for (int i = 0; i<n; i++){
            // if element is found then
            // return index
            if(arr[i]== x)
                return i;
        }
        return -1;

    }
}
