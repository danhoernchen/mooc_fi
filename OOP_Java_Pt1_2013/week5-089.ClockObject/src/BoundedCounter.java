
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78 
    private int upperBound;
    private int value;

    public BoundedCounter(int value, int upperBound) {
        this.value = value;
        this.upperBound = upperBound;
    }

    public void next() {
        if (value >= upperBound) {
            value = 0;
        } else {
            value++;
        }
    }

    @Override
    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return Integer.toString(value);
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperBound) {
            this.value = newValue;
        }
    }
}
