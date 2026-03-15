class Charger {

    String brand;
    String type;
    String color;
    double price;
    int voltage;
    int power;
    String connectorType;
    boolean fastCharging;
    double cableLength;
    String compatibleDevice;
    String manufacturer;
    String originCountry;

    Charger(String brand,String type,String color,double price,int voltage,
            int power,String connectorType,boolean fastCharging,double cableLength,
            String compatibleDevice,String manufacturer,String originCountry){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.voltage = voltage;
        this.power = power;
        this.connectorType = connectorType;
        this.fastCharging = fastCharging;
        this.cableLength = cableLength;
        this.compatibleDevice = compatibleDevice;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Voltage: " + voltage);
        System.out.println("Power: " + power);
        System.out.println("Connector Type: " + connectorType);
        System.out.println("Fast Charging: " + fastCharging);
        System.out.println("Cable Length: " + cableLength);
        System.out.println("Compatible Device: " + compatibleDevice);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}