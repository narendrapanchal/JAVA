class Computer{
    public void playMusic(){
        System.out.println("Music Playing....");
    }
    public String getMeAPen(int cost){
        if(cost>=10){
            return "Pen";
        }
        return "Nothing";
    }
}
class Student{
    int age;
    String name;
}
class Methods{
    public static void main(String args[]){
        Computer comp=new Computer();
        comp.playMusic();
        String str=comp.getMeAPen(2);
        System.out.println(str);
        int nums[]={1,2,3,4};
        System.out.println(nums[0]);
        Student s1=new Student();
        s1.name="NArendra";
        s1.age=24;
         Student s2=new Student();
        s2.name="NArendra";
        s2.age=24;
        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        System.out.println(students[0]);
        for(Student stud: students){
            System.out.println(stud);
        }
        StringBuffer sb=new StringBuffer("NAreredra");
        sb.append(" Panchal");
        sb.insert(9,"Kumar ");
        System.out.println(sb);
    }
}