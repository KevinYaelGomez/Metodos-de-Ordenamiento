public class seleccionSort {
    public static void main(String[] args) {
        int []arr = {9,6,1,4,7,3,0,2,8,5};
        for(int i = 0; i < arr.length; i++){
            int minimo = i;
            for(int j = i+1; j < arr.length; j++){
                if (arr[minimo] > arr[j]) {
                    minimo = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimo];
            arr[minimo] = temp;
        }
        for(int elem : arr){
            System.out.print(elem + " ");
        }
    }
}