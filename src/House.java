public class House implements PlaceOfLivingable{
    private int numberOfPeople;

    public House(int numberOfPeople){
        this.numberOfPeople=numberOfPeople;
    }

    @Override
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    @Override
    public double getPrice() {
        return numberOfPeople*100;//стоимость коммуналки за 1 человек
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfPeople=" + numberOfPeople +
                '}';
    }
}
