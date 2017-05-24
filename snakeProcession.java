import java.util.Scanner;
/**
 * Created by Kavish Kapadia on 20-05-2017.
 */
class snakeProcession {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            int n = in.nextInt();
            String data = in.next();
            String ans = validSnakeProcession(n, data);
            System.out.println(ans);
        }
    }

    private static String validSnakeProcession(Integer n, String data) {
        Boolean result = true;
        for(int i = 0; i < n; i++){
            if((result && data.charAt(i) == 'T') || (!result && data.charAt(i) == 'H')) {
                result = false;
                break;
            }
            else if(data.charAt(i) == 'H')
                result = false;
            else if(!result && data.charAt(i) == 'T')
                result = true;
        }
        if(result)
            return "Valid";
        else
            return "Invalid";
    }
}
