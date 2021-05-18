package clinic.repository;

import clinic.domain.Trauma;
import clinic.Medic;
import clinic.impl.medic.SurgeonMedicImpl;
import clinic.impl.medic.TherapistMedicImpl;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MedicRepository {

    Map<Trauma, Medic> medicMap;

    public MedicRepository() {
        medicMap = new HashMap<>();
        medicMap.put(Trauma.BODY, new SurgeonMedicImpl());
        medicMap.put(Trauma.MIND, new TherapistMedicImpl());
        medicMap.put(Trauma.NONE, null);
    }

    public Medic getMedicByTrauma(Trauma trauma) {
        return medicMap.get(trauma);
    }
}
