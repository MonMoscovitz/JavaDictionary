package TuDien;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class DictEV {
	static HashMap<String, String> hMapEV;
	static ArrayList<String> word;
	
	public static void HasdMapEVOn() {
		
		
		hMapEV = new HashMap();
		word = new ArrayList<String>();
		File f = new File("data/DictEV.dic");
		String s = "";
		try
		{
			Scanner sc = new Scanner(f);
			try
			{
				while(sc.hasNextLine())
				{
					String[] str = sc.nextLine().split("=");
					if(str[0] != "" && str[1]!="")
					{
						word.add(str[0]);
						hMapEV.put(str[0].trim(),str[1]);
						s = hMapEV.get(str[0].trim());
					}
					else System.out.println("Đã có lỗi !");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				Collections.sort(word);
				if(sc!= null) sc.close();
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}	
	}
	
}
