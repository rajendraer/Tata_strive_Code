abstract class Endowment {

    protected String endowmentId;
    protected String holderName;
    protected String endowmentType;
    protected String registrationDate;

    // Setters
    public void setEndowmentId(String endowmentId) {
        this.endowmentId = endowmentId;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setEndowmentType(String endowmentType) {
        this.endowmentType = endowmentType;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Getters
    public String getEndowmentId() {
        return endowmentId;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getEndowmentType() {
        return endowmentType;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    // Abstract method
    public abstract double calculateEndowment();


}
