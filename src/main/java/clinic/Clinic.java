package clinic;
import org.springframework.stereotype.Component;

@Component
public interface Clinic {
    void heal(String name);
}
