public class empmod {
    public String empname;
    public String empdes;
    public String empsal;
    public String empplace;
    public String empcomp;
    public String empemail;
    public String empmob;

    public empmod() {
    }

    public empmod(String empname, String empdes, String empsal, String empplace, String empcomp, String empemail, String empmob) {
        this.empname = empname;
        this.empdes = empdes;
        this.empsal = empsal;
        this.empplace = empplace;
        this.empcomp = empcomp;
        this.empemail = empemail;
        this.empmob = empmob;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpdes() {
        return empdes;
    }

    public void setEmpdes(String empdes) {
        this.empdes = empdes;
    }

    public String getEmpsal() {
        return empsal;
    }

    public void setEmpsal(String empsal) {
        this.empsal = empsal;
    }

    public String getEmpplace() {
        return empplace;
    }

    public void setEmpplace(String empplace) {
        this.empplace = empplace;
    }

    public String getEmpcomp() {
        return empcomp;
    }

    public void setEmpcomp(String empcomp) {
        this.empcomp = empcomp;
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail;
    }

    public String getEmpmob() {
        return empmob;
    }

    public void setEmpmob(String empmob) {
        this.empmob = empmob;
    }
}
