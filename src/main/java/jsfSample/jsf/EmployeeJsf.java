package jsfSample.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.Date;

@ManagedBean
@ViewScoped
public class EmployeeJsf  {
    private Integer id;

    private String name;

    private Double salary;

    private Date positionId;

    private Integer departmentId;

    private Date hiredate;

    private Date resignationDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getPositionId() {
        return positionId;
    }

    public void setPositionId(Date positionId) {
        this.positionId = positionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Date getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Date resignationDate) {
        this.resignationDate = resignationDate;
    }
}
