class Cell {

    String name;
    String type;
    String function;
    String shape;
    String nucleus;
    String membrane;
    String cytoplasm;
    String organelle1;
    String organelle2;
    String organelle3;
    double size;
    String discovery;
    String scientist;
    String species;
    String reproduction;
    String energySource;
    boolean living;
    int chromosome;
    String studyField;
    String category;

    Cell(String name,String type,String function,String shape,String nucleus,String membrane,String cytoplasm,
         String organelle1,String organelle2,String organelle3,double size,String discovery,String scientist,
         String species,String reproduction,String energySource,boolean living,int chromosome,
         String studyField,String category){

        this.name=name;
        this.type=type;
        this.function=function;
        this.shape=shape;
        this.nucleus=nucleus;
        this.membrane=membrane;
        this.cytoplasm=cytoplasm;
        this.organelle1=organelle1;
        this.organelle2=organelle2;
        this.organelle3=organelle3;
        this.size=size;
        this.discovery=discovery;
        this.scientist=scientist;
        this.species=species;
        this.reproduction=reproduction;
        this.energySource=energySource;
        this.living=living;
        this.chromosome=chromosome;
        this.studyField=studyField;
        this.category=category;
    }

    void display(){
        System.out.println(name);
        System.out.println(type);
        System.out.println(function);
        System.out.println(shape);
        System.out.println(nucleus);
        System.out.println(membrane);
        System.out.println(cytoplasm);
        System.out.println(organelle1);
        System.out.println(organelle2);
        System.out.println(organelle3);
        System.out.println(size);
        System.out.println(discovery);
        System.out.println(scientist);
        System.out.println(species);
        System.out.println(reproduction);
        System.out.println(energySource);
        System.out.println(living);
        System.out.println(chromosome);
        System.out.println(studyField);
        System.out.println(category);
    }
}