class Stand {

    String brand;
    String type;
    String material;
    String color;
    double height;
    double width;
    double weight;
    double price;
    boolean adjustable;
    boolean foldable;
    String usage;
    String shape;
    String manufacturer;
    String country;
    String design;
    String finish;
    int capacity;
    String packaging;
    String durability;
    String warranty;

    Stand(String brand,String type,String material,String color,double height,
          double width,double weight,double price,boolean adjustable,boolean foldable,
          String usage,String shape,String manufacturer,String country,String design,
          String finish,int capacity,String packaging,String durability,String warranty){

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.price = price;
        this.adjustable = adjustable;
        this.foldable = foldable;
        this.usage = usage;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.country = country;
        this.design = design;
        this.finish = finish;
        this.capacity = capacity;
        this.packaging = packaging;
        this.durability = durability;
        this.warranty = warranty;
    }

    void display(){

        System.out.println(brand);
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(height);
        System.out.println(width);
        System.out.println(weight);
        System.out.println(price);
        System.out.println(adjustable);
        System.out.println(foldable);
        System.out.println(usage);
        System.out.println(shape);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(design);
        System.out.println(finish);
        System.out.println(capacity);
        System.out.println(packaging);
        System.out.println(durability);
        System.out.println(warranty);
    }
}