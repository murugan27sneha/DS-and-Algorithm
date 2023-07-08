//evaluating postfix expression.
import java.util.*;
import java.io.*;
public class evaluateexpression{
static int expression1(String exp)
{
Stack <Integer> st=new Stack<>();
for(int i=0;i<exp.length();i++)
{
char c=exp.charAt(i);
if(Character.isDigit(c))
{
st.push(c-'0');
}
else
{
int val1=st.pop();
int val2=st.pop();
switch(c)
{
case '+':
st.push(val2+val1);
break;
case '-':
st.push(val2-val1);
break;
case '*':
st.push(val2*val1);
break;
case '/':
st.push(val2/val1);
break;
}
}
}
return st.pop();
}
public static void main(String[] args)
{
String exp="23*45+*";
int a=expression1(exp);
System.out.println(a);
}
}

