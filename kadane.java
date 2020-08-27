/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class kadane{
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    int a[] = new int[n];
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x=1,y=0;
        a[0]=Integer.parseInt(st.nextToken());
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }

        int maxc,maxg;
        max=maxg=a[0];
        for(int i=1;i<n;i++){
          maxc=Math.max(a[i],a[i]+maxc);
          if(maxc>maxg){
            maxg=maxc;
          }
        }
        System.out.println(maxg);


		}

	}
}
