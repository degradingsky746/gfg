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
    //System.out.println("t"+t);
		while(t--!=0){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        //System.out.println("n"+n);
        int m = Integer.parseInt(st.nextToken());
        //System.out.println("m"+m);
		    int a[] = new int[n];
        int b[] = new int[m];
		    st = new StringTokenizer(br.readLine());
		    int x=0;
		    while(st.hasMoreTokens()){
		        a[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }
        //System.out.println(Arrays.toString(a));
        st = new StringTokenizer(br.readLine());
		    x=0;
		    while(st.hasMoreTokens()){
		        b[x]=Integer.parseInt(st.nextToken());
		        x+=1;
		    }
        //System.out.println(Arrays.toString(b));
        int gap=n+m;
        for(gap=nextgap(gap);gap>0;gap=nextgap(gap)){

          //System.out.println("looop");

          int i,j;

          for(i=0;i+gap<n;i++){
            if(a[i]>a[i+gap]){
              a[i]=a[i]^a[i+gap];
              a[i+gap]=a[i]^a[i+gap];
              a[i]=a[i]^a[i+gap];
            }
          }

          for(j=gap>n?gap-n:0;i<n&&j<m;i++,j++){
            if(a[i]>b[j]){
              a[i]=a[i]^b[j];
              b[j]=a[i]^b[j];
              a[i]=a[i]^b[j];
            }
          }

          if(j<m){
            for(j=0;j+gap<m;j++){
              if(b[j]>b[j+1]){
                b[j]=b[j]+b[j+gap];
                b[j+gap]=b[j]+b[j+gap];
                b[j]=b[j]+b[j+gap];
              }
            }
          }

        }

        for(int r:a) System.out.print(r+" ");
        for(int r:b) System.out.print(r+" ");

		}

	}
}
