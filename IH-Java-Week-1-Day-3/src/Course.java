public class Course {
    private String classId;
    private int capacity;
    private int studentCount;
    private String title;

    public Course(String classId, int capacity, int studentCount, String title) {
        setClassId(classId);
        setCapacity(capacity);
        setStudentCount(studentCount);
        this.title = title;
    }
    
    public Course() {}

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        if (classId.isEmpty()) {
            System.err.println("Class id no válido");
        }
        this.classId = classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if(capacity < 10 || capacity > 100) {
            System.err.println("Capacidad no válida");
        }
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        if (studentCount < 0 || studentCount > capacity) {
            System.err.println("Capacidad no válida");
        }
        this.studentCount = studentCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
