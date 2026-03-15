class Diabetes {

    String type;
    String cause;
    String symptom1;
    String symptom2;
    String symptom3;
    String treatment;
    String medicine;
    String diet;
    String exercise;
    String doctor;
    String hospital;
    String country;
    String prevention;
    String riskFactor;
    String testType;
    String patientName;
    int age;
    boolean hereditary;
    double sugarLevel;
    String diagnosisYear;

    Diabetes(String type,String cause,String symptom1,String symptom2,String symptom3,
             String treatment,String medicine,String diet,String exercise,String doctor,
             String hospital,String country,String prevention,String riskFactor,String testType,
             String patientName,int age,boolean hereditary,double sugarLevel,String diagnosisYear){

        this.type=type;
        this.cause=cause;
        this.symptom1=symptom1;
        this.symptom2=symptom2;
        this.symptom3=symptom3;
        this.treatment=treatment;
        this.medicine=medicine;
        this.diet=diet;
        this.exercise=exercise;
        this.doctor=doctor;
        this.hospital=hospital;
        this.country=country;
        this.prevention=prevention;
        this.riskFactor=riskFactor;
        this.testType=testType;
        this.patientName=patientName;
        this.age=age;
        this.hereditary=hereditary;
        this.sugarLevel=sugarLevel;
        this.diagnosisYear=diagnosisYear;
    }

    void display(){
        System.out.println(type);
        System.out.println(cause);
        System.out.println(symptom1);
        System.out.println(symptom2);
        System.out.println(symptom3);
        System.out.println(treatment);
        System.out.println(medicine);
        System.out.println(diet);
        System.out.println(exercise);
        System.out.println(doctor);
        System.out.println(hospital);
        System.out.println(country);
        System.out.println(prevention);
        System.out.println(riskFactor);
        System.out.println(testType);
        System.out.println(patientName);
        System.out.println(age);
        System.out.println(hereditary);
        System.out.println(sugarLevel);
        System.out.println(diagnosisYear);
    }
}