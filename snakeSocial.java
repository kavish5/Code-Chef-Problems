import java.util.*;

/**
 * Created by Kavish Kapadia on 01-06-2017.
 */
public class snakeSocial {

    int a[][];
    int max_value;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int a[][] = new int[n][m];
            int max = 0;
            for (int j = 0; j < a.length; j++){
                for (int k = 0; k < a[j].length; k++) {
                    a[j][k] = in.nextInt();
                    if(a[j][k] > max)
                        max = a[j][k];
                }
            }
            snakeSocial obj = new snakeSocial();
            obj.snakeSocialism(a, max);
        }
    }

    private void snakeSocialism(int[][] a, int max) {
        List<Map.Entry<Integer, Integer>> maxPosition = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == max)
                    maxPosition.add(new AbstractMap.SimpleEntry<Integer, Integer>(i, j));
            }
        }
        this.a=a;
        max_value = max;
        System.out.println(searchMatrix(maxPosition));
    }

    int searchMatrix(List<Map.Entry<Integer, Integer>> entry){
        List<Map.Entry<Integer, Integer>> enter = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : entry) {
            int i = e.getKey();
            int j = e.getValue();
            updateMatrix(i-1, j-1, enter);
            updateMatrix(i-1, j, enter);
            updateMatrix(i-1, j+1, enter);
            updateMatrix(i, j-1, enter);
            updateMatrix(i, j+1, enter);
            updateMatrix(i+1, j-1, enter);
            updateMatrix(i+1, j, enter);
            updateMatrix(i+1, j+1, enter);
        }
        if (enter.isEmpty())
            return 0;
        else
            return 1 + searchMatrix(enter);
    }

    void updateMatrix(int i, int j, List<Map.Entry<Integer, Integer>> entry){
        if (i < 0 || j < 0 || i >= a.length || j >= a[0].length)
            return;
        if(a[i][j] >= max_value)
            return;
        a[i][j] = max_value;
        entry.add(new AbstractMap.SimpleEntry<Integer,Integer>(i,j));
    }
}
