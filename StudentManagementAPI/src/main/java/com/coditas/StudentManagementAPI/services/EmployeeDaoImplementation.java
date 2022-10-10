package com.coditas.StudentManagementAPI.services;

import com.coditas.StudentManagementAPI.entities.Employee;
import com.coditas.StudentManagementAPI.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeDaoImplementation implements EmployeeDao {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public void createEmployeeRecord(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void deleteEmployeeRecord(int employeeId) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(session.get(Employee.class,employeeId));
        session.getTransaction().commit();
    }

    public List<Employee> fetchAllEmployee(){
        Session session = sessionFactory.openSession();
        return session.createQuery("from Employee").list();
    }



    public Employee fetchbyId(int id){
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class,id);
        return employee;
    }
    @Override
    public void updateEmployeeDetails(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(employee);
        session.getTransaction().commit();
    }


}
