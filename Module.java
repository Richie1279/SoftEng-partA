// Richard Houston

import java.util.ArrayList;
import java.util.List;

public class Module {
    public String moduleName;
    public String moduleId;
    public String lecturer;
    public List<String> students = new ArrayList<String>();
    public List<String> linkedCourses = new ArrayList<String>();

    public Module(String moduleName, String moduleId, String lecturer) {
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.lecturer = lecturer;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public List<String> getLinkedCourses() {
        return linkedCourses;
    }

    public void setLinkedCourses(List<String> linkedCourses) {
        this.linkedCourses = linkedCourses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }
}

