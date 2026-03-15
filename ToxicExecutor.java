class ToxicExecutor {

    public static void main(String[] args) {

        Toxic t1=new Toxic("Chemical A","Liquid","HCl","Colorless","Strong",9.5,2,true,true,"Lab","ChemLab","India","Cool","Bottle","High","Use gloves",101,"Class A","Neutralize","2027");
        t1.display();

        Toxic t2=new Toxic("Chemical B","Gas","CO","Colorless","Odorless",8,1,true,true,"Industry","IndChem","USA","Tank","Cylinder","High","Use mask",102,"Class B","Burn","2026");
        t2.display();

        Toxic t3=new Toxic("Chemical C","Solid","NaCN","White","Mild",9,1,false,true,"Mining","MineChem","China","Dry","Box","High","Handle carefully",103,"Class A","Chemical treat","2027");
        t3.display();

        Toxic t4=new Toxic("Chemical D","Liquid","H2SO4","Clear","Strong",9.8,3,true,true,"Battery","PowerChem","India","Cool","Bottle","High","Wear gloves",104,"Class A","Neutralize","2028");
        t4.display();

        Toxic t5=new Toxic("Chemical E","Gas","Cl2","Green","Pungent",9,1,true,true,"Industry","GasChem","Germany","Tank","Cylinder","High","Use mask",105,"Class B","Burn","2027");
        t5.display();

        Toxic t6=new Toxic("Chemical F","Solid","Arsenic","Gray","None",8.5,1,false,true,"Research","LabChem","India","Dry","Box","High","Avoid contact",106,"Class A","Chemical treat","2028");
        t6.display();

        Toxic t7=new Toxic("Chemical G","Liquid","Methanol","Clear","Alcohol",7,2,true,true,"Fuel","FuelChem","USA","Cool","Bottle","Medium","Keep sealed",107,"Class C","Burn","2027");
        t7.display();

        Toxic t8=new Toxic("Chemical H","Liquid","Acetone","Clear","Strong",6.5,1,true,false,"Cleaning","CleanChem","India","Cool","Bottle","Medium","Use gloves",108,"Class C","Burn","2026");
        t8.display();

        Toxic t9=new Toxic("Chemical I","Gas","NH3","Colorless","Pungent",7.5,1,true,true,"Fertilizer","AgroChem","India","Tank","Cylinder","Medium","Use mask",109,"Class B","Neutralize","2027");
        t9.display();

        Toxic t10=new Toxic("Chemical J","Solid","Lead","Gray","None",8,1,false,true,"Industry","MetalChem","USA","Dry","Box","High","Avoid contact",110,"Class A","Recycle","2029");
        t10.display();
    }
}