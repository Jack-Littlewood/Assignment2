public class Customer {
    private Integer numberOfCustomers;
    private Integer tableNumber;
    private Double totalCost;

    public Customer(Integer numberOfCustomers, Integer tableNumber, Double totalCost) {
        this.numberOfCustomers = numberOfCustomers;
        this.tableNumber = tableNumber;
        this.totalCost = totalCost;
    }

    public Integer getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setNumberOfCustomers(Integer numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }
}