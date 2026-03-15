class Belt {

    String brand;
    String material;
    String color;
    String type;
    double length;
    double width;
    double price;
    boolean adjustable;
    String buckleType;
    String style;
    String manufacturer;
    String originCountry;

    Belt(String brand,String material,String color,String type,double length,
         double width,double price,boolean adjustable,String buckleType,
         String style,String manufacturer,String originCountry){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.length = length;
        this.width = width;
        this.price = price;
        this.adjustable = adjustable;
        this.buckleType = buckleType;
        this.style = style;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Price: " + price);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Buckle Type: " + buckleType);
        System.out.println("Style: " + style);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}