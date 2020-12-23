public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initial;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initial = this.value;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value == 0) {
            return;
        }
        this.value--;
    }

    public void reset() {
        this.value = 0;
    }
    
    public void setInitial() {
        this.value = this.initial;
    }
    // and here the rest of the methods
}
