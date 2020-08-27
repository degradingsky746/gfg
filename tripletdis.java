/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class string2 {
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
		    Arrays.sort(a);
        int comb=0;
        for(int i=n-1;i>=2;i--){
          int j=0;
          int k=i-1;
          while(j<k){
            if(a[j]+a[k]==a[i]){
              comb++;
              k-=1;
            }else if(a[j]+a[k]<a[i]){
              j+=1;
            }
            else k-=1;
          }



        }


        System.out.println(comb==0?-1:comb);
		}

	}
}
