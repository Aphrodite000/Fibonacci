import java.util.Scanner;

public class Main {
    public int countWays(int x, int y) {
        // write code here
        //先x
        //如果i+1，则j不变，如果i=x，则剩余光走j
        //如果j+1，则i不变，如果j=y，则剩余光走i
        int count=0;
        for(int i=0,j=0;(i+j)>(x+y);i++,j++){
            if(i++){
                j=j;
            }else{

            }
        }
        return count;
    }
}
