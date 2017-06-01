import java.util.Scanner;

/**
 * Created by Kavish Kapadia on 31-05-2017.
 */
public class snakeAndMongooseElection {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for (int i = 0; i < test; i++) {
            String data = in.next();
            char arr[] = data.toCharArray();
            System.out.println(snakeMongooseElection(arr));
        }
    }

    private static String snakeMongooseElection(char[] arr) {

        int s = 0, m = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]  == 'm')
                m++;
            else
                s++;

            if(arr.length != 1){
                if(i == 0) {
                    if (arr[i] == 'm' && arr[i + 1] == 's') {
                        s--;
                        arr[i+1] = '-';
                    }
                }
                else if(i == arr.length-1) {
                    if (arr[i] == 'm' && arr[i - 1] == 's') {
                        s--;
                        arr[i-1] = '-';
                    }
                }
                else{
                    if(arr[i] == 'm'){
                        if(arr[i-1] == 's'){
                            s--;
                            arr[i-1] = '-';
                        }
                        else if(arr[i+1] == 's') {
                            s--;
                            arr[i+1] = '-';
                        }
                    }
                }
            }
        }
        if(s == m)
            return "tie";
        else  if(s > m)
            return "snakes";
        else
            return "mongooses";
    }

}
