import java.util.Scanner;
class leetcode3{
public static void main(String args []){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");
int n=sc.nextInt();
if (n<0){
system.out.println("INVALID");
String result[]=newString[n];
for(int i=0; i<n; i++){
if(n%3==0&&n%5==0){
result[i]="fizzbuzz";
}
else if(n%3==0){
result[i]="fizz";
}
else if(n%5==0){
result[i]="buzz";
}
else{
result [i]=String.valueOf(i);
}
}
}
}
}