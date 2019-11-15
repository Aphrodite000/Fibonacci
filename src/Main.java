import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c=a+b;
        while(n>c){
            a=b;
            b=c;
            c=a+b;
        }
        if(Math.abs(c-n)<Math.abs(n-b)){
            System.out.println(Math.abs(n-c));
        }else{
            System.out.println(Math.abs(n-b));
        }
    }
}
