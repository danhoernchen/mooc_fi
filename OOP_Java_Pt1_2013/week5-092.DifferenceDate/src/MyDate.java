
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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

    public int differenceInYears(MyDate comparedDate) {
        if (this.earlier(comparedDate)) {
            if (comparedDate.day < this.day && comparedDate.month <= this.month || comparedDate.month < this.month) {
                return comparedDate.year - this.year - 1;
            } else {
                return comparedDate.year - this.year;
            }

        } else {
            if (this.day < comparedDate.day && this.month <= comparedDate.month || this.month < comparedDate.month) {
                return this.year - comparedDate.year - 1;
            }
            return this.year - comparedDate.year;
        }

    }

}
