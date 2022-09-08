package Student;

public class Card extends Student {
    private int rental_code;

    private int start_day; // ngay muon

    private int end_day;

    private int book_code;

    public int getRental_code() {
        return rental_code;
    }

    public int getStart_day() {
        return start_day;
    }

    public int getEnd_day() {
        return end_day;
    }

    public int getBook_code() {
        return book_code;
    }

    public void setRental_code(int rental_code) {
        this.rental_code = rental_code;
    }

    public void setStart_day(int start_day) {
        this.start_day = start_day;
    }

    public void setEnd_day(int end_day) {
        this.end_day = end_day;
    }

    public void setBook_code(int book_code) {
        this.book_code = book_code;
    }
}
