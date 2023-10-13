class Home {
    String country;
    String city;
    String street;
    String zipCode;
    int inhabitants;
    String dateOfBuy;

    public Home () {
        this.country = "Poland";
    }

    public Home (String country, String city, String street, String zipCode, int inhabitants, String dateOfBuy) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.inhabitants = inhabitants;
        this.dateOfBuy = dateOfBuy;
    }

    public void showInfo() {
        System.out.println("Nieruchomość znajduje się w kraju " + this.country + " w mieście " + this.city + " na ulicy " + this.street );
    }
}





public class HomeChallenge {
    public static void main(String[] args) {

        Home property1 = new Home();
        property1.showInfo();

        Home property2 = new Home("Polska", "Białystok", "Kolorowa", "77-998", 5, "14-08-2005");
        property2.showInfo();

    }
}
