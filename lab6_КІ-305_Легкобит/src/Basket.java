import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Item>
{
    private final List<T> arr;

    public Basket()
    {
        arr = new ArrayList<T>();
    }

    public T FindMax()
    {
        if (arr.isEmpty())
        {
            return null;
        }
        else
        {
            T max = arr.get(0);
            for (int i = 1; i < arr.size(); i++)
            {
                if (arr.get(i).getVolume() > max.getVolume())
                {
                    max = arr.get(i);
                }
            }
            return max;
        }
    }

    public void AddItem(T item)
    {
        arr.add(item);
        var index = arr.indexOf(item);
        System.out.print("Element was added: index - " + index + "; ");
        item.PrintInfo();
    }

    public void DeleteItem(int i)
    {
        System.out.print("Element on index " + i + " was deleted: ");
        arr.get(i).PrintInfo();
        arr.remove(i);
    }

    public void PrintAllItems()
    {
        for(T el : arr)
        {
            el.PrintInfo();
        }
    }
}
