import static java.lang.Math.sin;

/**
 * Class Calculation
 *
 * @author
 * @version  1.0
 * Клас для прорахування прикладу
 */
public class Calculation
{
    /**
     * Method Calculate
     * @param x
     * @return y
     * Метод, який рахує
     */
    public double Calculate(int x)
    {
        double y = 0, rad;
        rad = x * Math.PI / 180.0;
        try
        {
            if (x == 0 || rad == Math.PI / 2 || rad == 3*Math.PI / 2) // Якщо х є нулем, кидаємо помилку, бо на нуль ділити не можна. Також кидаємо полику,  якщо для такого значення х неіснує тангенса
            {
                throw new ArithmeticException();
            }
            y = (x - 4) / sin(3*x - 1);  // Тут вже цілий приклад
            if (y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY) // кидаємо помилку, якщо результат є нескінченність
            {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException e) // Ловим помилки і виводим причину помилки
        {
            if (rad == Math.PI / 2 || rad == 3*Math.PI / 2)
            {
                throw new MyException("Exception reason: Illegal value of X for tangent calculation");
            }
            if (x == 0)
            {
                throw new MyException("Exception reason: 3*x - 1 = 0");
            }
        }
        return y;
    }
}
