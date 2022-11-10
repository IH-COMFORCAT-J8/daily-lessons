public class Employee {

    private String name;
    private String surname;
    private String dateOfBirth;
    private String department;
    private double salary;

    public Employee(String name, String surname, String dateOfBirth, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("El salario no puede ser negativo");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
    º
}
