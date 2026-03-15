class Organizer {

    String brand;
    String material;
    String color;
    int compartments;
    double price;
    String size;
    String usage;
    String type;
    String manufacturer;
    String country;
    String shape;
    boolean waterproof;
    boolean portable;
    String closureType;
    String design;
    String category;
    String weight;
    String durability;
    String warranty;
    String rating;

    Organizer(String brand,String material,String color,int compartments,double price,String size,
              String usage,String type,String manufacturer,String country,String shape,
              boolean waterproof,boolean portable,String closureType,String design,
              String category,String weight,String durability,String warranty,String rating){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.compartments=compartments;
        this.price=price;
        this.size=size;
        this.usage=usage;
        this.type=type;
        this.manufacturer=manufacturer;
        this.country=country;
        this.shape=shape;
        this.waterproof=waterproof;
        this.portable=portable;
        this.closureType=closureType;
        this.design=design;
        this.category=category;
        this.weight=weight;
        this.durability=durability;
        this.warranty=warranty;
        this.rating=rating;
    }

    void display(){
        System.out.println(brand);
        System.out.println(material);
        System.out.println(color);
        System.out.println(compartments);
        System.out.println(price);
        System.out.println(size);
        System.out.println(usage);
        System.out.println(type);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(shape);
        System.out.println(waterproof);
        System.out.println(portable);
        System.out.println(closureType);
        System.out.println(design);
        System.out.println(category);
        System.out.println(weight);
        System.out.println(durability);
        System.out.println(warranty);
        System.out.println(rating);
    }
}