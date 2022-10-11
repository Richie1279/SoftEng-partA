
// Richard Houston 19365321

import java.util.ArrayList;
import java.util.List;

public class Lecturer {

    public String name;
    public int age;
    public String dateOfBirth;
    public int id;
    public String userName;
    public List<String> modulesTeaching = new ArrayList<String>();



    public Lecturer(String name, int age, String dateOfBirth, int id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = getUserName(name, age);
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public List<String> getModulesTeaching() {
        return modulesTeaching;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setModulesTeaching(List<String> modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }

    public String getUserName(String name, int age) {
        String s1 = name;
        String s2 = String.valueOf(age);
        String userName = s1.concat(s2);

        return userName;

    }
}

