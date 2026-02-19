class MonitorExecutor {

    public static void main(String[] args){

        String brand = Monitor.getBrand();
        String model = Monitor.getModel();
        int price = Monitor.getPrice();
        double size = Monitor.getScreenSize();
        String resolution = Monitor.getResolution();
        int refreshRate = Monitor.getRefreshRate();
        String panel = Monitor.getPanelType();
        boolean hdmi = Monitor.getHDMI();
        boolean vga = Monitor.getVGA();
        int response = Monitor.getResponseTime();
        String color = Monitor.getColor();
        int warranty = Monitor.getWarranty();

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + size + " Inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
        System.out.println("Panel Type: " + panel);
        System.out.println("HDMI Support: " + hdmi);
        System.out.println("VGA Support: " + vga);
        System.out.println("Response Time: " + response + " ms");
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " Years");
    }
}
