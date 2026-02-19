class iPadExecutor {

    public static void main(String[] args){

        String brand = iPad.getBrand();
        String model = iPad.getModel();
        int price = iPad.getPrice();
        double screen = iPad.getScreenSize();
        String display = iPad.getDisplayType();
        int storage = iPad.getStorage();
        boolean cellular = iPad.getCellular();
        boolean touchID = iPad.getTouchID();
        boolean faceID = iPad.getFaceID();
        String color = iPad.getColor();
        int battery = iPad.getBatteryLife();
        int warranty = iPad.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screen + " Inches");
        System.out.println("Display Type: " + display);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Cellular: " + cellular);
        System.out.println("Touch ID: " + touchID);
        System.out.println("Face ID: " + faceID);
        System.out.println("Color: " + color);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Warranty: " + warranty + " Year");
    }
}
