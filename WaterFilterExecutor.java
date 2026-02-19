class WaterFilterExecutor {

    public static void main(String[] args){

        String brand = WaterFilter.getBrand();
        String model = WaterFilter.getModel();
        int price = WaterFilter.getPrice();
        String tech = WaterFilter.getPurificationTechnology();
        int storage = WaterFilter.getStorageCapacity();
        int capacity = WaterFilter.getPurificationCapacity();
        boolean tds = WaterFilter.getTDSController();
        boolean mineral = WaterFilter.getMineralRetention();
        boolean autoShut = WaterFilter.getAutoShutOff();
        String install = WaterFilter.getInstallationType();
        String color = WaterFilter.getColor();
        int warranty = WaterFilter.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Purification Technology: " + tech);
        System.out.println("Storage Capacity: " + storage + " Litres");
        System.out.println("Purification Capacity: " + capacity + " Litres/Hour");
        System.out.println("TDS Controller: " + tds);
        System.out.println("Mineral Retention: " + mineral);
        System.out.println("Auto Shut-Off: " + autoShut);
        System.out.println("Installation Type: " + install);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
