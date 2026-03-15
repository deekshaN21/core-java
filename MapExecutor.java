class MapExecutor {

    public static void main(String[] args) {

        Map m1 = new Map("World Map","Political","World","Global","English",
        1.0,100,60,true,true,"Oxford","Paper","Education","School",
        "Oxford Ltd","UK",1,"Tube","Poster","2022");
        m1.display();

        Map m2 = new Map("India Map","Political","Asia","India","English",
        1.0,80,50,true,true,"NCERT","Paper","Education","School",
        "NCERT","India",2,"Tube","Poster","2021");
        m2.display();

        Map m3 = new Map("Asia Map","Geographical","Asia","Asia","English",
        1.0,90,55,true,false,"GeoPub","Paper","Geography","Study",
        "GeoPub","USA",1,"Roll","Poster","2020");
        m3.display();

        Map m4 = new Map("Europe Map","Political","Europe","Europe","English",
        1.0,85,50,true,true,"Atlas","Paper","Education","Office",
        "Atlas Ltd","Germany",3,"Tube","Poster","2022");
        m4.display();

        Map m5 = new Map("Karnataka Map","Regional","India","India","Kannada",
        1.0,70,40,true,false,"StatePub","Paper","Regional","School",
        "StatePub","India",1,"Roll","Poster","2023");
        m5.display();

        Map m6 = new Map("USA Map","Political","North America","USA","English",
        1.0,95,60,true,true,"NationalGeo","Paper","Education","Study",
        "NationalGeo","USA",2,"Tube","Poster","2022");
        m6.display();

        Map m7 = new Map("Africa Map","Geographical","Africa","Africa","English",
        1.0,85,55,true,false,"GeoAtlas","Paper","Geography","Study",
        "GeoAtlas","UK",1,"Roll","Poster","2021");
        m7.display();

        Map m8 = new Map("City Map","Urban","India","Bangalore","English",
        1.0,60,40,true,true,"CityPub","Paper","Navigation","Travel",
        "CityPub","India",1,"Fold","Pocket","2023");
        m8.display();

        Map m9 = new Map("Tourist Map","Travel","India","Goa","English",
        1.0,65,45,true,true,"TourismDept","Paper","Tourism","Travel",
        "TourismDept","India",1,"Fold","Pocket","2023");
        m9.display();

        Map m10 = new Map("School Map","Educational","World","Global","English",
        1.0,100,60,true,true,"EduPub","Paper","Education","School",
        "EduPub","India",1,"Tube","Poster","2022");
        m10.display();

    }
}