public class Third {
	public String ThirdGreatest(String[]strArr){
		
		String strValue = "" , output="";
		boolean sort = true;
		while(sort){//beginning of bubble sort
			
			for(int i=0; i<strArr.length;i++){//loop thru the array
				if(strArr[i].length() <  
						strArr.length[i+1].length()){
					strValue=strArr[i];
					strArr[i]=strArr[i+1];
					strArr[i+1]=strValue;
					sort=false;
					
				}
				
			}/
			
		}//end of looping array
	}//end of sort
	if(strArr.length < 3 && str.length > 0){
		output = strArr [strArr.lenth-1];
	}else{
		output = strArr[2];
	}
	return routput;
}
