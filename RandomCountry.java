import java.util.Random;

public class RandomCountry {

    public static void main(String[] args) {

        String[] countries = {
            "India",
            "United States",
            "Canada",
            "Germany",
            "France",
            "Australia",
            "Japan",
            "Brazil",
            "United Kingdom",
            "South Africa"
        };

        Random random = new Random();
        int index = random.nextInt(countries.length);

        System.out.println("Random Country: " + countries[index]);
    }
}
