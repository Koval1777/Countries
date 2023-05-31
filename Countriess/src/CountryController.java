public class CountryController {
    public static void main(String[] args) {
        Country usa = new UnitedStates();
        Country germany = new Germany();

        printCountryInfo(usa);
        printCountryInfo(germany);
    }

    public static void printCountryInfo(Country country) {
        if (country instanceof UnitedStates) {
            System.out.println("Country: United States");
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Currency: US Dollar");
        } else if (country instanceof Germany) {
            System.out.println("Country: Germany");
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Currency: Euro");
        } else if (country instanceof France) {
            System.out.println("Country: France");
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Currency: Euro");
        } else if (country instanceof Ukraine) {
            System.out.println("Country: Ukraine");
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Currency: hrn");
        } else if (country instanceof Poland) {
            System.out.println("Country: Poland");
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Currency: zl");
        } else {
            System.out.println("Unknown Country");
        }

        System.out.println();
    }
}