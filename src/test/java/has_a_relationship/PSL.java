package has_a_relationship;

public class PSL {
    int empId;
    int empSalary;
    String empName;
    Address address;

    public int getEmpId() {
        return empId;
    }

    public PSL(int empId, int empSalary, String empName, Address address) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empName = empName;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }


}
