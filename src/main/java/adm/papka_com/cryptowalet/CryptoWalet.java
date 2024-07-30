package adm.papka_com.cryptowalet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CryptoWalet {
    public Map<Integer, String> BTCBal = new HashMap<>();
    public Map<Integer, String> ETHBal = new HashMap<>();

    public void addCrypto(String amount, Integer id) {

        if (amount.startsWith("BTC")) {
                BTCBal.put(id, amount);

        }

        else if (amount.startsWith("ETH")) {
             ETHBal.put(id, amount);
        }



        else {
            throw new WrongThreadException();
        }}

    public Optional<String> getCryptoByTrsId(Integer id) {
        if (BTCBal.containsKey(id)) {
            return Optional.of(BTCBal.get(id));
        }
        else if (ETHBal.containsKey(id)) {
            return Optional.of(ETHBal.get(id));
        }
        return Optional.empty();

           

 
}

    }



