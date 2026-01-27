import java.util.scanner;
public class Goft{
public static void main(string[] args){
	scanner sc = new Scanner(system.in);
	system.out.println("Enter First Number:");
	int n1 = sc.nextInt();
	system.out.println("Enter Second Number:");
	int n2 = sc.nextInt();
	system.out.println("Enter Third Number:");
	int n3 = sc.nextInt();
	 if(n1 >= n2 && n1 >= n3) 
        {
             System.out.println(n1 + " is the greatest");
        }
        else if (n2 >= n3) 
        {
             System.out.println(n2 + " is the greatest");
        }
        else {
            System.out.println(n3 + " is the greatest");
        }
    }
}
