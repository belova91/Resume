import java.util.ArrayList;

public class Resume {
    private String firstName;
    private String lastName;
    private String gender;
    private ProfileAddress address;
    private String phone;
    private String email;
    private ArrayList<Education> education;
    private ArrayList<Experience> experience;
    private ArrayList<String> skill;

    public Resume(String firstName, String lastName, String gender, ProfileAddress address, String phone, String email, ArrayList<Education> education, ArrayList<Experience> experience, ArrayList<String> skill) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.experience = experience;
        this.skill = skill;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAddress(ProfileAddress address) {
        this.address = address;
    }

    public ProfileAddress getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setExperience(ArrayList<Experience> experience) {
        this.experience = experience;
    }

    public ArrayList<Experience> getExperience() {
        return experience;
    }

    public void setSkill(ArrayList<String> skill) {
        this.skill = skill;
    }

    public ArrayList<String> getSkill() {
        return skill;
    }

    @Override
    public String toString() {
        String result = this.getFirstName() + " " + this.getLastName() + "\n\n Пол: " + this.getGender() + "\n Адрес: " + this.getAddress().toString() + "\n\n Телефон: " + this.getPhone() + "\n Email: " + this.getEmail() + "\n\n Образование:\n";
        for (Education item : this.getEducation()) {
            result += item.toString() + "\n";
        }
        result += "\n Опыт работы:\n";
        for (Experience item : this.getExperience()) {
            result += item.toString() + "\n";
        }
        result += "\n Навыки:\n";
        for (String item : this.getSkill()) {
            result += item + "\n";
        }
        return result;
    }

}
