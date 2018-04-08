package com;

import java.io.Serializable;

/**
 * Created by qixin on 2018/3/5.
 */
public class Model implements Serializable {

    private String account;

    private String amount;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
