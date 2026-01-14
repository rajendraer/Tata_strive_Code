class EducationalEndowment extends Endowment {

    private String educationalInstitution;
    private String educationalDivision;

    public void setEducationalInstitution(String educationalInstitution) {
        this.educationalInstitution = educationalInstitution;
    }

    public void setEducationalDivision(String educationalDivision) {
        this.educationalDivision = educationalDivision;
    }

    public String getEducationalInstitution() {
        return educationalInstitution;
    }

    public String getEducationalDivision() {
        return educationalDivision;
    }

    @Override
    public double calculateEndowment() {

        if (educationalDivision.equalsIgnoreCase("School")) {
            return 30000;
        }
        else if (educationalDivision.equalsIgnoreCase("UnderGraduate")) {
            return 60000;
        }
        else if (educationalDivision.equalsIgnoreCase("PostGraduate")) {
            return 90000;
        }
        else {
            return 0;
        }
    }
}
