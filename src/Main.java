import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Property> properties = new ArrayList<>();

        Land land1 = new Land(3467.4,100.5);
        properties.add(land1);

        House house1 = new House(2369.4, 2, 4, 4, 293, 12);
        properties.add(house1);

        Office office1 = new Office(2384.4, 2, true, 5, Office.OfficeTypes.SERVICE);
        properties.add(office1);

        Cottage cottage1 = new Cottage(4306.4, 3, 5, 6, 238.8, 30.9, 32.7);
        properties.add(cottage1);

        Apartment apartment1 = new Apartment(3960.5, 5, true, 5, 10);
        properties.add(apartment1);

        Farm farm1 = new Farm(10580.5, 2048.5, "potato");
        properties.add(farm1);



    }















}