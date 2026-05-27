
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
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

    public void advance(int amount) {
        int i = 0;
        while (i < amount) {
            this.advance();
            i++;
        }
    }

    public void advance() {
        if (this.day > 29) {
            this.month++;
            this.day = 1;
            if (this.month >= 12) {
                this.year++;
                this.month = 1;
            }
        } else {
            this.day++;
        }
    }
    
    public MyDate afterNumberOfDays(int days){
        int tempDay = this.day;
        int tempMonth = this.month;
        int tempYear = this.year;
        if((tempDay + days) > 30){
            tempDay = (tempDay + days) % 30;
            tempMonth++;
            if(tempMonth > 12){
                tempMonth = 1;
                tempYear++;
            }
        }
        return new MyDate(tempDay,tempMonth,tempYear);
    }

}
