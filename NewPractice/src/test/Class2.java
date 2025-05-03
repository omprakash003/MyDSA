package test;
class Book{
    public static String Name;
    Book(){

    }
    Book(String Title,String author,long isbn,int pages){

    }

}

public class Class2 {
    public static void main(String[] args) {
        Book b1=new Book("Book1","Aditya",12455566,23);
        String s=Book.Name;
        System.out.println(s);
    }

}
