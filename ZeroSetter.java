package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Matrix row and column zero setter
 * 
 * @author skh
 *
 */

public class ZeroSetter {	

	public static void main(String[] args) {
		BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
		int n, m;
		int[][] a = new int[3][3];

		try {
			n = Integer.parseInt(rdr.readLine());
			m = Integer.parseInt(rdr.readLine());
			
			boolean [] row = new boolean[n];
			boolean [] column = new boolean[m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = Integer.parseInt(rdr.readLine());
					if(a[i][j]==0){
						row[i] = true;
						column[j] = true;
					}
				}
			}
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if(row[i] || column[j]){
						a[i][j] = 0;
					}
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

