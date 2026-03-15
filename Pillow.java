class Pillow {

    String brand;
    String material;
    String color;
    String shape;
    double price;
    double weight;
    String size;
    boolean washable;
    boolean hypoallergenic;
    String firmness;
    String coverType;
    String manufacturer;

    Pillow(String brand,String material,String color,String shape,double price,
           double weight,String size,boolean washable,boolean hypoallergenic,
           String firmness,String coverType,String manufacturer){

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.washable = washable;
        this.hypoallergenic = hypoallergenic;
        this.firmness = firmness;
        this.coverType = coverType;
        this.manufacturer = manufacturer;

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Washable: " + washable);
        System.out.println("Hypoallergenic: " + hypoallergenic);
        System.out.println("Firmness: " + firmness);
        System.out.println("Cover Type: " + coverType);
        System.out.println("Manufacturer: " + manufacturer);
    }
}