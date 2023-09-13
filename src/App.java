import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner tangentbord=new Scanner(System.in);
    System.out.println("Skriv in en text:");
    String text= tangentbord.nextLine();
    System.out.println(text.length());

    System.out.println("Skriv in en text:");
    String text2= tangentbord.nextLine();
    System.out.println(text2.indexOf("Noah"));
    }
}
