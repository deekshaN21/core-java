class Heater {

    String brand;
    String type;
    String color;
    double power;
    double voltage;
    double price;
    boolean portable;
    boolean adjustableTemperature;
    String usage;
    String safetyFeature;
    String manufacturer;
    String originCountry;

    Heater(String brand,String type,String color,double power,double voltage,
           double price,boolean portable,boolean adjustableTemperature,
           String usage,String safetyFeature,String manufacturer,String originCountry){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.power = power;
        this.voltage = voltage;
        this.price = price;
        this.portable = portable;
        this.adjustableTemperature = adjustableTemperature;
        this.usage = usage;
        this.safetyFeature = safetyFeature;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
        System.out.println("Voltage: " + voltage);
        System.out.println("Price: " + price);
        System.out.println("Portable: " + portable);
        System.out.println("Adjustable Temperature: " + adjustableTemperature);
        System.out.println("Usage: " + usage);
        System.out.println("Safety Feature: " + safetyFeature);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}