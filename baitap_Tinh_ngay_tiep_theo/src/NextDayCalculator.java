public class NextDayCalculator {
    private int day;
    private int month;
    private int year;


    public NextDayCalculator() {
    }

    public NextDayCalculator(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // GET SET
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    //metthod
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public String getNextDay() {
        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (this.day == 31) {
                    if (this.month != 12) {
                        return "ngay: " + 1 + "\nthang: " + (this.month + 1) + "\nnam: " + this.year;
                    } else {
                        return "ngay: " + 1 + "\nthang: " + 1 + "\nnam: " + (this.year + 1);
                    }
                } else {
                    return "ngay: " + (this.day + 1) + "\nthang: " + this.month + "\nnam: " + this.year;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.day != 30) {
                    return "ngay: " + (this.day + 1) + "\nthang: " + (this.month + 1) + "\nnam: " + this.year;
                } else {
                    return "ngay: " + 1 + "\nthang: " + (this.month + 1) + "\nnam: " + this.year;
                }
            default:
                return "ngay ban nhap chua dung!";
            case 2:
                if (isLeapYear(this.year)) {
                    if (this.day == 28) {
                        return "ngay: " + 29 + "\nthang: " + 2 + "\nnam: " + this.year;
                    } else if (this.day == 29) {
                        return "ngay: " + 1 + "\nthang: " + 3 + "\nnam: " + this.year;
                    } else {
                        return "ngay: " + (this.day + 1) + "\nthang: " + 2 + "\nnam: " + this.year;
                    }
                } else {
                    if(this.day == 28){
                        return "ngay: " + 1 + "\nthang: " + 3 + "\nnam: " + this.year;
                    }
                    return "ngay: " + (this.day + 1) + "\nthang: " + 2 + "\nnam: " + this.year;
                }

        }
    }
}
