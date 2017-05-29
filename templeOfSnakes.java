import java.util.*;

/**
 * Created by Kavish Kapadia on 27-05-2017.
 */
public class templeOfSnakes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            List<Integer> data = new ArrayList<>();
            for(int j = 0; j < n; j++)
                data.add(in.nextInt());
            System.out.println(totalOperationForTemple(data, n));
        }
    }

    private static int totalOperationForTemple(List<Integer> data, int n) {
        int sum = 0;
        for(int i = 0; i < data.size(); i++)
            sum += data.get(i);
        data.set(0, 1);
        for(int i = 1; i < n; i++)
            data.set(i, Math.min(data.get(i), data.get(i-1) + 1));
        data.set(n-1, 1);
        for(int i =  n - 2; i >= 0; i--)
            data.set(i, Math.min(data.get(i), data.get(i+1) + 1));
        int m = Collections.max(data);
        System.out.println(data);
        return sum - m*m;
    }
}
