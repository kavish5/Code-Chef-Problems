import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 28-05-2017.
 */
public class isSnake{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            char data[][] = new char[2][n];
            for(int j = 0; j < 2; j++) {
                String x = in.next();
                for (int k = 0; k < n; k++)
                    data[j][k] = x.charAt(k);
            }
            System.out.println(isASnake(data, n));
        }
    }

    private static String isASnake(char[][] data, int n) {
        int i = 0;
        while(data[0][i] != '#' && data[1][i] != '#')
            i++;
        boolean ans = (data[0][i] == '#' && validate(0, i, data, n)) || (data[1][i] == '#' && validate(1, i, data, n));
        return ans ? "yes" : "no";
    }

    private static boolean validate(int i, int j, char[][] data, int n) {
        while(true){
            if(data[1-i][j] == '#')
                i = 1 - i;
            if( j + 1 == n || data[i][j+1] != '#')
                break;
            j++;
        }
        for(int x = 0; x < 2; x++){
            for(int y = j + 1; y < n; y++){
                if(data[x][y] == '#')
                    return false;
            }
        }
        return true;
    }

}