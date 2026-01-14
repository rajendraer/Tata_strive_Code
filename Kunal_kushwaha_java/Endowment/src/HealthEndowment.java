class HealthEndowment extends Endowment {

    private String healthCareCenter;
    private int holderAge;

    public void setHealthCareCenter(String healthCareCenter) {
        this.healthCareCenter = healthCareCenter;
    }

    public void setHolderAge(int holderAge) {
        this.holderAge = holderAge;
    }

    public String getHealthCareCenter() {
        return healthCareCenter;
    }

    public int getHolderAge() {
        return holderAge;
    }

    @Override
    public double calculateEndowment() {

        if (holderAge <= 30) {
            return 120000;
        }
        else if (holderAge > 30 && holderAge < 60) {
            return 200000;
        }
        else {
            return 500000;
        }
    }
}
