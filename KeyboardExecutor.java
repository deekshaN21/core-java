class KeyboardExecutor {

    public static void main(String[] args){

        String brand = Keyboard.getBrand();
        String model = Keyboard.getModel();
        int price = Keyboard.getPrice();
        String type = Keyboard.getType();
        String connectivity = Keyboard.getConnectivity();
        boolean backlight = Keyboard.getBacklight();
        String layout = Keyboard.getLayout();
        int keys = Keyboard.getNumberOfKeys();
        boolean mechanical = Keyboard.getMechanical();
        int batteryLife = Keyboard.getBatteryLife();
        String color = Keyboard.getColor();
        int warranty = Keyboard.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Backlight: " + backlight);
        System.out.println("Layout: " + layout);
        System.out.println("Number of Keys: " + keys);
        System.out.println("Mechanical: " + mechanical);
        System.out.println("Battery Life: " + batteryLife + " Months");
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
