class CellExecutor {

    public static void main(String[] args) {

        Cell c1=new Cell("AnimalCell","Eukaryotic","LifeProcess","Round","Present","Present","Present","Mitochondria","Golgi","Ribosome",10,"1665","RobertHooke","Human","Mitosis","Glucose",true,46,"Biology","Living");
        c1.display();

        Cell c2=new Cell("PlantCell","Eukaryotic","Photosynthesis","Rectangular","Present","Present","Present","Chloroplast","Vacuole","Ribosome",20,"1665","RobertHooke","Plant","Mitosis","Sunlight",true,20,"Biology","Living");
        c2.display();

        Cell c3=new Cell("Bacteria","Prokaryotic","Metabolism","Rod","Absent","Present","Present","Flagella","Ribosome","Plasmid",5,"1674","Leeuwenhoek","Bacteria","Binary","Organic",true,1,"Microbiology","Microbe");
        c3.display();

        Cell c4=new Cell("Neuron","Specialized","Signal","Star","Present","Present","Present","Axon","Dendrite","Mitochondria",15,"1800","Scientist","Human","Mitosis","Glucose",true,46,"Biology","Nerve");
        c4.display();

        Cell c5=new Cell("MuscleCell","Specialized","Movement","Long","Present","Present","Present","Mitochondria","Ribosome","Actin",50,"1800","Scientist","Human","Mitosis","ATP",true,46,"Biology","Muscle");
        c5.display();

        Cell c6=new Cell("BloodCell","Specialized","Transport","Round","Present","Present","Present","Hemoglobin","Ribosome","Membrane",8,"1800","Scientist","Human","Mitosis","Oxygen",true,46,"Biology","Blood");
        c6.display();

        Cell c7=new Cell("SkinCell","Specialized","Protection","Flat","Present","Present","Present","Keratin","Ribosome","Membrane",12,"1800","Scientist","Human","Mitosis","Glucose",true,46,"Biology","Skin");
        c7.display();

        Cell c8=new Cell("FatCell","Specialized","Storage","Round","Present","Present","Present","Lipid","Ribosome","Membrane",30,"1800","Scientist","Human","Mitosis","Fat",true,46,"Biology","Fat");
        c8.display();

        Cell c9=new Cell("StemCell","Specialized","Repair","Round","Present","Present","Present","Nucleus","Ribosome","Membrane",10,"1900","Scientist","Human","Mitosis","Glucose",true,46,"Biology","Stem");
        c9.display();

        Cell c10=new Cell("EggCell","Specialized","Reproduction","Round","Present","Present","Present","Nucleus","Mitochondria","Membrane",100,"1800","Scientist","Human","Meiosis","Glucose",true,23,"Biology","Reproductive");
        c10.display();
    }
}