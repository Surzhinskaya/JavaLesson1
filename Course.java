package Homework1;

public class Course {
    public float jumpheight;
    public static int countCourse=0;
    public int value;

    Course(float jumpheight) {
        this.jumpheight=jumpheight;
        this.value=value;
        ++countCourse;
    }

    String getInfoCourse() {
        return  "Препятствие высотой " +
                jumpheight + " м ";

    }

    public static void doIt() {

    }

}

