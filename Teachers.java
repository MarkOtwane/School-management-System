package schoolmanagementsystem;

public class Teachers {
//    keeping truck of teachers id name and the salary
    private final int id;
    private final String name;
    private int salary;
    private int salaryEarned;

    public Teachers(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary =  salary;
        this.salaryEarned = 0;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }


    public void add(Teachers teachers) {
    }
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

    @Override
    public String toString() {
        return "Name of the teacher : " +name+ " Total salary earned is $" +salaryEarned;
    }
}
