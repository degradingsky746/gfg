/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class alt{

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t--!=0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

		    int a[] = new int[n];
        int b[] = new int[m];
		    st = new StringTokenizer(br.readLine());
		    int x=0;
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }

        int min_i = 0;
        int max_i = n-1;
        int maxx = a[max_i]+1;
        for(int i=0;i<n;i++){
          if(i%2==0){
            a[i]+=(a[max_i]%maxx)*maxx;
            max_i--;
          }else{
            a[i]+=(a[min_i]%maxx)*maxx;
            min_i++;
          }
        }
        for(int i=0;i<n;i++)a[i]/=maxx;

        StringBuilder sb = new Stringbuilder();

        for(int r:a){
          sb.append(r+" ");
        }
        System.out.println(sb);


		}

	}
}
