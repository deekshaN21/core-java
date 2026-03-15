class Map {

    String name;
    String type;
    String region;
    String country;
    String language;
    double scale;
    double width;
    double height;
    boolean colored;
    boolean laminated;
    String publisher;
    String material;
    String theme;
    String usage;
    String manufacturer;
    String originCountry;
    int edition;
    String packaging;
    String format;
    String releaseYear;

    Map(String name,String type,String region,String country,String language,
        double scale,double width,double height,boolean colored,boolean laminated,
        String publisher,String material,String theme,String usage,String manufacturer,
        String originCountry,int edition,String packaging,String format,String releaseYear){

        this.name = name;
        this.type = type;
        this.region = region;
        this.country = country;
        this.language = language;
        this.scale = scale;
        this.width = width;
        this.height = height;
        this.colored = colored;
        this.laminated = laminated;
        this.publisher = publisher;
        this.material = material;
        this.theme = theme;
        this.usage = usage;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.edition = edition;
        this.packaging = packaging;
        this.format = format;
        this.releaseYear = releaseYear;
    }

    void display(){

        System.out.println(name);
        System.out.println(type);
        System.out.println(region);
        System.out.println(country);
        System.out.println(language);
        System.out.println(scale);
        System.out.println(width);
        System.out.println(height);
        System.out.println(colored);
        System.out.println(laminated);
        System.out.println(publisher);
        System.out.println(material);
        System.out.println(theme);
        System.out.println(usage);
        System.out.println(manufacturer);
        System.out.println(originCountry);
        System.out.println(edition);
        System.out.println(packaging);
        System.out.println(format);
        System.out.println(releaseYear);
    }
}