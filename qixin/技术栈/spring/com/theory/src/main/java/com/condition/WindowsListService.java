package com.condition;

/**
 * Created by qixin on 2018/2/13.
 */
public class WindowsListService implements ListService {
    public String showListCmd() {
        return "dir";
    }
}
