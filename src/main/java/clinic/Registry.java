package clinic;

import clinic.domain.Card;
import clinic.domain.Trauma;

public interface Registry {
        Card getCard(String name);
        Medic getMedic(Trauma trauma);
}
