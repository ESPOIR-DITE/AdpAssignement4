import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 ArrayList<Object> employeeList= new ArrayList();
        Employee employee = new CarDrivers();
        EmployeeDirector employeeDirector=new EmployeeDirector(employee);
        employeeDirector.construct(2828228,"date","espoir","dite",50000);
        Work work = employeeDirector.getWork();
        employeeList.add(work);



         employee = new BikeDreiver();
         employeeDirector = new EmployeeDirector(employee);
        employeeDirector.construct(2828228,"date","espoir1","dite",50000);
        work = employeeDirector.getWork();
        employeeList.add(work);


        employee = new OfficeEmployee();
        employeeDirector = new EmployeeDirector(employee);
        employeeDirector.construct(2828228,"date","espoir2","dite",50000);
        work = employeeDirector.getWork();
        employeeList.add(work);







            System.out.println("ArrayList"+employeeList.toString());

    }

}
