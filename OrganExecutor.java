class OrganExecutor {

    public static void main(String[] args) {

        Organ o1=new Organ("Heart","Circulatory","PumpBlood","MaintainFlow","Red",300,"Chest","Cone","Muscle","Cardiac","RibCage","Coronary","Autonomic","Human","Healthy",true,1,"Ancient","Biology","Vital");
        o1.display();

        Organ o2=new Organ("Liver","Digestive","Detox","Metabolism","Brown",1500,"Abdomen","Triangle","Epithelial","Hepatocyte","Rib","Hepatic","Autonomic","Human","Healthy",true,1,"Ancient","Biology","Vital");
        o2.display();

        Organ o3=new Organ("Kidney","Excretory","FilterBlood","Urine","Red",120,"Back","Bean","Epithelial","Nephron","Rib","Renal","Autonomic","Human","Healthy",true,2,"Ancient","Biology","Vital");
        o3.display();

        Organ o4=new Organ("Lung","Respiratory","Breathing","GasExchange","Pink",1000,"Chest","Spongy","Epithelial","Alveoli","RibCage","Pulmonary","Autonomic","Human","Healthy",true,2,"Ancient","Biology","Vital");
        o4.display();

        Organ o5=new Organ("Brain","Nervous","Control","Memory","Pink",1400,"Head","Oval","Nervous","Neuron","Skull","Cerebral","Central","Human","Healthy",true,1,"Ancient","Biology","Vital");
        o5.display();

        Organ o6=new Organ("Stomach","Digestive","DigestFood","StoreFood","Pink",500,"Abdomen","JShape","Muscle","Gastric","Rib","Gastric","Autonomic","Human","Healthy",true,1,"Ancient","Biology","Digestive");
        o6.display();

        Organ o7=new Organ("Pancreas","Digestive","ProduceEnzyme","Hormone","Pink",100,"Abdomen","Leaf","Gland","Islet","None","Pancreatic","Autonomic","Human","Healthy",true,1,"Ancient","Biology","Gland");
        o7.display();

        Organ o8=new Organ("Skin","Integumentary","Protection","Sensation","Brown",5000,"Body","Layer","Epithelial","SkinCell","None","Dermal","Sensory","Human","Healthy",true,1,"Ancient","Biology","Protection");
        o8.display();

        Organ o9=new Organ("Eye","Sensory","Vision","LightDetect","Black",8,"Head","Round","Nervous","Retina","Skull","Optic","Sensory","Human","Healthy",true,2,"Ancient","Biology","Sense");
        o9.display();

        Organ o10=new Organ("Ear","Sensory","Hearing","Balance","Skin",15,"Head","Spiral","Nervous","HairCell","Skull","Auditory","Sensory","Human","Healthy",true,2,"Ancient","Biology","Sense");
        o10.display();
    }
}