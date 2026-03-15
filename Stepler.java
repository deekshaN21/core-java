class Stepler{
  
  int steplerID;
  String steplerName;
  
  public Stepler(){
  }
  
  Stepler(int steplerID,String steplerName){
  this.steplerID=steplerID;
  this.steplerName=steplerName;
  }
  
  public void getSteplerDetails(){
  
  System.out.println("The stepler ID  is " + this.steplerID);
    System.out.println("The stepler name  is " + this.steplerName);
  }
  }
  