import java.util.ArrayList;
import java.util.List;
import java.util.Random;






public class DZ_3 {

public static void main(String[] args) {
  
    List <Integer> array = rand (20);
    System.out.println("Изначальный список равен "+ " = " + array); 
    System.out.println("максимальное значение " + " = " + Maximum(array));
    System.out.println("минимальное значение " + " = " + Minimum(array));
    System.out.println("среднее значение " + " = " + Medium(array));
    System.out.println("список четных чисел " + " = " + EvenNumber (array));
}

    private static List<Integer> rand (int len){
    List <Integer> newList = new ArrayList<>();
    Random rnd = new Random();
    for (int i = 0; i < len; i++) {
        newList.add(rnd.nextInt(100));

    }
    return newList; 
    }

    private static Integer Maximum (List<Integer> newList){
        int count = newList.get(0);
        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i) > count) {
                count = newList.get(i);
            }
        }
        return count;
    }

    private static Integer Minimum (List<Integer> newList){
        int count = newList.get(0);
        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i) < count) {
                count = newList.get(i);
            }
        }
        return count;
    }

    private static Double Medium (List<Integer> newList){
        int count = 0;
        for (int i = 0; i < newList.size(); i++) {
                count += newList.get(i);
            }
            double med = count/newList.size();
            return med;
        }

    public static List<Integer> EvenNumber (List<Integer> newList) {
        List <Integer> array = new ArrayList<>();
        for (int i=0; i < newList.size(); i++) {
            int even = newList.get(i)%2;
            if (even == 0) {
            array.add(newList.get(i));          
         }
         }
             
    return array;
}
}
