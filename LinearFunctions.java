import java.util.Scanner;

public class LinearFunctions {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        float[] x1=new float[101],y1=new float[101],x2=new float[101],y2=new float[101],x=new float[101];
        for(int i=1;i<=n;i++){
            x1[i]=in.nextFloat();
            y1[i]=in.nextFloat();
            x2[i]=in.nextFloat();
            y2[i]=in.nextFloat();
            x[i]=in.nextFloat();
        }
        float a,b;
        for(int i=1;i<=n;i++){
            a=(y2[i]-y1[i])/(x2[i]-x1[i]);
            b=y1[i]-a*x1[i];
            System.out.printf("%.1f\n",a*x[i]+b);
        }
    }
}
