import java.util.Scanner;
public class tp1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez votre nom");
        String nom = sc.next();
        System.out.println("Saisissez votre nom");
        String prenom = sc.next();
        System.out.println("Bonjour "+nom+" "+prenom+" !");
    }
}
