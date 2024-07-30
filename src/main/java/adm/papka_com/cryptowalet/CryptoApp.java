package adm.papka_com.cryptowalet;

public class CryptoApp {

    public static void main(String[] args) {
        CryptoWalet walet = new CryptoWalet();
        System.out.println("Created BTC walet");

        try{
            CryptoWalet walet = adm.papka_com.cryptowalet.CryptoApp;

            walet.addCrypto("BTCdsf",2);
            walet.addCrypto("BTCsfdt",1);
            walet.addCrypto("BTCdsf hy",3);
            System.out.println("Added BTC, Curents Balanse: " + walet.toString());


        }
       
    }

}
