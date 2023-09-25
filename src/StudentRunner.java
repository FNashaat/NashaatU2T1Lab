public class StudentRunner {
    public static void main(String[] args){
        Student student1 = new Student("Perry", 72);
        student1.greet();
        student1.printStudentInfo();

        Student student2 = new Student("Phineas", 24);
        student2.greet();
        student2.printStudentInfo();
    }

}
