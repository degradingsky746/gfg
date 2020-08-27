import java.util.*;
import java.lang.*;
import java.io.*;

class numberofpairs{


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

        int count = 0;

        for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(a[j]*Math.log(a[i])>a[i]*Math.log(a[j])) count++;
          }
        }

        System.out.println(count);


		}

	}
}
