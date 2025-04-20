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

        for (int i = 0;i < size; i++){
            newNames[i] = studentNames[i];
            newGrades[i] = grades[i];
        }

        studentNames = newNames;
        grades = newGrades;
    }

    public boolean removeStudent(String name){
        for (int i = 0; i < size; i++){
            if (studentNames[i].equals(name)){

                //shift elements to fill the gap
                for (int j = i; j < size - 1; j++){
                    studentNames[j] = studentNames[j + 1];
                    grades[j] = grades[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    //Find a student's grade by name (linear search)
    public double findGrade(String name){
        for (int i = 0; i < size; i++){
            if (studentNames[i].equals(name)){
                return grades[i];
            }
        }
        return -1; //indicate not found
    }

    public double calculateAverageGrade(){
        if (size == 0) return 0;
        double sum = 0;
        for (int i = 0; i < size; i++){
            sum += grades[i];
        }
        return sum / size;
    }
    public String findHighestGrade(){
        if (size == 0) return "No students";

        double maxGrade = grades[0];
        String topStudent = studentNames[0];

        for (int i = 1; i < size; i++){
            if (grades[i] > maxGrade){
                maxGrade = grades[i];
                topStudent = studentNames[i];
            }
        }
        return topStudent + " with grade: " + maxGrade;
    }
}