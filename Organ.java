class Organ {

    String name;
    String system;
    String function1;
    String function2;
    String color;
    double weight;
    String location;
    String shape;
    String tissueType;
    String cellType;
    String protection;
    String bloodSupply;
    String nerveSupply;
    String species;
    String healthStatus;
    boolean vital;
    int count;
    String discovery;
    String studyField;
    String category;

    Organ(String name,String system,String function1,String function2,String color,double weight,
          String location,String shape,String tissueType,String cellType,String protection,
          String bloodSupply,String nerveSupply,String species,String healthStatus,
          boolean vital,int count,String discovery,String studyField,String category){

        this.name=name;
        this.system=system;
        this.function1=function1;
        this.function2=function2;
        this.color=color;
        this.weight=weight;
        this.location=location;
        this.shape=shape;
        this.tissueType=tissueType;
        this.cellType=cellType;
        this.protection=protection;
        this.bloodSupply=bloodSupply;
        this.nerveSupply=nerveSupply;
        this.species=species;
        this.healthStatus=healthStatus;
        this.vital=vital;
        this.count=count;
        this.discovery=discovery;
        this.studyField=studyField;
        this.category=category;
    }

    void display(){
        System.out.println(name);
        System.out.println(system);
        System.out.println(function1);
        System.out.println(function2);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(location);
        System.out.println(shape);
        System.out.println(tissueType);
        System.out.println(cellType);
        System.out.println(protection);
        System.out.println(bloodSupply);
        System.out.println(nerveSupply);
        System.out.println(species);
        System.out.println(healthStatus);
        System.out.println(vital);
        System.out.println(count);
        System.out.println(discovery);
        System.out.println(studyField);
        System.out.println(category);
    }
}