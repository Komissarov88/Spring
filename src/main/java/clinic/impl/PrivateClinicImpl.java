package clinic.impl;

import clinic.Clinic;
import clinic.Medic;
import clinic.Registry;
import clinic.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrivateClinicImpl implements Clinic {

    private Registry registry;

    public void heal(String name) {
        Card card = registry.getCard(name);
        if (card == null) {
            System.out.println(name + " is not registered");
            return;
        }
        Medic medic = registry.getMedic(card.getTrauma());
        if (medic == null) {
            System.out.println(name + " is not injured");
            return;
        }
        medic.heal(card);
    }

    @Autowired
    public void setRegistry(RegistryImpl registry) {
        this.registry = registry;
    }
}
