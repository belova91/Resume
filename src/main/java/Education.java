public class Education {

    private int startDate;
    private int endDate;
    private String university;
    private String department;
    private String specialization;

    public Education(int startDate, int endDate, String university, String department, String specialization) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.university = university;
        this.department = department;
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return this.getStartDate() + " - " + this.getEndDate() + " гг. " + this.getUniversity() + ", факультет: " + this.getDepartment() + ", специализация: " + this.getSpecialization() + ".";
    }

}
