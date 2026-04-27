package Encapsulation;

public class Main {
    public static void main (String[]args){

        Inventory inventory  = new Inventory();

        Item item1 = new Item ( "apples", 20);
        Item item2 = new Item ( "oranges?", 34);

        Fruit fruit = new Fruit("Fuji", "apple", 4);


        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(fruit);

        inventory.displayInventory();

        System.out.println("Testing out");
    }
}
