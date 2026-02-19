class PrinterExecutor {

    public static void main(String[] args){

        String brand = Printer.getBrand();
        String model = Printer.getModel();
        int price = Printer.getPrice();
        String type = Printer.getType();
        boolean colorPrint = Printer.getColorPrinting();
        boolean scanner = Printer.getScanner();
        boolean wifi = Printer.getWiFi();
        int speed = Printer.getPrintSpeed();
        int capacity = Printer.getPaperCapacity();
        String connectivity = Printer.getConnectivity();
        String color = Printer.getColor();
        int warranty = Printer.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Color Printing: " + colorPrint);
        System.out.println("Scanner Available: " + scanner);
        System.out.println("WiFi Support: " + wifi);
        System.out.println("Print Speed: " + speed + " Pages/Minute");
        System.out.println("Paper Capacity: " + capacity + " Sheets");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Year");
    }
}
