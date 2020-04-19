package Class;

public class Food {
    private String name;
    private Double price;
    private Integer calorieCount;
    private ItemType type;

    public Food(String name, Double price, Integer calorieCount, ItemType type) {
        this.name = name;
        this.price = price;
        this.calorieCount = calorieCount;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getCalorieCount() {
        return calorieCount;
    }

    public ItemType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCalorieCount(Integer calorieCount) {
        this.calorieCount = calorieCount;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
