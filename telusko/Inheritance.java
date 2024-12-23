class A{
public A(){
        System.out.println("in A");
    }
}
class B extends A{
    public B(){
        System.out.println("in B");
    }
}
class Inheritance{
    public static void main(String a[]){
        B objb=new B();
    }
}