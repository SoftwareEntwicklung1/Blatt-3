public class BarChart{
    //StdDraw.text (0.9, 0.9, "0.9, 0.9");
    //StdDraw.line (0.3, 0.2, 0.9, 0.3);
    //StdDraw.filledRectangle (0.1, 0.1, 0.2, 0.2);
    public static void main(String [] args) {
        StdDraw.text (0.1, 0.1, "");
        StdDraw.text (0.1, 0.9, "");
        StdDraw.text (0.9, 0.1, "");
        StdDraw.text (0.9, 0.9, "");
        StdDraw.line (0.0, 0.1, 1.0, 0.1);
    // drawBars(0.2, 0.1, "hi", 0.6);
        double w=Double.parseDouble(args[0]);
        double g=Double.parseDouble(args[1]);
        String[] a=StdIn.readAllStrings();
        double[] arr1=new double[a.length/2];
        String[] arr2=new String[a.length/2];

        for(int i=0;i<a.length;i++){
        if(i%2!=0){
          arr1[(i-1)/2]=Double.parseDouble(a[i]);
        }else{
          arr2[i/2]=a[i];  
        }
        }
    //  Testen
    //   System.out.println(Arrays.toString(arr2));
        drawBars(arr2,arr1,w,g);
    }
    //    drawBars(a, b, w, g);;
    public static void drawBar(double x,double width,String text,double height) {
        StdDraw.filledRectangle (x,height/2+0.1,width/2,height/2);
        StdDraw.text (x,0.05,text);
    }
    public static void drawBars(String[] labels,double[] heights,double width,double gap) {
        double x=labels.length;
        for(int i=0;i<x;i++){
           double init=0.5*width+gap;
           drawBar(init+i*(width+gap),width,labels[i],heights[i]);
        }
    }
    public static double [] readArray (){
        int n=StdIn.readInt();
        double[] a=new double [n];
        for (int i=0;i<n;i++){
        a[i]=StdIn.readDouble();
        }
        return a;
        }
    }