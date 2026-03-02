public class singleInheritance {
   
   

   public static void main(String[] args) {
    Manager m = new Manager();
    m.manage();
    m.work();
    
    Director d = new Director();
    d.Order();
   }
    
}

 class Employee{
        void work (){
            System.out.println("employee is working");
        }
    }
 class Manager extends Employee{
        void manage(){
            System.out.println("Manager is managing the team");
        }
    }

class Director extends Manager{
    void Order(){
        System.out.println("director manages the manager");
    }
}
