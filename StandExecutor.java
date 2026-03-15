class StandExecutor {

    public static void main(String[] args) {

        Stand s1 = new Stand("IKEA","Laptop Stand","Metal","Black",30,20,1.2,1200,true,true,
        "Office","Rectangle","IKEA","Sweden","Modern","Matte",5,"Box","High","1 year");
        s1.display();

        Stand s2 = new Stand("Local","Phone Stand","Plastic","White",15,10,0.5,300,true,false,
        "Mobile","Round","Local Ltd","India","Simple","Glossy",2,"Box","Medium","6 months");
        s2.display();

        Stand s3 = new Stand("Amazon","Tablet Stand","Metal","Silver",25,18,0.9,800,true,true,
        "Tablet","Rectangle","Amazon","USA","Modern","Matte",3,"Box","High","1 year");
        s3.display();

        Stand s4 = new Stand("Home","TV Stand","Wood","Brown",60,40,8.0,5000,false,false,
        "TV","Rectangle","Home Ltd","India","Classic","Matte",20,"Box","High","2 years");
        s4.display();

        Stand s5 = new Stand("OfficePro","Monitor Stand","Metal","Black",20,25,2.0,1500,true,false,
        "Office","Rectangle","OfficePro","India","Modern","Matte",10,"Box","High","1 year");
        s5.display();

        Stand s6 = new Stand("KitchenPro","Utensil Stand","Steel","Silver",18,12,1.5,600,false,false,
        "Kitchen","Round","KitchenPro","India","Modern","Glossy",15,"Box","High","1 year");
        s6.display();

        Stand s7 = new Stand("Study","Book Stand","Plastic","Blue",22,16,0.8,450,true,true,
        "Study","Triangle","Study Ltd","India","Simple","Matte",5,"Box","Medium","6 months");
        s7.display();

        Stand s8 = new Stand("Music","Mic Stand","Metal","Black",150,30,3.0,2500,true,true,
        "Music","Vertical","Music Ltd","USA","Professional","Matte",1,"Box","High","2 years");
        s8.display();

        Stand s9 = new Stand("CameraPro","Tripod Stand","Aluminium","Black",140,35,2.5,3500,true,true,
        "Camera","Tripod","CameraPro","Japan","Professional","Matte",1,"Box","High","2 years");
        s9.display();

        Stand s10 = new Stand("HomeDecor","Plant Stand","Wood","Brown",50,30,4.0,1200,false,false,
        "Garden","Round","HomeDecor","India","Classic","Matte",6,"Box","High","1 year");
        s10.display();

    }
}