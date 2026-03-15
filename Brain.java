class Brain {

    String part1;
    String part2;
    String function1;
    String function2;
    String function3;
    String color;
    double weight;
    String system;
    String protection;
    String cellType;
    String neuronType;
    String location;
    String control;
    String signalType;
    String memoryType;
    String learningType;
    boolean active;
    int neurons;
    String species;
    String health;

    Brain(String part1,String part2,String function1,String function2,String function3,String color,
          double weight,String system,String protection,String cellType,String neuronType,String location,
          String control,String signalType,String memoryType,String learningType,
          boolean active,int neurons,String species,String health){

        this.part1=part1;
        this.part2=part2;
        this.function1=function1;
        this.function2=function2;
        this.function3=function3;
        this.color=color;
        this.weight=weight;
        this.system=system;
        this.protection=protection;
        this.cellType=cellType;
        this.neuronType=neuronType;
        this.location=location;
        this.control=control;
        this.signalType=signalType;
        this.memoryType=memoryType;
        this.learningType=learningType;
        this.active=active;
        this.neurons=neurons;
        this.species=species;
        this.health=health;
    }

    void display(){
        System.out.println(part1);
        System.out.println(part2);
        System.out.println(function1);
        System.out.println(function2);
        System.out.println(function3);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(system);
        System.out.println(protection);
        System.out.println(cellType);
        System.out.println(neuronType);
        System.out.println(location);
        System.out.println(control);
        System.out.println(signalType);
        System.out.println(memoryType);
        System.out.println(learningType);
        System.out.println(active);
        System.out.println(neurons);
        System.out.println(species);
        System.out.println(health);
    }
}