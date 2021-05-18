package clinic.impl.medic;

import clinic.domain.Card;
import clinic.domain.Trauma;
import clinic.Medic;

public class TherapistMedicImpl implements Medic {

    @Override
    public void heal(Card card) {
        card.setTrauma(Trauma.NONE);
        System.out.println(card.getPatientName() + " healed by therapist");
    }
}
