package TuDien;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DictVE {
	static HashMap<String, String> hMapVE;
	static ArrayList<String> word;
	public static void HasdMapVEOn() {
		word =new ArrayList<String>();
		hMapVE = new HashMap();
		File f = new File("data/DictVE.dic");
		String s = "";
		try
		{
			Scanner sc = new Scanner(f);
			try
			{
				while(sc.hasNextLine())
				{
					String[] str = sc.nextLine().split(":");
					if(str[0] != "" && str[1]!="")
					{
						word.add(str[0]);
						hMapVE.put(str[0].trim(),str[1]);
						s = hMapVE.get(str[0].trim());
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
