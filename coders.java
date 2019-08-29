
import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
int n,temp;
int s=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the no of coders:");
n=sc.nextInt();
int a[]=new int[n];
int c[]=new int[n];
System.out.println("enter the skill value of the coders:");
for(int i = 0; i < n; i++)
{
   a[i]=sc.nextInt();
   c[i]=0;
}

   for(int i = 0; i < n; i++)
            for(int j = 0; j < n-i-1; j++)
               if( a[j] > a[j+1])
               {
                temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
               }
        int i=1;
while(i!=n)
{
   int j=0;
   while(j<i)
   {
       if((a[i]!=a[j])&&(c[j]!=1))
      {
       c[j]=1;
       break;
      }
      j++;
   }
   i++;
}
for( i=0;i<n;i++){
   if(c[i]==0){
       s+=a[i];
   }
}
System.out.println(s);


}
}

