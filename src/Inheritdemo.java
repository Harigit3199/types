class Employees {  //superclass
    private String name;
    private double salary;

    Employees(String employeename, double employeesalary) {
        name = employeename;
        salary = employeesalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String employeename) {
        name = employeename;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double employeesalary) {
        salary = employeesalary;
    }
}
class Manager extends Employees //subclass
{
    double bonus;
    Manager(String employeename ,double employeesalary,double managerbonus)
    {
        super(employeename,employeesalary);
        bonus=managerbonus;
    }
    public void setBonus(double managerbonus)
    {
        bonus=managerbonus;
    }
    public double getSalary()//method override
    {
        return super.getSalary()+bonus;
    }
}
public class Inheritdemo
{
    public static void main(String[] args)
    {
        Employees Employee= new Employees("Hari", 25000);
        System.out.println("Name of the Employee: "+Employee.getName());
        System.out.println("Salary for Employees: "+ Employee.getSalary());
        System.out.println( );

        Manager manager= new Manager("Haran",50000,20000);
        //M1.setBonus(20000);
        System.out.println("Name of the Manager: "+manager.getName());
        System.out.println("Salary for Company Manager + bonus : "+ manager.getSalary());
    }
}



