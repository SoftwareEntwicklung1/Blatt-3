public class ToMatrix{
    public static int halloMatrix(int x,int y,int z){
        int q=0;
        switch(x) 
        { 
           case 0: 
               int[][] arrayZiffer0={{1,1,1},{1,0,1},{1,0,1},{1,0,1},{1,1,1}};
               q=arrayZiffer0[y][z];
               break; 
            case 1: 
               int[][] arrayZiffer1={{0,0,1},{0,0,1},{0,0,1},{0,0,1},{0,0,1}};
               q=arrayZiffer1[y][z];
               break; 
           case 2: 
               int[][] arrayZiffer2={{1,1,1},{0,0,1},{1,1,1},{1,0,0},{1,1,1}};
               q=arrayZiffer2[y][z];
               break; 
            case 3: 
               int[][] arrayZiffer3={{1,1,1},{0,0,1},{1,1,1},{0,0,1},{1,1,1}};
               q=arrayZiffer3[y][z];
               break;
            case 4: 
               int[][] arrayZiffer4={{1,0,0},{1,0,0},{1,1,1},{0,1,0},{0,1,0}};
               q=arrayZiffer4[y][z];
               break;  
            case 5: 
               int[][] arrayZiffer5={{1,1,1},{1,0,0},{1,1,1},{0,0,1},{1,1,1}};
               q=arrayZiffer5[y][z];
               break;  
            case 6: 
               int[][] arrayZiffer6={{1,0,0},{1,0,0},{1,1,1},{1,0,1},{1,1,1}};
               q=arrayZiffer6[y][z];
               break;  
            case 7: 
               int[][] arrayZiffer7={{1,1,1},{0,0,1},{0,0,1},{0,0,1},{0,0,1}};
               q=arrayZiffer7[y][z];
               break;  
            case 8: 
               int[][] arrayZiffer8={{1,1,1},{1,0,1},{1,1,1},{1,0,1},{1,1,1}};
               q=arrayZiffer8[y][z];
               break;     
            case 9: 
               int[][] arrayZiffer9={{1,1,1},{1,0,1},{1,1,1},{0,0,1},{0,0,1}};
               q=arrayZiffer9[y][z];
               break;  
            default: 
               q=0;
               break; 
        } 
        return q;
    }
    public static int count(int x) {
        int a=0,b=0,i=0,p=0;
        p=x;
        while(x!=0){
           a=x%10;
           b=x/10;
           x=b;
           i++;
        }
        x=p;
        return i;
    }
    public static int[] arrayN(int x,int y){
     int[] a=new int[y];
     int m=0,n=0;
        for(int j=a.length-1;j>=0;j--){
        m=x%10;
        n=x/10;
        a[j]=m;
        x=n;
        }
     return a;
    }
     
    public static int[][] StdinArray(int[] a){
        int[][] b=new int[5][a.length*3];
        int c=a.length;
        for(int i=0;i<5;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<3;k++){
                   b[i][k+j*3]=halloMatrix(a[j], i, k);
                }
            }

        }
        return b;
    } 
    public static void main(String[] args) {
     while(!StdIn.isEmpty()){
     String s=StdIn.readString();
     //Testen initial
     int x=Integer.parseInt(s);       
      if(x>=100&&x<1000){
        //Testen count
        ToMatrix abc=new ToMatrix();
        int count=abc.count(x);
        //Test
        int[] a=ToMatrix.arrayN(x,count);
        int[][] Matrix=ToMatrix.StdinArray(a);
        for(int i=0;i<5;i++){
          for(int j=0;j<Matrix[i].length;j++){
            System.out.print(Matrix[i][j]);           
            }
            System.out.println();
          }
    
      } 
      else if(x>=0&&x<10){
        int[][] cb=new int[5][9];
        for(int i=0;i<5;i++){
            for(int k=0;k<6;k++){
                cb[i][k]=halloMatrix(10, i, k);
            }
            for(int j=6;j<9;j++){
                cb[i][j]=halloMatrix(x,i,j-6);
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<cb[i].length;j++){
              System.out.print(cb[i][j]);           
              }
              System.out.println();
            }

      }else{
        int[][] cb2=new int[5][9];
        for(int i=0;i<5;i++){
            for(int k=0;k<3;k++){
                cb2[i][k]=halloMatrix(10, i, k);
            }
            for(int j=6;j<9;j++){
              cb2[i][j]=halloMatrix(x%10, i, j-6);
            }
            for(int j=3;j<6;j++){
                cb2[i][j]=halloMatrix((int)x/10, i, j-3);
              }
      
      }
      for(int i=0;i<5;i++){
        for(int j=0;j<cb2[i].length;j++){
          System.out.print(cb2[i][j]);           
          }
          System.out.println();
        }
      }
     }
}
}