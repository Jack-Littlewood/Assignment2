package DomainClasses;
import Class.Food;
import Class.ItemType;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class FoodDomain {

    private ObservableList<Food>food;

    public FoodDomain() {
        food = FXCollections.observableArrayList();
        food.addAll(
                new Food("Soup of the day", 3.99, 250, ItemType.STARTER),
                new Food("BBQ Chicken Wings", 4.29, 300, ItemType.STARTER),
                new Food("Chicken Liver Pate", 4.49, 200, ItemType.STARTER),
                new Food("Chicken Strips", 4.99, 400, ItemType.STARTER),
                new Food("Steak and Chips", 7.95, 800, ItemType.MAIN),
                new Food("Chicken Supreme", 8.99, 925, ItemType.MAIN),
                new Food("Steak and Ale Pie", 6.99, 600, ItemType.MAIN),
                new Food("Mixed Grill", 14.99, 1000, ItemType.MAIN),
                new Food("Caesar Salad", 7.99, 550, ItemType.MAIN),
                new Food("Burger and Chips", 9.99, 750, ItemType.MAIN),
                new Food("Apple Pie", 4.25, 300, ItemType.DESSERT),
                new Food("Banana Split", 4.99, 200, ItemType.DESSERT),
                new Food("Sticky Toffee Pudding", 4.99, 300, ItemType.DESSERT),
                new Food("Raspberry Pavlova", 4.25, 200, ItemType.DESSERT));

    }
}














