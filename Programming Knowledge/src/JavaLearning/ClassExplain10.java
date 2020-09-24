package JavaLearning;

public class ClassExplain10 {
    public static void main(String[] args) {
        Students studentObj = new Students();
        studentObj.studentDetails("Kamal", 001, 21);

        Employee employeeObj = new Employee();
        employeeObj.setEmpName("Kafeel Khan");
        employeeObj.setEmpID(10);
        employeeObj.setEmpAge(21);
        System.out.println("Employee Details are: " +
                "\n Employee Name: " + employeeObj.getEmpName() +
                "\n Employee ID: EMP0" + employeeObj.getEmpID() +
                "\n Employee Age: " + employeeObj.getEmpAge());

    }
}

class Students {
    private String name;
    private int stdID, stdAge;

    public void studentDetails(String name, int stdID, int stdAge) {
        System.out.println("Student Details are: " +
                "\n Student Name: " + name +
                "\n Student ID: STD00" + stdID +
                "\n Student Age: " + stdAge);
    }
}

class Employee {
    private String empName;
    private int empID, empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

