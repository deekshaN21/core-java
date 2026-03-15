class Office {

    String name;
    String location;
    String city;
    String companyType;
    int employees;
    int floors;
    double area;
    boolean cafeteria;
    boolean parking;
    String manager;
    String country;
    String department1;
    String department2;
    String department3;
    String buildingType;
    String internetType;
    String powerBackup;
    String security;
    String establishedYear;
    String category;

    Office(String name,String location,String city,String companyType,int employees,int floors,double area,
           boolean cafeteria,boolean parking,String manager,String country,String department1,
           String department2,String department3,String buildingType,String internetType,
           String powerBackup,String security,String establishedYear,String category){

        this.name=name;
        this.location=location;
        this.city=city;
        this.companyType=companyType;
        this.employees=employees;
        this.floors=floors;
        this.area=area;
        this.cafeteria=cafeteria;
        this.parking=parking;
        this.manager=manager;
        this.country=country;
        this.department1=department1;
        this.department2=department2;
        this.department3=department3;
        this.buildingType=buildingType;
        this.internetType=internetType;
        this.powerBackup=powerBackup;
        this.security=security;
        this.establishedYear=establishedYear;
        this.category=category;
    }

    void display(){
        System.out.println(name);
        System.out.println(location);
        System.out.println(city);
        System.out.println(companyType);
        System.out.println(employees);
        System.out.println(floors);
        System.out.println(area);
        System.out.println(cafeteria);
        System.out.println(parking);
        System.out.println(manager);
        System.out.println(country);
        System.out.println(department1);
        System.out.println(department2);
        System.out.println(department3);
        System.out.println(buildingType);
        System.out.println(internetType);
        System.out.println(powerBackup);
        System.out.println(security);
        System.out.println(establishedYear);
        System.out.println(category);
    }
}