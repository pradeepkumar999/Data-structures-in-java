import java.util.Scanner;
public class FarenheitToCelsius {
    public static void main (String[] args){
        float s;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the temparature in farenheit");
        s=sc.nextFloat();
        s=((s-32)*5)/9;
        System.out.println(s);

    }
}
