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
		    Integer a[] = new Integer[n];
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    int x=0;
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }
		    int max = Collections.max(Arrays.asList(a));
		    int map[] = new int[max+1];
		    for(int i=0;i<n;i++){
		        map[a[i]]+=1;
		    }

		    int comb=0;

		    //case1: 0,0,0
		    comb+=map[0]*(map[0]-1)*(map[0]-2)/6;
		    //case2: 0,x,x
		    for(int i=1;i<=max;i++){
		        comb+=map[0]*map[i]*(map[i]-1)/2;
		    }
		    //case3:x,x,2*x
		    for(int i=1;2*i<=max;i++){
		        comb+=map[i]*(map[i]-1)*map[2*i]/2;
		    }
		    //case4:x,y,x+y
		    for(int i=1;i<=max;i++){
		        for(int j=i+1;i+j<=max;j++){
		            comb+=map[i]*map[j]*map[i+j];
		        }
		    }

		    if(comb==0) System.out.println("-1");
		    else System.out.println(comb);


		}

	}
}
