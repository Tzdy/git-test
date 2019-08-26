import java.io.*;
public class Student implements Interface{
    int id;
    String name;
    public Student(){id=1;name="ydy";}
    public void display() {
        System.out.println("id:" + id + ",name:" + name);
    }
}