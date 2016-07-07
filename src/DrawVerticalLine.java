import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by siddharth on 7/7/16.
 */
public class DrawVerticalLine {
    public static void main(String args[])throws IOException{
        System.out.println("Enter the number of lines");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input);
        new DrawVerticalLine().drawVerticalLine(n);
    }
    private void drawVerticalLine(int n){
        for(int i=0;i<n;i++){
            System.out.println('*');
        }
    }
}
