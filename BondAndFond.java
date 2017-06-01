import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 28-05-2017.
 */
public class BondAndFond {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        List<BigInteger> data = new ArrayList<>();
        for (int i = 0; i < test; i++)
            data.add(BigInteger.valueOf(in.nextInt()));
        smallestAbsoluteDifference(data);
    }

    private static void smallestAbsoluteDifference(List<BigInteger> data) {

        int n = data.size();
        for(int i = 0; i < n; i++){
            BigInteger x = data.get(i);
            BigInteger p = BigInteger.valueOf(1);

            while(p.compareTo(x) == -1)
                p = p.shiftLeft(1);
            if(p == x)
                System.out.println("0");
            else {
                BigInteger a = x.subtract(p).abs();
                p = p.shiftRight(1);
                BigInteger b = x.subtract(p).abs();

                System.out.println(a.compareTo(b) == -1? a : b);
            }
        }
    }

}
