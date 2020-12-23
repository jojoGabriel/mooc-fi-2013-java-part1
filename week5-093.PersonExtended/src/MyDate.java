
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        
        if (this.earlier(comparedDate)) {
            return diffInYears(comparedDate, this);
        } else {
            return diffInYears(this, comparedDate);
        }
        
    }
    
    private int diffInYears(MyDate later, MyDate earlier) {
        int laterMonth = later.month;
        int laterDay = later.day;
        int laterYear = later.year;
        int earlierMonth = earlier.month;
        int earlierDay = earlier.day;
        int earlierYear = earlier.year;
                     
        if (laterDay < earlierDay) {
            laterDay += 30;
            laterMonth--;
            if (laterMonth < earlierMonth) {
                if (laterMonth < 0) {
                    laterMonth = 12;
                } else {
                    laterMonth += 12;
                }
                laterYear--;
            }
        } else {
            if (laterMonth < earlierMonth) {
                if (laterMonth < 0) {
                    laterMonth = 12;
                } else {
                    laterMonth += 12;
                }
                laterYear--;
            }
        }
        
        if ((laterYear - earlierYear) < 0)
            return 0;
        
        return laterYear - earlierYear;
    }
    


  
}
