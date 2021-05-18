import clinic.AppConfig;
import clinic.Clinic;
import clinic.impl.PrivateClinicImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Clinic clinic = context.getBean(PrivateClinicImpl.class);
        clinic.heal("Artyom");
        clinic.heal("Andrey");
        clinic.heal("Ivan");
        clinic.heal("Ivan");
    }
}
