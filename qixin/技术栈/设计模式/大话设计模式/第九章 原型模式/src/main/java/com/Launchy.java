package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Launchy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resumeA = new Resume();
        resumeA.setName("resumeA");
        resumeA.setSex("male");
        resumeA.setWorkExperience("companyA");

        Resume resumeB = (Resume) resumeA.clone();
        resumeB.setName("resumeB");
        resumeB.setSex("female");
        resumeB.setWorkExperience("companyB");

        System.out.println(resumeA.toString());
        System.out.println(resumeB.toString());
    }
}
