class VacuumCleanerExecutor {

    public static void main(String[] args){

        String brand = VacuumCleaner.getBrand();
        String model = VacuumCleaner.getModel();
        int price = VacuumCleaner.getPrice();
        int power = VacuumCleaner.getPower();
        String type = VacuumCleaner.getType();
        double capacity = VacuumCleaner.getDustCapacity();
        boolean bagless = VacuumCleaner.getBagless();
        boolean hepa = VacuumCleaner.getHEPAFilter();
        int cord = VacuumCleaner.getCordLength();
        boolean blower = VacuumCleaner.getBlowerFunction();
        String color = VacuumCleaner.getColor();
        int warranty = VacuumCleaner.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Power: " + power + " Watts");
        System.out.println("Type: " + type);
        System.out.println("Dust Capacity: " + capacity + " Litres");
        System.out.println("Bagless: " + bagless);
        System.out.println("HEPA Filter: " + hepa);
        System.out.println("Cord Length: " + cord + " Meters");
        System.out.println("Blower Function: " + blower);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
