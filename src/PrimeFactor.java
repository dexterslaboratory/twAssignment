import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by siddharth on 7/8/16.
 */
public class PrimeFactor {
    public static void main(String args[])throws IOException{
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input);
        new PrimeFactor().generate(n);
    }
    private void generate(int n){
        ArrayList<Integer> factors = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0 && !previousFactors(i,factors)){
                factors.add(i);
            }
        }
        System.out.println(factors.toString().substring(1,factors.toString().length()-1));
    }
    private boolean previousFactors (int i, ArrayList<Integer> factors){
        for(int f:factors){
            if(i%f==0)return true;
        }
        return false;
    }
}
