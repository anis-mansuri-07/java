import java.util.Arrays;

public class Program01{
    public static void main(String[] args) {
        int []array = new int[args.length];
        try{
            for(int i=0;i<args.length;i++){
                array[i] = Integer.parseInt(args[i]);
            }

            Arrays.sort(array);

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            System.out.println("Maximum : "+array[array.length-1]);
            System.out.println("Minimum : "+array[0]);
    }catch(Exception e){
        System.out.println("Error : "+e.getMessage());
    }
    }
}
