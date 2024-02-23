public class bubbleSort {
    public static void main(String[] args) {
        int []arr = {1,8,5,3,9,7,2,6,0};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}