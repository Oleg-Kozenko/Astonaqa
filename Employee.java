public class Employee {
    String name;
    String position;
    String email;
    long number;
    int salary;
    int age;
    public Employee(String name,String position, String email, long number, int salary,int age){
       this.name = name;
       this.position = position;
       this.email=email;
       this.number=number;
       this.salary=salary;
       this.age=age;
    }

    public void info(){
        System.out.println("Имя: "+name +";\nДолжность:"+position+";\nemail:"+email+";\n" +
                "Телефон:"+number+";\nЗарплата:"+salary+";\nВозраст:"+age);
    }


   public static void main(String[] args){
      Employee[] empArray = new Employee[5];
      empArray[0]=new Employee("Oleg","boss","ivivi",89828237,50000,28);
       empArray[1]=new Employee("Alex","manager","ivivi",89828237,40000,35);
       empArray[2]=new Employee("Gena","doctor","ivivi",89828237,30000,41);
       empArray[3]=new Employee("Dmitriy","driver","ivivi",89828237,20000,67);
       empArray[4]=new Employee("Igor","teacher","ivivi",89828237,21000,40);
       for (int i =0;i<empArray.length;i++){
           if(empArray[i].age>40){
               empArray[i].info();
               System.out.println();
           }
       }
   }
}
