package org.noob.concurrency.geektime.java并发实战.chat04;

/**
 * 保护没有关联的多个资源
 */
public class AccountTransfer {
    //账户余额
    private Integer balance;

    /**
     * 转账
     *
     * @param amt
     */
    synchronized void transfer(AccountTransfer target, Integer amt) {
        if (balance > amt) {
            balance -= amt;
            target.balance += amt;
        }
    }

    /**
     * 转账
     *
     * @param amt
     */
    void transfer1(AccountTransfer target, Integer amt) {
        synchronized (AccountTransfer.class) {
            if (balance > amt) {
                balance -= amt;
                target.balance += amt;
            }
        }
    }


}
