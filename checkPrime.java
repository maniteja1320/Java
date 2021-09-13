import java.util.*;
public class checkPrime 
{ 
  
public static void main(String args[]) 
{  
   //check prime using sqrt method
   Scanner s = new Scanner(System.in);
   int a = s.nextInt(); 
   int i = 2; 
   if((a%2==0 && a!=2) || a==1) 
   { 
     System.out.println("Not Prime"); 
   } 
   else 
   { 
    float b = (float)Math.sqrt(a); 
    for(i=2;i<=b;i++) 
    { 
    } 
   if(i>b) 
    { 
    System.out.println("Prime"); 
    } 
   } 
 } 
}
