package leetcode;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        try {
            fruit[0] = new Fruit();
            System.out.println("add fruit in index 0");
        }catch (Exception e){
            System.out.println("cant put fruit in index 0");
        }

        try {
            fruit[0] = new Orange();
            System.out.println("add orange in index 0");
        }catch (Exception e){
            System.out.println("cant put orange in index 0");
        }
    }
}
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends  Fruit{}