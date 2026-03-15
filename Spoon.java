class Spoon {

    String brand;
    String material;
    String color;
    String type;
    double length;
    double weight;
    double price;
    String finish;
    boolean dishwasherSafe;
    boolean reusable;
    String shape;
    String manufacturer;

    Spoon(String brand,String material,String color,String type,double length,
          double weight,double price,String finish,boolean dishwasherSafe,
          boolean reusable,String shape,String manufacturer){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.length = length;
        this.weight = weight;
        this.price = price;
        this.finish = finish;
        this.dishwasherSafe = dishwasherSafe;
        this.reusable = reusable;
        this.shape = shape;
        this.manufacturer = manufacturer;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Finish: " + finish);
        System.out.println("Dishwasher Safe: " + dishwasherSafe);
        System.out.println("Reusable: " + reusable);
        System.out.println("Shape: " + shape);
        System.out.println("Manufacturer: " + manufacturer);
    }
}