package qwerty;
import java.util.Scanner;
class ShopClass implements Printable
{
    String name;
    public ShopClass(String name)
    {
        this.name = name;
        print();
    }
    public void print ()
    {
        System.out.println(toString());
    }
    @Override
    public String toString()
    {
        return "Shop:" + name ;
    }
}
public class Shop
{
    public static void main (String args [])
    {
        Scanner in = new Scanner(System.in);
        String Name;
        System.out.printf("Введите название магазина:");
        Name = in.nextLine();
        Printable per8 = new ShopClass (Name);
    }
}
