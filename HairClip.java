class HairClip {

    String brand;
    String material;
    String color;
    String style;
    double size;
    double price;
    boolean decorative;
    boolean strongGrip;
    String shape;
    String usage;
    String manufacturer;
    String originCountry;

    HairClip(String brand,String material,String color,String style,double size,
             double price,boolean decorative,boolean strongGrip,String shape,
             String usage,String manufacturer,String originCountry){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.style = style;
        this.size = size;
        this.price = price;
        this.decorative = decorative;
        this.strongGrip = strongGrip;
        this.shape = shape;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Style: " + style);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Decorative: " + decorative);
        System.out.println("Strong Grip: " + strongGrip);
        System.out.println("Shape: " + shape);
        System.out.println("Usage: " + usage);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}