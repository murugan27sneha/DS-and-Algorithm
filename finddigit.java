
import java.util.*;
import java.io.*;
public class finddigit
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of test cases:");
int n=sc.nextInt();
int i,j;

for(i=0;i<n;i++)
{
System.out.println("enter the string:");
String s=sc.next();
int c=0;
for(j=0;j<s.length();j++)
{
char a=s.charAt(j);

int num=Integer.parseInt(s);
int n1=a-'0';

if(n1!=0 && num%n1==0)
{
if(n!=0)
{
c++;
}}
 }
System.out.println(c);
}
}}