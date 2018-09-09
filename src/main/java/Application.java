
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java","Groovy");
        Developer developer = new Developer("Dan","Vega","danvega@gmail.com","cfaddict", languages);
        System.out.println(developer);
    }

}