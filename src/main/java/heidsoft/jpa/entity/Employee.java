package heidsoft.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * <code>Employee</code>
 *
 * @description:雇员实体
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/3/23 13:41
 */
@TableGenerator(name = "Emp_Gen",table = "ID_GEN",
        pkColumnName = "GEN_NAME",valueColumnName = "GEN_VAL")
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private long salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
