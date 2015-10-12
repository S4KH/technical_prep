package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * String compressor
 * 
 * @author skh
 *
 */

public class StringComp {
	public static void main(String[] args) {
		BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
		String inp = "";
		StringBuffer comp_str = new StringBuffer();
		int c_num = 1;

		try {
			while ((inp = rdr.readLine()) != null) {
				comp_str.append(inp.charAt(0));
				for (int i = 1; i < inp.length(); i++) {
					char curr = inp.charAt(i);
					char prev = inp.charAt(i - 1);
					if (curr == prev) {
						c_num++;
					} else {
						comp_str.append(c_num);
						comp_str.append(String.valueOf(inp.charAt(i)));
						c_num = 1;
					}
				}
				comp_str.append(c_num);
				System.out.println(comp_str.toString().length() >= inp.length() ? inp : comp_str.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rdr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
