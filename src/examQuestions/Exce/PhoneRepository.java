package examQuestions.Exce;

public class PhoneRepository{
	static String getCountryName(String countryCode){
	    
		String var = null;
		if(Integer.parseInt(countryCode)>=90 && Integer.parseInt(countryCode)<=100){
//			return "India";
			var = "India";
		}
		else if(Integer.parseInt(countryCode)==901) return "US";
		else{
			try{
				if(Integer.parseInt(countryCode)>901||Integer.parseInt(countryCode)<90||Integer.parseInt(countryCode)>100)
					throw new InvalidCodeException("No country with the given code found");
			}
			catch(InvalidCodeException ie){
				System.out.println(ie.getMessage());
			}
		}
		return var;
	}
}
