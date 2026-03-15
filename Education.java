class Education {

    String level;
    String institution;
    String course;
    String branch;
    int duration;
    String university;
    String country;
    String gradingSystem;
    boolean scholarship;
    boolean hostel;
    String medium;
    String type;
    String department;
    String mode;
    String certification;
    String examSystem;
    String category;
    int students;
    String accreditation;
    String rating;

    Education(String level,String institution,String course,String branch,int duration,
              String university,String country,String gradingSystem,boolean scholarship,
              boolean hostel,String medium,String type,String department,String mode,
              String certification,String examSystem,String category,int students,
              String accreditation,String rating){

        this.level=level;
        this.institution=institution;
        this.course=course;
        this.branch=branch;
        this.duration=duration;
        this.university=university;
        this.country=country;
        this.gradingSystem=gradingSystem;
        this.scholarship=scholarship;
        this.hostel=hostel;
        this.medium=medium;
        this.type=type;
        this.department=department;
        this.mode=mode;
        this.certification=certification;
        this.examSystem=examSystem;
        this.category=category;
        this.students=students;
        this.accreditation=accreditation;
        this.rating=rating;
    }

    void display(){
        System.out.println(level);
        System.out.println(institution);
        System.out.println(course);
        System.out.println(branch);
        System.out.println(duration);
        System.out.println(university);
        System.out.println(country);
        System.out.println(gradingSystem);
        System.out.println(scholarship);
        System.out.println(hostel);
        System.out.println(medium);
        System.out.println(type);
        System.out.println(department);
        System.out.println(mode);
        System.out.println(certification);
        System.out.println(examSystem);
        System.out.println(category);
        System.out.println(students);
        System.out.println(accreditation);
        System.out.println(rating);
    }
}