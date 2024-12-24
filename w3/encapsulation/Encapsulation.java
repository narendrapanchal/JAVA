
public class Encapsulation{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newname){
        this.name=newname;
    }
public static void main(String[] args){
  Person myObj = new Person();
  myObj.name="Narendra"
  myObj.setName("John Doe");
  System.out.println(myObj.getName());
}
}