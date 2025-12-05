import java.io.*;
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();
int count = UserMainCode.countOccurance(s1,s2);
System.out.println(count);
sc.close();
}

class UserMainCode{
public static int countOccurance(String s1, String s2){
	int l1 = s1.length();
	int l2 = s2.length();
	int c = 0;
	int i = 0;
    while(i <= l1 - l2)
    {
        if(s1.substring(i, i + l2).equals(s2))
        {
        c++;
        }
        i++;
    }
    return c;
}
}
}
