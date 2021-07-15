package lec01_java_basics;
/*
	My Address Information (Expected Outcome)
	Jannat U Nayeem 
	88,Van Reypen Street
	5J,New Jersey
	Jersey City,NJ-07306,USA 
 * 
 * */

public class MethodsConcept02 {

	public static void myAdress() {
		String myName = "Jannat U Nayeem";
		int houseNumber = 88;				// ,
		String streetName = "Van Reypen";	// Street
		int aptNumber = 5;					// J
		String stateName = "New Jersey";
		String cityName = "Jersey City";
		String cityShortName = "NJ";		// -
		int cityCode = 7306;				// 0 ,
		String countryName = "USA";

		System.out.println("My Address Information");
		System.out.println(myName + " \n" + houseNumber + "," + streetName + " " + "Street\n" + aptNumber + "J" + ","
				+ stateName + "\n" + cityName + "," + cityShortName + "-" + "0" + cityCode + "," + countryName);

	}

	public static void main(String[] args) {

		myAdress();

	}

}
