public class basic {
    public static void main() {
//        int[] roll = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];
        Student[] Students = new Student[5];
        Students[0] = new Student(1, "Ashi yadav", 95.5F);
        Students[1] = new Student(2, "Ashi yadav", 95.5F);
        Students[2] = new Student(3, "Ashi yadav", 95.5F);
        Students[3] = new Student(4, "Ashi yadav", 95.5F);
        Students[4] = new Student(5, "Ashi yadav", 95.5F);
        for (Student s : Students) {
            s.display();
        }
    }
}
        class Student
        {
            int rol;
            String names;
            float marks;
            Student(int rol,String names,float marks)
            {
                this.rol=rol;
                this.names=names;
                this.marks=marks;
            }
            void display()
            {
                System.out.println(rol+" "+names+" "+marks);
            }
        }


