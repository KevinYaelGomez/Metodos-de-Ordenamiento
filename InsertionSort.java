public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {9,6,1,4,7,3,0,2,8,5};
        for(int j = 0; j < arr.length; j++){
            int actual = arr[j];
            int i = j-1;
            while (i >= 0 && arr[i] > actual) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = actual;
        }
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}