package package7;
interface Intarfacevclass
{
void func(String str);
}
class ProcessString implements Intarfacevclass
{
   public  void func(String str)
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        Intarfacevclass test = new ProcessString();
        String str=("АБВГДЕ");
        test.func(str);
    }
}
