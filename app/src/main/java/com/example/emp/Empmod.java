package com.example.emp;

public class Empmod {
    public String empname;
    public String empdesig;
    public String empsal;
    public String empplace;
    public String empcomp;
    public String empemail;
    public String empmob;

    public Empmod() {
    }

    public Empmod(String empname, String empdesig, String empsal, String empplace, String empcomp, String empemail, String empmob) {
        this.empname = empname;
        this.empdesig = empdesig;
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

    public String getEmpdesig() {
        return empdesig;
    }

    public void setEmpdesig(String empdesig) {
        this.empdesig = empdesig;
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
