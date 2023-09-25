public class Student {
    private String name;
    private double height;

    public Student(String studentName, double studentHeight){
        name = studentName;
        height = studentHeight;
    }

    public void greet(){
        System.out.println("Hello, my name is " + name + " and my height is " + height + " in inches ");

    }
    public void printStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println();
    }

}
