public class Appartament implements PlaceOfLivingable{
    private int numberOfPeople;

    public Appartament(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public double getPrice() {
        return (numberOfPeople*50)+200;//50 за коммуналку, 200 за квартиру.
    }

}
