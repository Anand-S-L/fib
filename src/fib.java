import java.util.Scanner;

public class fib {
    public static int fib(int num) {
        if(num==1) {
            return 1;
        }
        if(num==2) {
            return 1;
        }

        return fib(num-1)+fib(num-2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter starting range?");
        int start=s.nextInt();
        System.out.println("Enter ending range?");
        int end =s.nextInt();

        for(int i=start;i<=end;i++) {
            if(fib(i)<=end && fib(i)>=start)
                System.out.print(fib(i)+",");

        }

    }
}
