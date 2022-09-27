import java.util.Scanner;

public class DistractionsofGrades {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] s=new int[101];
        for(int i=1;i<=n;i++){
            s[i]=in.nextInt();
        }
        int a=0,b=0,c=0,d=0;
        for(int i=1;i<=n;i++){
            if(90<=s[i]&&s[i]<=100){
                a++;
            }
            else if(80<=s[i]&&s[i]<90){
                b++;
            }
            else if(70<=s[i]&&s[i]<80){
                c++;
            }
            else if(60<=s[i]&&s[i]<70){
                d++;
            }
        }
        System.out.printf("A: %d\n",a);
        System.out.printf("B: %d\n",b);
        System.out.printf("C: %d\n",c);
        System.out.printf("D: %d\n",d);
    }
}
