//Xuat kq tu file abc.txt

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IO_W03_BT4 {
	public static void main(String [] args)
	{
		try
		{
			File file = new File("E:/java/HK7/java/bt/BT_W02/bin/abc.txt");
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String c = scanner.next();
				System.out.println(c);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
			System.exit(0);;
		}
		
	}
}
