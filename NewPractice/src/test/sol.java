package test;
class Institution{
    public String name;
    public void display_info(){
        System.out.println(" Institution  Name :"+name);
    }
}
class School extends Institution{
    public int no_of_students;
    public void display_info(){
        super.display_info();
        System.out.println("No Of Students "+no_of_students);


    }



}
class HighSchool extends School{
    public int no_of_teachers;
    HighSchool(String Inst,int stu,int teachers){
        super.name=Inst;
        super.no_of_students=stu;
        no_of_teachers=teachers;
    }
    public void display_info(){
        super.display_info();
        System.out.println("No of teachers "+no_of_teachers);
    }
}

public class sol {
    public static void main(String[] args) {
        Institution h1=new HighSchool("NHCE",234,45);
        h1.display_info();

    }
}
