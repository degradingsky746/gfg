/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class misrep {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str[];
		while(t--!=0){
		    int n = Integer.parseInt(br.readLine());
		    str = br.readLine().trim().split("\\s+");

		    Arrays.sort(str,(x,y)->Integer.parseInt(x)-Integer.parseInt(y));

		    System.out.println(Arrays.toString(str));

		    for(int i=1;i<=n;i++){
		        if (i!=Integer.parseInt(str[i-1])){
		            System.out.println(str[i-1]+" "+i);
		            break;
		        }
		    }
		}

	}
}
