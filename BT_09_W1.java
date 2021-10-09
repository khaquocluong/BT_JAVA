
public class BT_09_W1 {
			
			public static void main(String[] args) {
				
				String str1 ="    lOp  hoc java.  bat daU          luc muoi hai gio   ";
				
				//Chuan hoa
				str1 = str1.trim();
				str1 = str1.toLowerCase();
				
				// Xu ly khoang cach
				int n = 0;
				String str2="";
				while(str1.indexOf("  ")!=-1)
				{
					n = str1.length();
					str2 = str1.substring(str1.indexOf("  ")+1, n);
					str1 = str1.substring(0,str1.indexOf("  "));
					str1 = str1.concat(str2);
				}
				
				// Xu ly in hoa
				str2 ="";
				String up = "";
				str1 = str1 + " "; // xu chu o vi tri cuoi cung
				while(str1.indexOf(" ")!=-1)
				{
					up = str1.substring(0,1);
					up = up.toUpperCase();
					str2 = str2 + up + str1.substring(1,str1.indexOf(" ")+1);
					n= str1.length();
					str1 = str1.substring(str1.indexOf(" ")+1,n);
				}
				System.out.println(str2);
			}
		}