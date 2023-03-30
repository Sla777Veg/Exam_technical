public class Main {
    public static void main(String[] args) {

       Employee employee = new Employee("Petr", -1);

        //System.out.println(employee.getNumber());
        System.out.println(employee);

        try {
            employee.getNumber();
        } catch (IllegalNumber e) {
            System.out.println("Неправильное число");
            System.out.println(e.getMessage());
        }

    }
}