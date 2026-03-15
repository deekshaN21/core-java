class Google {

    String name;
    String founder;
    int foundedYear;
    String ceo;
    String headquarters;
    int employees;
    double revenue;
    String product1;
    String product2;
    String product3;
    boolean publicCompany;
    String country;
    String website;
    String service1;
    String service2;
    String service3;
    String service4;
    String service5;
    String service6;
    String service7;

    Google(String name,String founder,int foundedYear,String ceo,String headquarters,
           int employees,double revenue,String product1,String product2,String product3,
           boolean publicCompany,String country,String website,String service1,
           String service2,String service3,String service4,String service5,
           String service6,String service7){

        this.name=name;
        this.founder=founder;
        this.foundedYear=foundedYear;
        this.ceo=ceo;
        this.headquarters=headquarters;
        this.employees=employees;
        this.revenue=revenue;
        this.product1=product1;
        this.product2=product2;
        this.product3=product3;
        this.publicCompany=publicCompany;
        this.country=country;
        this.website=website;
        this.service1=service1;
        this.service2=service2;
        this.service3=service3;
        this.service4=service4;
        this.service5=service5;
        this.service6=service6;
        this.service7=service7;
    }

    void display(){
        System.out.println(name);
        System.out.println(founder);
        System.out.println(foundedYear);
        System.out.println(ceo);
        System.out.println(headquarters);
        System.out.println(employees);
        System.out.println(revenue);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(publicCompany);
        System.out.println(country);
        System.out.println(website);
        System.out.println(service1);
        System.out.println(service2);
        System.out.println(service3);
        System.out.println(service4);
        System.out.println(service5);
        System.out.println(service6);
        System.out.println(service7);
    }
}