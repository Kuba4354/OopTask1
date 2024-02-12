public class Main {
    public static void main(String[] args) {
        Automobil automobil = new Automobil();
        automobil.name = "MERSEDEC BENZ";
        automobil.model = "AMG E63S";
        automobil.color = "black";
        automobil.price = 1000000000;
        automobil.volume = 6.3;
        System.out.println(automobil.name + "\n" + automobil.model + "\n" + automobil.color + "\n"
                + automobil.price + "\n" + automobil.volume);

        System.out.println(" ");

        Automobil automobil2 = new Automobil();
        automobil2.name = "MERSEDEC BENZ";
        automobil2.model = "AMG CLS 63";
        automobil2.color = "black";
        automobil2.price = 1500454000;
        automobil2.volume = 6.3;
        System.out.println(automobil2.name + "\n" + automobil2.model + "\n" + automobil2.color + "\n"
                + automobil2.price + "\n" + automobil2.volume);

        System.out.println(" ");

        Automobil automobil3 = new Automobil();
        automobil3.name = "BMW";
        automobil3.model = "M5 F90";
        automobil3.color = "black";
        automobil3.price = 1500000034;
        automobil3.volume = 5.5;
        System.out.println(automobil3.name + "\n" + automobil3.model + "\n" + automobil3.color + "\n"
                + automobil3.price + "\n" + automobil3.volume);

    }
}