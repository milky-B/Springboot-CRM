package com.gdut.crm.service.workbench;

import org.springframework.stereotype.Service;


public interface TransactionRemarkService {
    void insertRemarkByTransferClueRemark(String clueId,String transactionId);
    int deleteRemarkByTransactionId(String id);
}
