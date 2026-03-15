class Shampoo {

    String brand;
    String type;
    String fragrance;
    String color;
    double quantity;
    double price;
    String hairType;
    boolean sulfateFree;
    boolean herbal;
    String manufacturer;
    String country;
    String packaging;
    String usage;
    String ingredient1;
    String ingredient2;
    String ingredient3;
    String expiryDate;
    int batchNumber;
    String category;
    String rating;

    Shampoo(String brand,String type,String fragrance,String color,double quantity,double price,
            String hairType,boolean sulfateFree,boolean herbal,String manufacturer,String country,
            String packaging,String usage,String ingredient1,String ingredient2,String ingredient3,
            String expiryDate,int batchNumber,String category,String rating){

        this.brand=brand;
        this.type=type;
        this.fragrance=fragrance;
        this.color=color;
        this.quantity=quantity;
        this.price=price;
        this.hairType=hairType;
        this.sulfateFree=sulfateFree;
        this.herbal=herbal;
        this.manufacturer=manufacturer;
        this.country=country;
        this.packaging=packaging;
        this.usage=usage;
        this.ingredient1=ingredient1;
        this.ingredient2=ingredient2;
        this.ingredient3=ingredient3;
        this.expiryDate=expiryDate;
        this.batchNumber=batchNumber;
        this.category=category;
        this.rating=rating;
    }

    void display(){

        System.out.println(brand);
        System.out.println(type);
        System.out.println(fragrance);
        System.out.println(color);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(hairType);
        System.out.println(sulfateFree);
        System.out.println(herbal);
        System.out.println(manufacturer);
        System.out.println(country);
        System.out.println(packaging);
        System.out.println(usage);
        System.out.println(ingredient1);
        System.out.println(ingredient2);
        System.out.println(ingredient3);
        System.out.println(expiryDate);
        System.out.println(batchNumber);
        System.out.println(category);
        System.out.println(rating);
    }
}