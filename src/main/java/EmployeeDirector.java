public class EmployeeDirector {
    private Employee employee=null;

    public EmployeeDirector(Employee employee) {
        this.employee = employee;
    }
    public void construct(int id,String date,String name,String surName,int salary)
    {
        employee.idNumber(id);
        employee.leaveDate(date);
        employee.name(name);
        employee.surName(surName);
        employee.salary(salary);
    }
    public Work getWork(){
        return employee.getWork();
    }
}

