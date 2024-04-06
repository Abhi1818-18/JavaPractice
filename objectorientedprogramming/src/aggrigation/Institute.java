package aggrigation;

import java.util.ArrayList;

class Institute {
    String instituteName;
    ArrayList<Department> departments;

    Institute(String instituteName, ArrayList<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    int getTotalStudentsInInstitute() {
        int totalStudents = 0;
        for (Department dept : departments) {
            totalStudents += dept.getTotalStudents();
        }
        return totalStudents;
    }
}