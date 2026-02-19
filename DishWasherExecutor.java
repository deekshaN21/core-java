class DishWasherExecutor {

    public static void main(String[] args){

        String brand = DishWasher.getBrand();
        String model = DishWasher.getModel();
        int price = DishWasher.getPrice();
        int capacity = DishWasher.getCapacity();
        int water = DishWasher.getWaterConsumption();
        String energy = DishWasher.getEnergyRating();
        boolean heater = DishWasher.getHeater();
        boolean childLock = DishWasher.getChildLock();
        int programs = DishWasher.getNumberOfPrograms();
        boolean delay = DishWasher.getDelayStart();
        String color = DishWasher.getColor();
        int warranty = DishWasher.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity + " Place Settings");
        System.out.println("Water Consumption: " + water + " Litres/Cycle");
        System.out.println("Energy Rating: " + energy);
        System.out.println("Heater Available: " + heater);
        System.out.println("Child Lock: " + childLock);
        System.out.println("Number of Programs: " + programs);
        System.out.println("Delay Start: " + delay);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Years");
    }
}
