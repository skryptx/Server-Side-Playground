import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {54,12,42,56,32,45,21,123,213,32544};
        Scanner scanner = new Scanner(System.in);
        int search = Integer.parseInt(scanner.nextLine());
        int currIndex = 0;
        for(int num : numbers) {
            if(num == search) {
                System.out.printf("%d found at %d", search, currIndex);
                return;
            }
            currIndex++;
        }
        System.out.printf("%d not found in array numbers", search);
    }
}
