/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class mergesortedgap{

  public static int nextgap(int x){
    if(x==1) return 0;
    return (x/2)+x%2;
  }
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while(t--!=0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

		    int a[] = new int[n];
        int b[] = new int[m];
		    st = new StringTokenizer(br.readLine());
		    int x=0;
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }

        st = new StringTokenizer(br.readLine());
		    x=0;
		    while(st.hasMoreTokens()){
		        b[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }

        int ptr1=a.length-1;
        int ptr2=0;

        while(ptr1>=0&&ptr2<b.length){
            if(a[ptr1]>b[ptr2]){
              a[ptr1]=a[ptr1]^b[ptr2];
              b[ptr2]=a[ptr1]^b[ptr2];
              a[ptr1]=a[ptr1]^b[ptr2];
            }
        }

        Arrays.sort(a);
    		Arrays.sort(b);

        for(int r:a) System.out.print(r+" ");
        for(int r:b) System.out.print(r+" ");

		}

	}
}
