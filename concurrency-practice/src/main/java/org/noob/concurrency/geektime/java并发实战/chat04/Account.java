package org.noob.concurrency.geektime.java并发实战.chat04;

/**
 * 保护没有关联的多个资源
 */
public class Account {
    //锁：保护账户余额
    private final Object balLock = new Object();
    //账户余额
    private Integer balance;
    //锁：保护账户密码
    private final Object pwLock = new Object();
    //账户密码
    private String password;

    /**
     * 取款
     *
     * @param amt
     */
    void withDraw(Integer amt) {
        synchronized (balLock) {
            if (this.balance > amt) {
                this.balance -= amt;
            }
        }
    }

    /**
     * 查看余额
     *
     * @return
     */
    Integer getBalance() {
        synchronized (balLock) {
            return balance;
        }
    }

    /**
     * 更改密码
     *
     * @param pwd
     */
    void updatePassword(String pwd) {
        synchronized (pwLock) {
            this.password = pwd;
        }
    }

    /**
     * 查看密码
     *
     * @return
     */
    String getPassword() {
        synchronized (pwLock) {
            return password;
        }

    }

}
