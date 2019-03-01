import java.util.*;

public class Box<T extends Fruit> {

private List<T> box = new ArrayList<>();

    private void addFruit(int count, T fruit){
        for (int i = 0; i < count; i++) {
            box.add(fruit);
        }
    }

    private Float getWeight(){
    return box.size()*box.get(0).getWeight();
}

    private <E> boolean  compare(Box<? extends E> anfr){
    return this.getWeight().equals(anfr.getWeight());
    }

    private void moveFruits(Box<T> anfr){
        for (T fruit: box ) {
            anfr.addFruit(1,fruit);
        }
        box.clear();
    }


    public static void main(String[] args) {
      Box<Orange> orangeBox = new Box<>();
      orangeBox.addFruit(5,new Orange());
      System.out.println("Коробка с апельсинками весит " + orangeBox.getWeight());
      Box<Apple> appleBox = new Box<>();
      appleBox.addFruit(3,new Apple());
        System.out.println("Коробка с яблочками весит " + appleBox.getWeight());
        System.out.println("Равен ли вес коробок? " + appleBox.compare(orangeBox));
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(1,new Orange());
        orangeBox.moveFruits(orangeBox1);
        System.out.println("Новая коробка с апельсинками весит " + orangeBox1.getWeight());
    }
}
