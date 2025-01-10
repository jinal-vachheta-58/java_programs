/*79. Define a class Employee with private attributes (like name, age,
and salary), public methods to get and set these attributes, and a
package-private method to displayEmployeeDetails. Create
another class in the same package to test access to the
displayEmployeeDetails method.

*/
package emp;
class Employee{
    private String name;
    private int age;
    private double salary;

    Employee(String n,int a,float s)
    {
        this.name = n;
        this.age = a;
        this.salary = s;
    }
    public String getname()
    {
        return name;
    } 

    public int getage()
    {
        return age;
    } 

    public double getsalary()
    {
        return salary;
    } 

    public void call()
    {
        this.displayEmployeeDetails();
    }
    private void displayEmployeeDetails()
    {
        System.out.println(name+ age+salary);
    }
}