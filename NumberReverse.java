import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String s=String.valueOf(n);
	StringBuilder sb=new StringBuilder();
	String r=sb.append(s).reverse().toString();
	int re=Integer.parseInt(r);
	System.out.println(re);
}
}
