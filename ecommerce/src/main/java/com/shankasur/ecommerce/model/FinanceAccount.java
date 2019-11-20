package com.shankasur.ecommerce.model;

import java.util.ArrayList;

public class FinanceAccount
{
    private long financeaccountid;
    private ArrayList<Transaction> transactionList;
    private String bankName;
    private String accountNo;
    private float accountbalance=0;


    public FinanceAccount(){
        transactionList=new ArrayList<Transaction>();
    }

    public long getFinanceaccountid() {
        return financeaccountid;
    }

    public void setFinanceaccountid(long financeaccountid) {
        this.financeaccountid = financeaccountid;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public float getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(float accountbalance) {
        this.accountbalance = accountbalance;
    }

    public Transaction createAndAddCreditTransaction(){
        Transaction transaction=new Transaction(Transaction.Type.Debit);
        transactionList.add(transaction);
        return transaction;

    }

    public Transaction createAndAddDebitTransaction(){
        Transaction transaction=new Transaction(Transaction.Type.Debit);
        transactionList.add(transaction);
        return transaction;

    }
}
