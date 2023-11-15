import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalcases, casevalues;
        totalcases = s.nextInt();
        System.out.println(totalcases);
        int[][] arr = new int[totalcases][];
        for (int i = 0; i < arr.length; i++) {
            casevalues = s.nextInt();
            System.out.println(casevalues);
            arr[i] = new int[casevalues];
            for (int j =0;j<arr.length;j++){
                arr[i][j] = s.nextInt();
            }
        }
        for (int i =0; i < arr.length;i++) {
            int even = 0, odd = 0;
            System.out.println("Cases" + i +"with"+arr[i].length+"values");
            for (int j = 0;j<arr[i].length;j++) {
                System.out.println(arr[i][j]);
                if(arr[i][j]%2==0) {
                    even++;
                } else {
                    odd++;
                }
            }
            System.out.println("Total even numbers: -"+even+"Total odd numbers: -"+odd);
        }

    }
}
