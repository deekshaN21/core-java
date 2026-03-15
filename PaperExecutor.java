class PaperExecutor {

    public static void main(String[] args) {

        Paper p1 = new Paper("JK","A4","White","A4","Printing",250,500,80,true,false,
        "Smooth","JK Ltd","India","Pack","High",500,"Matte","Thin","Office","12/2027");
        p1.display();

        Paper p2 = new Paper("Navneet","Notebook","White","A4","Writing",200,300,70,true,false,
        "Soft","Navneet Ltd","India","Bundle","Medium",200,"Matte","Thin","School","11/2027");
        p2.display();

        Paper p3 = new Paper("Classmate","Exam","White","A4","Exam",150,200,75,true,false,
        "Smooth","ITC","India","Pack","High",100,"Matte","Thin","Student","10/2027");
        p3.display();

        Paper p4 = new Paper("PaperOne","Copy","White","A4","Office",300,400,80,true,false,
        "Smooth","PaperOne Ltd","USA","Pack","High",400,"Glossy","Thin","Office","09/2027");
        p4.display();

        Paper p5 = new Paper("Local","Brown","Brown","A3","Craft",100,150,60,true,false,
        "Rough","Local Ltd","India","Bundle","Low",150,"Matte","Thick","Art","08/2027");
        p5.display();

        Paper p6 = new Paper("ArtPaper","Drawing","White","A3","Drawing",350,200,120,true,false,
        "Rough","Art Ltd","India","Pack","High",50,"Matte","Thick","Art","07/2027");
        p6.display();

        Paper p7 = new Paper("Premium","Glossy","White","A4","Photo",400,100,100,false,true,
        "Glossy","Premium Ltd","Japan","Pack","High",50,"Glossy","Thick","Photo","06/2027");
        p7.display();

        Paper p8 = new Paper("EcoPaper","Recycled","White","A4","Office",220,300,75,true,false,
        "Soft","Eco Ltd","India","Bundle","Medium",300,"Matte","Thin","Office","05/2027");
        p8.display();

        Paper p9 = new Paper("CopyPaper","Office","White","A4","Office",280,350,80,true,false,
        "Smooth","Copy Ltd","India","Pack","High",350,"Matte","Thin","Office","04/2027");
        p9.display();

        Paper p10 = new Paper("Student","Notebook","White","A4","School",180,250,70,true,false,
        "Soft","Student Ltd","India","Bundle","Medium",250,"Matte","Thin","School","03/2027");
        p10.display();

    }
}