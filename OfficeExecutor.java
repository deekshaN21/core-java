class OfficeExecutor {

    public static void main(String[] args) {

        Office o1=new Office("TechSoft","Whitefield","Bangalore","IT",500,5,10000,true,true,"Ravi","India","HR","Dev","Testing","Corporate","Fiber","Generator","CCTV","2010","IT");
        o1.display();

        Office o2=new Office("InfoTech","ElectronicCity","Bangalore","IT",700,7,15000,true,true,"Kiran","India","HR","Dev","Support","Corporate","Fiber","Generator","CCTV","2012","IT");
        o2.display();

        Office o3=new Office("HealthCorp","Indiranagar","Bangalore","Healthcare",300,4,8000,true,true,"Anil","India","HR","Admin","Finance","Corporate","Broadband","UPS","CCTV","2015","Medical");
        o3.display();

        Office o4=new Office("EduSoft","BTM","Bangalore","Education",200,3,6000,false,true,"Suresh","India","HR","Teaching","Admin","Commercial","Fiber","UPS","Security","2016","Education");
        o4.display();

        Office o5=new Office("FinServe","MG Road","Bangalore","Finance",400,6,9000,true,true,"Arjun","India","HR","Accounts","Audit","Corporate","Fiber","Generator","CCTV","2011","Finance");
        o5.display();

        Office o6=new Office("BuildCorp","Yelahanka","Bangalore","Construction",250,4,7000,true,true,"Ramesh","India","HR","Planning","Accounts","Industrial","Broadband","UPS","Security","2013","Construction");
        o6.display();

        Office o7=new Office("DesignHub","Jayanagar","Bangalore","Design",150,2,5000,false,true,"Manoj","India","HR","Design","Admin","Studio","Fiber","UPS","Security","2018","Creative");
        o7.display();

        Office o8=new Office("MarketPro","HSR","Bangalore","Marketing",180,3,5500,false,true,"Deepak","India","HR","Sales","Support","Commercial","Broadband","UPS","Security","2017","Marketing");
        o8.display();

        Office o9=new Office("AgroTech","Hebbal","Bangalore","Agriculture",220,4,6500,true,true,"Raj","India","HR","Research","Support","Corporate","Fiber","Generator","CCTV","2014","Agriculture");
        o9.display();

        Office o10=new Office("StartUpX","Koramangala","Bangalore","Startup",120,2,4000,false,true,"Naveen","India","HR","Dev","Marketing","Startup","Fiber","UPS","Security","2020","Startup");
        o10.display();
    }
}