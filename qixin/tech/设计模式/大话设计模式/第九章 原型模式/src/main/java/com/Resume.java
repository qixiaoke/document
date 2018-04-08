package com;

/**
 * Created by qixin on 2017/6/24.
 */
public class Resume implements Cloneable {
    private String name;
    private String sex;
    private WorkExperience workExperience;

    public Resume() {
        this.workExperience = new WorkExperience();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String company) {
        workExperience.setCompany(company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume();
        obj.setName(this.name);
        obj.setSex(this.sex);
        obj.setWorkExperience(this.workExperience.getCompany());
        return obj;
    }

    @Override
    public String toString() {
        return "name = " + name + ", sex = " + sex + ", company = " + workExperience.getCompany();
    }
}
