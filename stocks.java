import java.util.*;
import java.lang.*;
import java.io.*;

class stocks {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    int a[] = new int[n];
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x=0;
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }
        int found=0;
        for(int i=0;i<n-1;){
          int j=i+1;
          while(a[j]>a[i]){
            j+=1;
            if(j==n)break;
          }
          if(j!=i+1){
            found=1;
            System.out.print("("+i+" "+(j-1)+")"+" ");
          }

          i=j;
        }
        if(found==1)
          System.out.println("No Profit")
        else
          System.out.println();
		}

	}
}
