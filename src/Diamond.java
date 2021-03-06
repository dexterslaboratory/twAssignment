import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by siddharth on 7/7/16.
 */
public class Diamond {
    public static void main(String args[])throws IOException {
        System.out.println("Enter number of rows");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input);
        new Diamond().drawDiamond(n);
    }
    private void drawDiamond(int n){
        constructUpperHalf(n);
        constructLowerHalf(n);

    }
    private void constructUpperHalf(int n){
        for(int i=0;i<n;i++){
            if(i<n-1)
                giveSpace(n-i-1);
            printAsterisk(2*(i)+1);
            System.out.println();
        }
    }
    private void constructLowerHalf(int n){
        for(int i=n-2;i>=0;i--){
            if(i<n-1)
                giveSpace(n-i-1);
            printAsterisk(2*(i)+1);
            System.out.println();
        }
    }
    private void giveSpace(int n){
        System.out.printf("%"+n+"s"," ");
    }
    private void printAsterisk(int n){
        if(n>0) {
            System.out.print('*');
            printAsterisk(n-1);
        }
    }
}
