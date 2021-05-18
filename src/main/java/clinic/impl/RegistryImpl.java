package clinic.impl;

import clinic.Medic;
import clinic.Registry;
import clinic.domain.Card;
import clinic.domain.Trauma;
import clinic.repository.CardRepository;
import clinic.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistryImpl implements Registry {

    private CardRepository cardRepository;
    private MedicRepository medicRepository;

    public Card getCard(String name) {
        return cardRepository.getCardByName(name);
    }

    public Medic getMedic(Trauma trauma) {
        return medicRepository.getMedicByTrauma(trauma);
    }

    @Autowired
    public void setCardRepository(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Autowired
    public void setMedicRepository(MedicRepository medicRepository) {
        this.medicRepository = medicRepository;
    }
}
