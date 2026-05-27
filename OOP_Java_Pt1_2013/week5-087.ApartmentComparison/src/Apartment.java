
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }
    
    public int priceDifference(Apartment otherApartment){
        int thisPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if(thisPrice > otherPrice){
            return thisPrice - otherPrice;
        } else {
            return otherPrice - thisPrice;
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if((this.pricePerSquareMeter*this.squareMeters)>(otherApartment.pricePerSquareMeter*otherApartment.squareMeters)){
            return true;
        }
        return false;
    }
}
