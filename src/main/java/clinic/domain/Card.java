package clinic.domain;

public class Card {

    private String patientName;
    private Trauma trauma;

    public Card(String patientName, Trauma trauma) {
        this.patientName = patientName;
        this.trauma = trauma;
    }

    public Trauma getTrauma() {
        return trauma;
    }

    public void setTrauma(Trauma trauma) {
        this.trauma = trauma;
    }

    public String getPatientName() {
        return patientName;
    }
}
