package com.gdut.crm.service.workbench;

import com.gdut.crm.pojo.workbench.ContactsRemark;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ContactsRemarkService {
    int insertContactsRemarkByTransferClueRemark(List<ContactsRemark> contactsRemarks);
    void deleteRemarkByCustomerIds(String[] ids);
    List<ContactsRemark> selectRemarkByContactsId(String id);
    int insertRemark(ContactsRemark contactsRemark);
    ContactsRemark selectRemarkById(String id);
    int deleteByPrimaryId(String id);
    int updateRemarkByPrimaryKey(ContactsRemark contactsRemark);
    int deleteByContactsId(String[] ids);
}
