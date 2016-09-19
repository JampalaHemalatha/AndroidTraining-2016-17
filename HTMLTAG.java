import java.util.*;
public class HTMLTAGS {
	
	public static void main (String[] args) {
		
		String str1,str;
		Scanner s=new Scanner(System.in);
		str1=s.nextLine();
		str=s.nextLine();
		String p='<'+str1+'>';
		String q="</"+str1+'>';
		String a=p+str+q;
		System.out.print(a);
	}
}
