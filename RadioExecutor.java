class RadioExecutor {

    public static void main(String[] args){

        String brand = Radio.getBrand();
        String model = Radio.getModel();
        int price = Radio.getPrice();
        String type = Radio.getType();
        boolean am = Radio.getAMSupport();
        boolean fm = Radio.getFMSupport();
        boolean bluetooth = Radio.getBluetooth();
        boolean usb = Radio.getUSBPort();
        int battery = Radio.getBatteryLife();
        String color = Radio.getColor();
        int warranty = Radio.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("AM Support: " + am);
        System.out.println("FM Support: " + fm);
        System.out.println("Bluetooth: " + bluetooth);
        System.out.println("USB Port: " + usb);
        System.out.println("Battery Life: " + battery + " Hours");
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
