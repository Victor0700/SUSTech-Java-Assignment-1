import java.util.Scanner;

public class Months {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[101];
        for(int i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        for(int i=1;i<=n;i++){
            if((a[i]<=7&&a[i]%2==1)||(a[i]>=8&&a[i]%2==0)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}
