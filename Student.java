import java.util.ArrayList;
import java.util.List;

// Richard Houston 19365321
public class Student {
    public String name;
    public int age;
    public String dateOfBirth;
    public int id;
    public String userName;
    public List<String> courses = new ArrayList<String>();
    public List<String> modules = new ArrayList<String>();


    public Student(String name, int age, String dateOfBirth, int id) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = getUserName(name, age);
    }

    // getters and setters
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public List<String> getModules() {
        return modules;
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

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public void setModules(List<String> modules) {
        this.modules = modules;
    }

    // method to generate username
    public String getUserName(String name, int age) {
        String s1 = name;
        String s2 = String.valueOf(age);
        String userName = s1.concat(s2);

        return userName;

    }
}

