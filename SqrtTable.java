public class SqrtTable{
    public static void main(String[] args) {
     while(!StdIn.isEmpty()){
       double a=StdIn.readDouble();
       double c=wurzelDouble(a);
       System.out.printf("%.2f",a);
       System.out.printf("%s",",");
       System.out.printf("%.2f",c);
       System.out.println();
   //   verbesserung
     }

    }
    public static double wurzelDouble(double x) {
       double b=Math.sqrt(x);
       return b;

        
    }
}