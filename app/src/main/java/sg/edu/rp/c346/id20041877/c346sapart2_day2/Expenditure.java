package sg.edu.rp.c346.id20041877.c346sapart2_day2;

public class Expenditure {

    private float amount;
    private String place;

    public Expenditure(float amount, String place) {
        this.amount = amount;
        this.place = place;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
