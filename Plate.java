class Plate {

    String brand;
    String material;
    String color;
    String shape;
    double diameter;
    double price;
    double weight;
    boolean microwaveSafe;
    boolean dishwasherSafe;
    String pattern;
    String size;
    String manufacturer;

    Plate(String brand,String material,String color,String shape,double diameter,
          double price,double weight,boolean microwaveSafe,boolean dishwasherSafe,
          String pattern,String size,String manufacturer){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.diameter = diameter;
        this.price = price;
        this.weight = weight;
        this.microwaveSafe = microwaveSafe;
        this.dishwasherSafe = dishwasherSafe;
        this.pattern = pattern;
        this.size = size;
        this.manufacturer = manufacturer;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Diameter: " + diameter);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Microwave Safe: " + microwaveSafe);
        System.out.println("Dishwasher Safe: " + dishwasherSafe);
        System.out.println("Pattern: " + pattern);
        System.out.println("Size: " + size);
        System.out.println("Manufacturer: " + manufacturer);
    }
}