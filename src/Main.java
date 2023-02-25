import static java.nio.file.Files.walk;

public class Main {
    public static void main(String[] args) {
        House house=new House(1);
        house.getPrice();

        Appartament appartament =new Appartament(1);

        Hotel hotel=new Hotel(1);

        System.out.println("*****HOUSE*********");
        People people=new People();
        for (String s : people.family) {
            System.out.println(s+" "+house.getPrice() + " dollars");
        }
        System.out.println("********APPARTAMENT********");

        for (String h:people.neighbour){
            System.out.println(h+" "+appartament.getPrice()+" dollars");
        }

        System.out.println("********HOTEL********");
        for (String z:people.couples) {
            System.out.println(z + " " + hotel.getPrice() + " dollars");
        }
    }
}