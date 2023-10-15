package basic001;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("저팔계", "4843");
        Student st3 = new Student("사오정", "5976");

        ArrayList <Student>list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student stu: list) {

        }
    }
}
