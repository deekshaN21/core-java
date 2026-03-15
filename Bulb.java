class Bulb {

    String brand;
    String type;
    String color;
    int wattage;
    double price;
    String shape;
    String baseType;
    boolean led;
    boolean rechargeable;
    String lightColor;
    String manufacturer;
    String originCountry;

    Bulb(String brand,String type,String color,int wattage,double price,
         String shape,String baseType,boolean led,boolean rechargeable,
         String lightColor,String manufacturer,String originCountry){

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.wattage = wattage;
        this.price = price;
        this.shape = shape;
        this.baseType = baseType;
        this.led = led;
        this.rechargeable = rechargeable;
        this.lightColor = lightColor;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Wattage: " + wattage);
        System.out.println("Price: " + price);
        System.out.println("Shape: " + shape);
        System.out.println("Base Type: " + baseType);
        System.out.println("LED: " + led);
        System.out.println("Rechargeable: " + rechargeable);
        System.out.println("Light Color: " + lightColor);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}