//1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FlipIt<T> {
private T[] arr;

    private FlipIt(T... arr) {
        this.arr = arr;
    }


    public void flip(T[] arr,int firstPos, int secondPos){
        T buf=arr[firstPos];
        arr[firstPos]=arr[secondPos];
        arr[secondPos]=buf;
    }

    public List<T> asList(T[] arr){
        List<T>  listik;

        listik = Arrays.asList(arr);

        return listik;
    }


    public static void main(String[] args) {
        FlipIt<String> flipIt = new FlipIt<>("1", "2", "3", "4", "5");
            System.out.println( "Массив! " + Arrays.toString(flipIt.arr));
            flipIt.flip(flipIt.arr,0,2);
        System.out.println("New Массив! " + Arrays.toString(flipIt.arr));


        System.out.println("New New Массив!"+ flipIt.asList(flipIt.arr));

    }
}
