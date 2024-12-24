
// public class Modifiers{
//     final int x=10;
//     final double PI=3.14;
//     static void myStaticMethod(){
//         System.out.println("Static method called");;
//     }
//     public void myPublicMethod(){
//         System.out.println("Public method must be called by creating and object");
//     }
//     public static void main(String[] args) {
//         Modifiers myObj=new Modifiers();
    
//         System.out.println(myObj.x);
//         myObj.myPublicMethod();
//     }
// }

abstract class Modifiers{
    public String name="Narendra";
    public int age=24;
    public abstract void study();

}
class Student extends Modifiers{
    public int graduationYear=2025;
    public void study(){
        System.out.println("Studying in college");;
    }
}
class Second{
    public static void main(String []args){
        Student myObj=new Student();
         System.out.println("Name: " + myObj.name);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}