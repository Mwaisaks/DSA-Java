public class GradeManagement {
    private String[] studentNames;
    private int[] grades;
    private int size;
    private int capacity;

    public GradeManagement(String[] studentNames, int[] grades, int size, int capacity) {
        this.studentNames = studentNames;
        this.grades = grades;
        this.size = size;
        this.capacity = capacity;
    }

    public void addStudent(String name, double grade){
        if (size == capacity){
            //Resize the arrays
            resizeArrays();
        }
        studentNames[size] = name;
        grades[size] = grade;
        size++;
    }

    public void resizeArrays(){
        capacity *= 2;
        String[] newNames = new String[capacity];
        double[] newGrades = new double[capacity];


    }
}