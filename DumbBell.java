class DumbBell {

    String brand;
    String type;
    String material;
    String color;
    double weight;
    double length;
    double price;
    String gripType;
    boolean rubberCoated;
    boolean adjustable;
    String usage;
    String manufacturer;
    String country;
    String gymType;
    String shape;
    String finish;
    int quantity;
    String packaging;
    String category;
    String warranty;

    DumbBell(String brand,String type,String material,String color,double weight,double length,double price,
             String gripType,boolean rubberCoated,boolean adjustable,String usage,String manufacturer,
             String country,String gymType,String shape,String finish,int quantity,String packaging,
             String category,String warranty){

        this.brand=brand;
        this.type=type;
        this.material=material;
        this.color=color;
        this.weight=weight;
        this.length=length;
        this.price=price;
        this.gripType=gripType;
        this.rubberCoated=rubberCoated;
        this.adjustable=adjustable;
        this.usage=usage;
        this.manufacturer=manufacturer;
        this.country=country;
        this.gymType=gymType;
        this.shape=shape;
        this.finish=finish;
        this.quantity=quantity;
        this.packaging=packaging;
        this.category=category;
        this.warranty=warranty;
    }

    void display(){
        System.out.println(brand);
        System.out.println(type);
        System.out.println(material);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(length);
        System.out.println(price);
        System.out.println(gripType);
        System.out.println(rubberCoated);
        System.out.println(adjustable);
        System.out.println(usage);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(gymType);
        System.out.println(shape);
        System.out.println(finish);
        System.out.println(quantity);
        System.out.println(packaging);
        System.out.println(category);
        System.out.println(warranty);
    }
}