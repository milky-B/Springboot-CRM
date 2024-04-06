package com.gdut.crm.service.workbench;

import com.gdut.crm.pojo.workbench.Contacts;
import com.gdut.crm.pojo.workbench.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    int insert(Customer customer);
    List<Customer> queryCustomerByConditions(Map<String, Object> conditions);
    int countAllByConditions(Map<String,Object> conditions);
    Customer selectByPrimary(String id);
    int updateByPrimary(Customer customer);
    int deleteByKeys(String[] list);
    Customer selectOneById(String id);
    List<String> selectByName(String name);
    String selectIdByName(String name);
    Contacts customerCreateContact(Contacts contacts, String user);
}

