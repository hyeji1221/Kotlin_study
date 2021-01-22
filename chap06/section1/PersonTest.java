package chap06.section1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName (String name ){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("kildong", 30);
        p1.setName("Dooly");
        System.out.println(p1.getName());
    }
}
