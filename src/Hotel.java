public class Hotel implements PlaceOfLivingable{
    private int numberofpeople;

    public Hotel(int numberofpeople) {
        this.numberofpeople = numberofpeople;
    }

    @Override
    public int getNumberOfPeople() {
        return this.numberofpeople;
    }

    @Override
    public double getPrice() {
        return this.numberofpeople*150;//стоимость гостиниц за одного
    }
}
