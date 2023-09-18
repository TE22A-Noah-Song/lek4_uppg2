import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner tangentbord=new Scanner(System.in);
    System.out.println("Skriv in en text:");
    String text= tangentbord.nextLine();
    System.out.println("\"" + text + "\" har " + text.length() + " bokstäver");


    System.out.println("Skriv in en text:");
    String text2= tangentbord.nextLine();
    System.out.println(text2.indexOf("Noah"));
    
    String text3= "Noah";
    String result =text3.substring(0, 3);
    System.out.println(result);

    String noah="noah söng";
    Boolean svar=noah.equals("noah söng");
    System.out.println(svar);
    }
}
