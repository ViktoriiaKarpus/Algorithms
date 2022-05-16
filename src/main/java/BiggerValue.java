public class BiggerValue {
    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    public int biggerValue(int a, int b) {
        int max = 0;
        if (a == b) {
            return a - b;
        }
        if (a < b) {
             max = b;
        } else {
            max = a;
        }
      return max;
    }

}
