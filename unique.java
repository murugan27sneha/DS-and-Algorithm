import java.util.*;
public class unique
{
public static void main(String []args)
{
HashSet<Integer> hs=new HashSet<>();
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
int  a=s.charAt(i)-'0';
hs.add(a);
}
System.out.print(hs);
}}
