import java.lang.* ;
import java.io.*;
import java.util.*;
class javaprog
{
public static void main(String args[])
{
System.out.print("Enter a number for table :");
int a;
Scanner  s = new Scanner(System.in);
a = s.nextInt();
for(int i =1;i<11;i++)
{
System.out.println(a+"*"+i+"="+a*i );
}
}
}
 