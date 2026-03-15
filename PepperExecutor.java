class PepperExecutor {

    public static void main(String[] args) {

        Pepper p1 = new Pepper("Black Pepper","Spice","Black","India","Strong",
        500,1.0,true,true,"Packet","Everest","Everest Ltd","India",
        "Cooking","High",10,"Dry","A","Yes","12/2027");
        p1.display();

        Pepper p2 = new Pepper("White Pepper","Spice","White","India","Mild",
        600,1.0,true,false,"Packet","MDH","MDH Ltd","India",
        "Cooking","High",8,"Dry","A","Yes","11/2027");
        p2.display();

        Pepper p3 = new Pepper("Green Pepper","Spice","Green","Brazil","Fresh",
        550,1.2,false,true,"Bottle","Catch","Catch Ltd","India",
        "Cooking","Medium",6,"Dry","B","No","10/2027");
        p3.display();

        Pepper p4 = new Pepper("Red Pepper","Spice","Red","China","Hot",
        450,0.8,false,true,"Packet","Local","Local Ltd","China",
        "Cooking","Medium",7,"Dry","B","No","09/2027");
        p4.display();

        Pepper p5 = new Pepper("Organic Pepper","Spice","Black","India","Strong",
        700,1.0,true,true,"Bottle","OrganicFarm","OrganicFarm Ltd","India",
        "Cooking","High",5,"Dry","A","Yes","12/2028");
        p5.display();

        Pepper p6 = new Pepper("Premium Pepper","Spice","Black","Vietnam","Strong",
        650,1.0,true,true,"Packet","Premium","Premium Ltd","Vietnam",
        "Cooking","High",9,"Dry","A","Yes","10/2028");
        p6.display();

        Pepper p7 = new Pepper("Farm Pepper","Spice","Black","India","Strong",
        480,1.1,false,true,"Packet","FarmFresh","FarmFresh Ltd","India",
        "Cooking","Medium",12,"Dry","B","No","08/2027");
        p7.display();

        Pepper p8 = new Pepper("Export Pepper","Spice","Black","India","Strong",
        750,1.0,true,true,"Bottle","Export","Export Ltd","India",
        "Cooking","High",4,"Dry","A","Yes","11/2028");
        p8.display();

        Pepper p9 = new Pepper("Kitchen Pepper","Spice","Black","India","Strong",
        400,0.9,false,true,"Packet","Kitchen","Kitchen Ltd","India",
        "Cooking","Medium",15,"Dry","B","No","07/2027");
        p9.display();

        Pepper p10 = new Pepper("Chef Pepper","Spice","Black","Italy","Strong",
        800,1.0,true,true,"Bottle","Chef","Chef Ltd","Italy",
        "Cooking","High",3,"Dry","A","Yes","01/2029");
        p10.display();

    }
}