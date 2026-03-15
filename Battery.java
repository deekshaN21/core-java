class Battery {

    String brand;
    String type;
    String size;
    double capacity;
    double voltage;
    double price;
    boolean rechargeable;
    String color;
    String usage;
    String packaging;
    String manufacturer;
    String expiryDate;

    Battery(String brand,String type,String size,double capacity,double voltage,
            double price,boolean rechargeable,String color,String usage,
            String packaging,String manufacturer,String expiryDate){

        this.brand = brand;
        this.type = type;
        this.size = size;
        this.capacity = capacity;
        this.voltage = voltage;
        this.price = price;
        this.rechargeable = rechargeable;
        this.color = color;
        this.usage = usage;
        this.packaging = packaging;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);
        System.out.println("Voltage: " + voltage);
        System.out.println("Price: " + price);
        System.out.println("Rechargeable: " + rechargeable);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Expiry Date: " + expiryDate);
    }
}