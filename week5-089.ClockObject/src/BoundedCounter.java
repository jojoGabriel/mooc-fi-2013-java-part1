
public class BoundedCounter {

    // copy here the class BoundedCounter from last weeks assignment 78 
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        return String.format("%02d", this.value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {
            return;
        }
        this.value = value;
    }
}
