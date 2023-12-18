public class Main
{
    public static void main(String[] args)
    {
        Basket<? super Item> basket = new Basket<>();

        basket.AddItem(new Package(32, "Pencils", "black"));
        basket.AddItem(new Package(31, "T-Shirts", "white"));
        basket.AddItem(new Box(65, "Sneakers"));
        basket.AddItem(new Box(40, "Hoodies"));
        basket.AddItem(new Package(13, "Cables", "white"));
        basket.AddItem(new Box(65, "Books"));
        basket.AddItem(new Package(15, "Socks", "brown"));

       /* var max=  basket.FindMax();
        System.out.print("\nMax element is: ");
        max.PrintInfo();*/
        basket.AddItem(new Box(40, "Hoodies"));
        main1();
        System.out.print("Amount of volumes == 40: " + Box.count);
    }
    public static void main1() {
        Basket<? super Item> basket = new Basket<>();
        basket.AddItem(new Box(40, "Hoodies"));
    }
}