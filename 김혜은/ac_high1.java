import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Combination {
    static void combination(List<Integer> arr, int r, int index, List<Integer> data, int i, int sum, int target) {
        if (index == r) {
            if (sum == target) {
                for (int j = 0; j < r; j++) {
                    System.out.print(data.get(j) + " ");
                }
                System.out.println();
            }
            return;
        }

        if (i >= arr.size()) {
            return;
        }

        data.set(index, arr.get(i));
        combination(arr, r, index + 1, data, i + 1, sum + arr.get(i), target);

        combination(arr, r, index, data, i + 1, sum, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        List<Integer> M = new ArrayList<>();
        System.out.print("Enter array elements: ");
        for (int i = 0; i < N; i++) {
            M.add(scanner.nextInt());
        }

        System.out.print("Enter target sum (L): ");
        int L = scanner.nextInt();

        List<Integer> data = new ArrayList<>(Arrays.asList(new Integer[N]));
        combination(M, N, 0, data, 0, 0, L);
    }
}
