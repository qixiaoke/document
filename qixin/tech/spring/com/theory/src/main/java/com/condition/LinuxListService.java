package com.condition;

/**
 * Created by qixin on 2018/2/13.
 */
public class LinuxListService implements ListService {
    public String showListCmd() {
        return "ls";
    }
}
