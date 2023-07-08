//Binary search 
import java.util.*;
import java.io.*;
public class binarysearch
{
public static int search(int []arr,int target)
{
int left=0;
int right=arr.length-1;
int mid=left+(right-left)/2;
Arrays.sort(arr);
while(left<=right)
{
if(target==arr[mid])
{
return mid;
}
else if(arr[mid]<target)
{
left=mid+1;
}
else if(arr[mid]>target)
{
right=mid-1;
}
}
 return -1;
}


public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s=sc.nextLine();
int target=sc.nextInt();
String[] str=s.split(" ");
int[] arr= new int[str.length];
for(int i=0;i<str.length;i++)
arr[i]=Integer.parseInt(str[i]);
int index=search(arr,target);
if(index!=-1)
{
System.out.println("found at index:"+index);
}
else
{

System.out.println("not found");
}
}}