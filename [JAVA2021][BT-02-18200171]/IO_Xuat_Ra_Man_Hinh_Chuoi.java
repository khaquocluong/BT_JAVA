
public class IO_Xuat_Ra_Man_Hinh_Chuoi {
		public static void main(String [] args)
		{
			String str1 ="0123456789";
			String str2 = "9876543210";
			int n= str2.length();
			String space =" ";
			for(int i=0; i<n-1;i++)
			{
				String tam="";
				for(int j=0;j<i;j++)
				{
					tam = tam + space;
				}
				System.out.printf("%s %s\t%s%s\n", str1.substring(0, n-i),tam,tam, str2.substring(i, n));
			}
			for(int i=3; i<=n;i++)
			{
				String tam="";
				for(int j=n-i;j>0;j--)
				{
					tam = tam + space;
				}
				System.out.printf("%s%s\t%s%s\n", str1.substring(0,i),tam,tam,str2.substring(n-i, n));
			}
		}
}
