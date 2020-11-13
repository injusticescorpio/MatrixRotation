import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Source Code
public class matrixrotation {
    public static void main(String[] args) throws IOException {
        int i,j;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter row and column of matrix");
        int m=Integer.parseInt(br.readLine());
        int n=Integer.parseInt(br.readLine());
        int array[][]=new int[50][50];
        System.out.println("enter elements");
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                array[i][j]=Integer.parseInt(br.readLine());
            }
        }
        System.out.println("#########Original Matrix#############\n");
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(array[i][j]+"  ");;
            }
            System.out.println("  ");
        }
        int row,col;row=0;col=0;
        int maxrow,maxcol;maxrow=m-1;maxcol=n-1;
        System.out.println("maxrow"+maxrow+"maxcol"+maxcol);
        int pre;
        int current;
        while (row<maxrow && col<maxcol)
        {
            pre=array[row+1][col];
            //toprow
            for(i=col;i<=maxcol;i++)
            {
                current=array[row][i];
                array[row][i]=pre;
                System.out.println("["+row+"]"+"  ["+i+"]");
                System.out.println("array[row][i]=="+array[row][i]);
                pre=current;
                System.out.println("pre  "+pre);
            }
            row++;
            //last column
            for(i=row;i<=maxrow;i++)
            {
                current=array[i][maxcol];
                array[i][maxcol]=pre;
                System.out.println("["+i+"]"+"  ["+maxcol+"]");
                System.out.println("array[i][maxcol]=="+array[i][maxcol]);
                pre=current;
                System.out.println("pre  "+pre);
            }
            maxcol--;
            //last row
            if(col<maxcol)
            {
            for(i=maxcol;i>=col;i--)
            {
                current=array[maxrow][i];
                array[maxrow][i]=pre;
                System.out.println("["+maxrow+"]"+"  ["+i+"]");
                System.out.println("array[maxrow][i]=="+array[maxrow][i]);
                pre=current;
                System.out.println("pre  "+pre);
            }
            maxrow--;
            }
            if(row<=maxrow) {
                for (i = maxrow; i >= row; i--) {
                    current = array[i][col];
                    array[i][col] = pre;
                    System.out.println("["+i+"]"+"  ["+col+"]");
                    System.out.println("array[i][col]=="+array[i][col]);
                    pre = current;
                    System.out.println("pre  "+pre);
                }
                col++;
            }
        }

        System.out.println("##########Rotated matrix######\n");
        for (i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println("  ");
        }
    }
}
