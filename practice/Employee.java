package practice;

public class Employee {
        int id;
        String name;
        double basicSal;
        public double calHRA(){
            return basicSal*0.20;//(0.20 supose kiya h)
        } 
        public double calDA(){
            return basicSal*0.10;
        }
        public double calgross(){
            return basicSal+calDA()+calHRA();
        }
    public static void main(String[] args) {
       Employee e = new Employee();

        e.id=1;
        e.name="Harshita";
        e.basicSal=50000;
        System.out.println(e.id);
        System.out.println(e.name);
        System.out.println(e.basicSal);
        System.out.println(e.calDA());
        System.out.println(e.calHRA());
        System.out.println(e.calgross());
    }
}
