import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[55];
        int n=in.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            if(a[i]%400==0||(a[i]%4==0&&a[i]%100!=0)){
                System.out.println("Yes");
                sum+=306;
                for(int j=a[i]+1;j<=1999;j++){
                    if(j%400==0||(j%4==0&&j%100!=0)){
                        sum+=366;
                    }
                    else{
                        sum+=365;
                    }
                }
            }
            else{
                System.out.println("No");
                continue;
            }
            sum++;
            System.out.println(sum);
            sum=0;
        }
        in.close();
    }
}
