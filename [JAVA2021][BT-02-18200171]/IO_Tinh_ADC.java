//Xu li thong tin tu file adc

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IO_Tinh_ADC {
	
		public static void main(String [] args)
		{
			String str = null;
			int loop = 1;
			Scanner input = new Scanner(System.in);
			try
			{
				while(loop!=0)
				{
					File file = new File("E:/java/HK7/java/bt/BT_W02/bin/adc.txt");
					Scanner scanner = new Scanner(file);
					while(scanner.hasNext())
					{
						String c = scanner.next();
						str = str + c;
					}
					
					//Ham nhap
					System.out.printf("Nhap vao dinh dang\n");
					System.out.printf("Nhap so ADC\n");
					String adc = null;
					adc = input.next();
					
					System.out.printf("Nhap ngay\n");
					String ngay = null;
					ngay = input.next();
				
					//tach ngay
					String day[] = new String[366];
					int i=0;
					while(str.indexOf("#2019")!=-1)
					{
						day[i] = str.substring(0,str.indexOf("#2019")+12);
						i++;
						int n= str.length();
						str = str.substring(str.indexOf("#2019")+12,n);
					}
					//Ham xu li
					float tb =0;
					int dem =0;
					for(int t =0; t<366;t++)
					{
						if(day[t]==null) break;
						else if(day[t].contains(ngay))
						{
							if(day[t].indexOf("ADC"+adc)!=-1)
							{
								while(day[t].indexOf("ADC"+adc)!=-1)
								{
									tb = tb + Float.parseFloat(day[t].substring(day[t].indexOf("ADC"+adc)+5,day[t].indexOf("ADC"+adc)+9));
									int n = day[t].length();
									day[t]=day[t].substring(day[t].indexOf("ADC"+adc)+9,n);
									dem++;
								}
							}
							else System.out.printf("Khong co ADC nay\n");
						}
					}
					System.out.printf("%f",tb/dem);
					System.out.printf("\nNhap 0 de thoat 1 de tiep tuc\n");
					loop =input.nextInt();
				}
			}
			catch(FileNotFoundException e)
			{
				System.out.println("file not found");
				System.exit(0);;
			}
		}
	}
