public class Min {
    static void minValue(int arr[]) {
        int min = arr[0];
        for (int i = 1; i< arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int arr[] = {67,85,19,54};
        minValue(arr);

    }
}
