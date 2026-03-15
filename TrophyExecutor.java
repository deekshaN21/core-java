class TrophyExecutor {

    public static void main(String[] args) {

        Trophy t1=new Trophy("World Cup","Sports","Gold","Golden",40,5,50000,"Cricket","India","ICC","Global","TrophyCorp","Classic","Cup","Glossy",true,true,2023,"Box","Sports");
        t1.display();

        Trophy t2=new Trophy("Champions Trophy","Sports","Silver","Silver",35,4,30000,"Football","Brazil","FIFA","Global","TrophyCorp","Modern","Cup","Glossy",true,false,2022,"Box","Sports");
        t2.display();

        Trophy t3=new Trophy("Academic Award","Education","Crystal","Transparent",25,2,10000,"School","Ravi","School","India","EduTrophy","Modern","Star","Matte",true,true,2024,"Box","Education");
        t3.display();

        Trophy t4=new Trophy("Best Employee","Corporate","Metal","Gold",20,1.5,8000,"Company","Anita","ABC Corp","India","CorpTrophy","Simple","Shield","Glossy",true,false,2023,"Box","Corporate");
        t4.display();

        Trophy t5=new Trophy("Music Award","Entertainment","Metal","Silver",30,3,15000,"Music","Arjun","MusicOrg","USA","MusicTrophy","Classic","Star","Glossy",true,true,2022,"Box","Entertainment");
        t5.display();

        Trophy t6=new Trophy("Sports Cup","Sports","Gold","Golden",38,4.5,45000,"Football","Spain","FIFA","Spain","TrophyCorp","Modern","Cup","Glossy",true,false,2023,"Box","Sports");
        t6.display();

        Trophy t7=new Trophy("Art Award","Art","Crystal","Clear",22,1.2,7000,"Art","Meera","ArtOrg","India","ArtTrophy","Modern","Star","Matte",true,true,2024,"Box","Art");
        t7.display();

        Trophy t8=new Trophy("Debate Award","Education","Metal","Bronze",18,1,5000,"College","Rahul","College","India","EduTrophy","Simple","Shield","Matte",true,false,2023,"Box","Education");
        t8.display();

        Trophy t9=new Trophy("Innovation Award","Tech","Crystal","Clear",28,2.5,20000,"Tech","Priya","TechOrg","USA","TechTrophy","Modern","Cube","Glossy",true,true,2024,"Box","Technology");
        t9.display();

        Trophy t10=new Trophy("Dance Award","Entertainment","Metal","Gold",24,2,12000,"Dance","Riya","DanceOrg","India","DanceTrophy","Classic","Star","Glossy",true,false,2023,"Box","Entertainment");
        t10.display();
    }
}