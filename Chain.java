class Chain {

    String brand;
    String material;
    String color;
    String design;
    double length;
    double weight;
    double price;
    boolean goldPlated;
    boolean adjustable;
    String style;
    String manufacturer;
    String originCountry;

    Chain(String brand,String material,String color,String design,double length,
          double weight,double price,boolean goldPlated,boolean adjustable,
          String style,String manufacturer,String originCountry){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.design = design;
        this.length = length;
        this.weight = weight;
        this.price = price;
        this.goldPlated = goldPlated;
        this.adjustable = adjustable;
        this.style = style;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Design: " + design);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Gold Plated: " + goldPlated);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Style: " + style);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Origin Country: " + originCountry);
    }
}