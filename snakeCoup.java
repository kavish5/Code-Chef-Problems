import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 31-05-2017.
 */
public class snakeCoup {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
//            char arr[][] = new char[2][n];
            String data[] = new String[2];
            for(int j = 0; j < 2; j++)
                data[j] = in.next();
            System.out.println(snakeCoupMongoose(data, n));
        }
    }

    private static int snakeCoupMongoose(String[] data, int n) {
        boolean horizon = data[0].indexOf('*') >= 0 && data[1].indexOf('*') >= 0;
        int c = 0;
        boolean up = false, down = false;
        for (int i = 0; i < n; i++)  {
            for (int j = 0; j < 2; j++) {
                if (data[j].charAt(i) == '*') {
                    if((j == 0 && up) || (j==1 && down)){
                        c++;
                        up = down = false;
                        break;
                    }
                }
            }
            for (int j = 0; j < 2; j++) {
                if (data[j].charAt(i) == '*' && j == 0)
                    up = true;
                if (data[j].charAt(i) == '*' && j == 1)
                    down = true;
            }
        }
        return c + (horizon ? 1 : 0);
    }
}

