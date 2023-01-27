import java.util.Scanner;
public class tp1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nai;
        int annee,age;
        nai = sc.next();
        annee = Integer.parseInt(nai);
        age = 2023 - annee;
        System.out.println("Vous avez ou aurez " + age +" ans cette année.");
    }
}

