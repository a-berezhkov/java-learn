package ru.tree_map_set_home;

public class Contact {

    private String phone;
    private String name;
    private String lname;
    private String group;

    public Contact(String phone, String name, String lname, String group) {
        this.phone = phone;
        this.name = name;
        this.lname = lname;
        this.group = group;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return name + " " + lname;
    }
}
