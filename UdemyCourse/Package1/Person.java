package Package1;

public class Person {
    String name;
    int age;
    Person(int age,String name){
       this.age=age;
       this.name=name;

    }
    public static void main(String[] args ){
        Person p1=new Person(23,"jack");
        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(new Person(23,"anika").name);


    }
}
