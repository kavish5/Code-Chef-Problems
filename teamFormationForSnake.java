import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 27-05-2017.
 */
public class teamFormationForSnake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int u,v;
            for(int j = 0; j < m; j++){
                u = in.nextInt();
                v = in.nextInt();
            }
            if((n-2*m)%2 == 0)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }

}
