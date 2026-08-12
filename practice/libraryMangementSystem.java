package practice;

class book{
  int id;
    String name;
    boolean iss;
    book(int id,String name){
        this.id=id;
        this.name=name;
        this.iss=true;
    }

}
class Library{
    book b;
    void addBooks(int id,String name){
        b=new book(id, name);
        System.out.println("book added");
    }
    void issueBook(){
        if(!b.iss){
            b.iss=true;
            System.out.println("book issued");
        }
        else{
            System.out.println("already issued before ");
        }

    }
    void returnBook(){
        if(b.iss){
            b.iss=false;
            System.out.println("book returned");
        }
        else{
            System.out.println("book was not issued");
        }
    }
    void displayAv(){
        if(!b.iss){
            System.out.println(b.id);
            System.out.println(b.name);
        }
        else{
            System.out.println("no av");
        }
    }
}
public class libraryMangementSystem {
      public static void main(String[] args) {
        Library lib = new Library();
        lib.addBooks(1,"Java Programming");

        lib.displayAv();

        lib.issueBook();
        lib.displayAv();

        lib.returnBook();
        lib.displayAv();
    }
}
