package com.heidsoft.jpa;

import com.heidsoft.jpa.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * <code>EntityManagerApp</code>
 *
 * @description:实体管理器测试
 * @version:0.0.1
 * @author:liubin(wind.b.liu@leaptocloud.com)
 * @date:2016/3/23 11:39
 */
public class EntityManagerApp {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {

            entityManager.getTransaction().begin();
            Employee employee = new Employee();
            employee.setId(2);
            employee.setName("jake");

            //持久化数据
            entityManager.persist(employee);

            //查找数据
            Employee employee1 = entityManager.find(Employee.class, 1);
            System.out.println(employee1.getId());
            entityManager.remove(employee1);

            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }
}
