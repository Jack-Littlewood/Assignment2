package DomainClasses;
import Class.Food;
import Class.ItemType;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class FoodDomain {

    private ObservableList<Food>food;

    public FoodDomain() {
        food = FXCollections.observableArrayList();
        food.addAll();
    }


}