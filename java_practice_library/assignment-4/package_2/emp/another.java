/*79. Define a class Employee with private attributes (like name, age,
and salary), public methods to get and set these attributes, and a
package-private method to displayEmployeeDetails. Create
another class in the same package to test access to the
displayEmployeeDetails method.
*/

package emp;

class another{
    public static void main(String[] args)
    {
        Employee e = new Employee("jin", 23,23);
        e.call();
        System.out.println(e.getname());

    }
}


