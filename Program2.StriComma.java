//Program2
import java.util.Arrays;


public class Program02 {
    public static void main(String[] args) {
        String []arr = new String[args.length];

        try {
            arr = args;
            Arrays.sort(arr);
        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
