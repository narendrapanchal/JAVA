import java.util.*;
// interface Animal{
//     public void makeSound();
//     public void sleep();
// }
// class Dog implements Animal{
//     public void makeSound(){
//         System.out.println("Dog Barks");
//     }
//     public void sleep(){
//         System.out.println("Dog sleeps");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Dog dog = new Dog();
//         dog.makeSound();
//         dog.sleep();
//     }
// }


// interface FirstInterface{
//     public void myMethod();
// }
// interface SecondInterface{
//     public void myAnotherMethod();
// }
// class DemoClass implements FirstInterface,  SecondInterface{
//     public void myMethod(){
//         System.out.println("MyMethod implementation");
//     }
//     public void myAnotherMethod(){
//         System.out.println("MyAnotherMethod implementation");
//     }

// }
//     enum Level{
//     LOW,
//     MEDIUM,
//     HIGH
// }
// class Main{

//     public static void main(String[] args){
//         DemoClass obj = new DemoClass();
//         Scanner scanner = new Scanner(System.in);
//         obj.myMethod();
//         obj.myAnotherMethod();
//        for(Level level:Level.values()){
//         System.out.println(level);
//        }

//     }
// }

interface Constants{
    int value=10;
}
class Main implements Constants{
    public static void main(String[] args){
        System.out.println(value);
        LinkedList<String> cars=new LinkedList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Audi");
        System.out.println(cars);
        Iterator<String> it=cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // for(String i:cars){
        //     System.out.println(i);
        // }

        // HashMap<String,String> map=new HashMap<String, String>();
        // map.put("NArendra", "Panchal");
        // map.put("kp", "Panschal");
        // System.out.println(map);
        // for(String str:map.keySet()){
        //     System.out.println(str+" "+map.get(str));
        // }
    }
}