public class Experience {
    private int startDate;
    private int endDate;
    private String job;
    private String duties;
    private String specialization;

    public Experience(int startDate, int endDate, String job, String specialization, String duties) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.job = job;
        this.duties = duties;
        this.specialization = specialization;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return this.getStartDate() + " - " + this.getEndDate() + " гг.: " + this.getJob() + ", специальность: " + this.getSpecialization() + ". Должностные обязанности: " + this.getSpecialization() + ".";
    }

}
