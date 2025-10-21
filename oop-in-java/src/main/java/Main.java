
public class Main {
    public static void main(String[] args){
        TextBox textBox1 = new TextBox();
        TextBox textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox2.text);

        Employee employee = new Employee(50_000, 14);
        // employee.SetBaseSalary(-1);
        // employee.SetBaseSalary(50_000);
        // employee.setHourlyRate(14);
        int wageWithoutExtraHours = employee.calculateWage();
        int wageWithExtraHours = employee.calculateWage(14);
        System.out.println("The Wage is: " + wageWithoutExtraHours);

        //Decoupling
        Browser browser = new Browser(); // this object can only access the necessary method to be used.
        browser.navigate("https://www.google.com");

    }
}
