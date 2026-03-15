class Bottle {

    String brand;
    String material;
    String color;
    double capacity;
    double price;
    double weight;
    String shape;
    boolean reusable;
    boolean insulated;
    String lidType;
    String size;
    String manufacturer;

    Bottle(String brand,String material,String color,double capacity,double price,
           double weight,String shape,boolean reusable,boolean insulated,
           String lidType,String size,String manufacturer){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.reusable = reusable;
        this.insulated = insulated;
        this.lidType = lidType;
        this.size = size;
        this.manufacturer = manufacturer;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Reusable: " + reusable);
        System.out.println("Insulated: " + insulated);
        System.out.println("Lid Type: " + lidType);
        System.out.println("Size: " + size);
        System.out.println("Manufacturer: " + manufacturer);
    }
}