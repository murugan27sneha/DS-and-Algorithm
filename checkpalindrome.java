import java.io.*;
import java.util.*;
public class checkpalindrome
{
public static void main(String []args)
{
LinkedList<Integer> l=new LinkedList<Integer>();
l.add(3);
l.add(4);
l.add(5);
l.add(4);
l.add(3);
System.out.println(l);

int c=0;
System.out.println(rev);
Iterator<Integer> iterator = l.iterator();
        Iterator<Integer> reverseIterator = l.descendingIterator();
        while(iterator.hasNext()&&reverseIterator.hasNext()){
            if(!iterator.next().equals(reverseIterator.next())){
               break;
            }
   c++;
}
if(c==l.size())
{
System.out.println("is palindrome");
}
else
{
System.out.println("Not palindrome");
}
}
}