package examQuestions.Exce;

public class Client{
	public static String getCountry(String countryCode){
		try{
			if(countryCode.length()>3 || countryCode.length()<2){
				throw new InvalidCodeException("Invalide code detail found");
			}
		}
		catch(InvalidCodeException ie){
			System.out.println(ie.getMessage());
		}
		return PhoneRepository.getCountryName(countryCode);
	}
}
