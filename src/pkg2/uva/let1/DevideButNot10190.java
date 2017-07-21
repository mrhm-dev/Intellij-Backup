package pkg2.uva.let1;

import java.util.ArrayList;
import java.util.Scanner;

public class DevideButNot10190 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Long> values = new ArrayList<>();


        while (sc.hasNext()){
            long n=sc.nextLong();
            long m=sc.nextLong();
            boolean status = true;
            values.clear();

            if (m>n || m<=1){
                System.out.println("Boring!");
                continue;
            }

            values.add(n);

            while (n>=1){
                if(n%m == 0){
                    n/=m;
                    values.add(n);
                }
                else break;
            }

            int len = values.size();
            if (values.get(len-1) == 1){
                System.out.print(values.get(0));

                for (int i=1; i<len; i++){
                    System.out.print(" " + values.get(i));
                }
                System.out.println();
            }
            else System.out.println("Boring!");


        }
    }
}
