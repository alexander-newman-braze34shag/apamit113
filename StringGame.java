import java.io.*;
import java.util.*;
class StringGame{
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       char c,ch;
       int k;
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0)
       {
           int counter=0;
            String s=sc.nextLine();
            int i=s.length();
            for(c='a'; c<='z'; c++)
             {
                 k=0;
                for(int j=0; j<i; j++)
                {
                    ch = s.charAt(j);
                    if(ch == c)
                    {
                    k++;
                    }
                }
                if(k>0)
                {
                    counter++;
                }
            }
            if(counter%2==0)
            System.out.println("Player2");
            else
            System.out.println("Player1");
       }
    }
}
