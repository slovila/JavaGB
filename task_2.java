//Сила тяжести на Луне составляет около 17% земной. Напишите программу, 
//которая вычислила бы ваш вес на Луне.

package JavaGB;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваш вес: ");
        int weight = s.nextInt();
        double ratio = 0.17;
        double weightOfMoon = weight * ratio;
        weightOfMoon = new BigDecimal(weightOfMoon).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
        System.out.println("Ваш вес на луне составляет: "+weightOfMoon+" кг.");
    }
    
}
