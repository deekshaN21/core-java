class EducationExecutor {

    public static void main(String[] args) {

        Education e1=new Education("UG","VTU College","B.E","ECE",4,"VTU","India","CGPA",true,true,"English","FullTime","Engineering","Offline","Degree","Semester","Technical",500,"NBA","5");
        e1.display();

        Education e2=new Education("UG","BMS College","B.E","CSE",4,"VTU","India","CGPA",true,true,"English","FullTime","Engineering","Offline","Degree","Semester","Technical",600,"NBA","5");
        e2.display();

        Education e3=new Education("PG","IISc","M.Tech","AI",2,"IISc","India","CGPA",true,true,"English","FullTime","Engineering","Offline","Masters","Semester","Research",200,"NAAC","5");
        e3.display();

        Education e4=new Education("School","KendriyaVidyalaya","10th","General",10,"CBSE","India","Percentage",false,false,"English","FullTime","School","Offline","Certificate","Annual","School",1000,"CBSE","5");
        e4.display();

        Education e5=new Education("PUC","PU College","Science","PCMB",2,"StateBoard","India","Percentage",false,false,"English","FullTime","Science","Offline","Certificate","Annual","PUC",800,"State","4");
        e5.display();

        Education e6=new Education("Diploma","Polytechnic","ECE","Electronics",3,"DTE","India","Percentage",false,true,"English","FullTime","Engineering","Offline","Diploma","Semester","Technical",400,"AICTE","4");
        e6.display();

        Education e7=new Education("UG","RV College","B.E","ISE",4,"VTU","India","CGPA",true,true,"English","FullTime","Engineering","Offline","Degree","Semester","Technical",700,"NBA","5");
        e7.display();

        Education e8=new Education("PG","MIT","MBA","Management",2,"MIT","USA","GPA",true,true,"English","FullTime","Business","Offline","Masters","Semester","Management",300,"AACSB","5");
        e8.display();

        Education e9=new Education("Online","Coursera","Java","Programming",1,"Online","Global","Grade",false,false,"English","Online","Computer","Online","Certificate","Project","Technical",10000,"Online","5");
        e9.display();

        Education e10=new Education("UG","PES College","B.E","ECE",4,"VTU","India","CGPA",true,true,"English","FullTime","Engineering","Offline","Degree","Semester","Technical",650,"NBA","5");
        e10.display();
    }
}