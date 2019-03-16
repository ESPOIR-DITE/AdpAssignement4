public class Work {

    private String name;
    private String surname;
    private int id;
    private String dateOfengament;
    private double salaryRate;
   // private  String numberPlate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfengament() {
        return dateOfengament;
    }

    public void setDateOfengament(String dateOfengament) {
        this.dateOfengament = dateOfengament;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    @Override
    public String toString() {
        return
                "name : " + name +
                " surname : " + surname +
                " id : " + id +
                " dateOfengament : " + dateOfengament +
                "salaryRate=" + salaryRate+"\n";
    }
}
