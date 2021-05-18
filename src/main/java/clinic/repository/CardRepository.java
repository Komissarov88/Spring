package clinic.repository;

import clinic.domain.Card;
import clinic.domain.Trauma;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CardRepository {

    Map<String, Card> cards;

    public CardRepository() {
        cards = new HashMap<>();
        cards.put("Ivan", new Card("Ivan", Trauma.BODY));
        cards.put("Artyom", new Card("Artyom", Trauma.MIND));
    }

    public Card getCardByName(String name) {
        return cards.get(name);
    }
}
