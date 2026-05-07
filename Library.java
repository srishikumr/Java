class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age);
    }
}

public class Library {
    public static void main(String[] args) {
        Student[] classroom = new Student[3];

        classroom[0] = new Student("Alice", 20);
        classroom[1] = new Student("Bob", 22);
        classroom[2] = new Student("Charlie", 19);

        classroom[0].introduce();
    }
}