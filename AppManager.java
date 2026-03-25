class AppManager{

    private String appnames[]=new String[4];
	int index;
	
	public boolean addAppNames(String appname){
	
	boolean isAddNames=false;
	if(appname !=null && !appname.isEmpty()){
	appnames[index]=appname;
	index++;
	isAddNames=true;
	
	}
	
	else{
	System.out.println(appname + "is invalid");
	}
	return isAddNames;
	}
	
	
	public void getAppname(){
    for(String Apps:appnames){
		System.out.println(Apps);
		}
	}
		
	}