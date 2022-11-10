public class Intern extends Employee {
    private int internshipDuration;
    private final double MAX_SALARY = 20000;

    public Intern(String name, String surname, String dateOfBirth, String department, double salary, int internshipDuration) {
        super(name, surname, dateOfBirth, department, salary);
        setInternshipDuration(internshipDuration);
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    public void setInternshipDuration(int internshipDuration) {
        if (internshipDuration > 12) {
            System.out.println("Error");
        } else {

            this.internshipDuration = internshipDuration;
        }

    }

    @Override
    public void setSalary(double salary) {
        if (salary > MAX_SALARY) {
            System.out.println("Error, se establecerá el máximo permitido");
            super.setSalary(MAX_SALARY);
        } else {
            super.setSalary(salary);
        }
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + super.getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", salary=" + getSalary() + '\'' +
                "internshipDuration=" + internshipDuration +
                '}';
    }
}
