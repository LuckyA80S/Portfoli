

package bloc6;

public class p7_departaments {
    
    private String name;
    private int hours;
    private double salary;

    public p7_departaments() {
    }

    public p7_departaments(String name, int hours, double salary) {
        this.name = name;
        this.hours = hours;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "p7_departaments{" + "name=" + name + ", hours=" + hours + ", salary=" + salary + '}';
    }
    

    
    
}