import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 20-05-2017.
 */
public class templeLand {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            List<Integer> data = new ArrayList<>();
            for(int j = 0; j < n; j++)
                data.add(Integer.valueOf(in.next()));
            String ans = validTempleLand(n, data);
            System.out.println(ans);
        }
    }

    private static String validTempleLand(int n, List<Integer> data) {
        if(!data.get(0).equals(data.get(n-1)) || data.get(0) != 1 || n%2==0)
            return "no";
        else {
            for (int i = 1; i < n/2; i++){
                if(!data.get(i).equals(data.get(n-i-1)) || data.get(i)-data.get(i-1)!=1 || data.get(n-i-1)-data.get(n-i)!=1)
                    return "no";
            }
            if(data.get(n/2).equals(n/2+1))
                return "yes";
        }
        return null;
    }

}
