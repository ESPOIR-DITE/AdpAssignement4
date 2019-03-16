public class OfficeEmployee implements Employee {
    private Work work;

    public OfficeEmployee() {
        work = new Work();
    }

    public void salary(int salaryRate) {
        work.setSalaryRate(salaryRate);

    }

    public void leaveDate(String s) {
        work.setDateOfengament(s);
    }

    public void name(String name) {
        work.setName(name);
    }

    public void surName(String surname) {
        work.setSurname(surname);
    }

    public void idNumber(int id) {
        work.setId(id);
    }

    public Work getWork() {
        return work;
    }
}
