class Magazine {
    String title;
    int numPages;
    String publicationDate;
    String uniqueId;
    final int NUM_OF_ADVERTS = 10;
    int advertPages[] = new int[this.NUM_OF_ADVERTS];

    public Magazine() {
        this.title = "No title";
    }

    public Magazine(String title, int numPages, String publicationDate, String uniqueId) {
        this.title = title;
        this.numPages = numPages;
        this.publicationDate = publicationDate;
        this.uniqueId = uniqueId;
    }

    public void printInfo() {
        System.out.println(this.title + " ma " + this.numPages + " stron!");
    }

    public boolean addAdvert(int page) {
        if (page > 0 && page <= this.numPages) {
            for (int i = 0; i < this.advertPages.length; i++) {
                int v = this.advertPages[i];

                if (v == 0) {
                    this.advertPages[i] = page;
                    return true;
                }
            }

        }

        return false;
    }

    public void showAdvertPages() {
        for (int page : this.advertPages) {
            System.out.println("Advert on page: " + page);
        }
    }

}


public class MagExample {
    public static void main(String[] args) {

        Magazine mag1 = new Magazine();
        mag1.printInfo();
        Magazine mag2 = new Magazine("TechWorld", 200, "20-07-1995", "505");
        mag2.printInfo();

        System.out.println(mag2.addAdvert(2));
        System.out.println(mag2.addAdvert(21));
        System.out.println(mag2.addAdvert(22));
        System.out.println(mag2.addAdvert(23));
        System.out.println(mag2.addAdvert(25));
        System.out.println(mag2.addAdvert(26));
        System.out.println(mag2.addAdvert(27));
        System.out.println(mag2.addAdvert(28));
        System.out.println(mag2.addAdvert(29));
        System.out.println(mag2.addAdvert(12));
        System.out.println(mag2.addAdvert(42));

        mag2.showAdvertPages();


    }
}
