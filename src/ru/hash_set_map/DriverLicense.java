package ru.hash_set_map;

public class DriverLicense {

    private String id;
    private String category;
    private String nameDriver;


    public DriverLicense(String id, String category, String nameDriver) {
        this.id = id;
        this.category = category;
        this.nameDriver = nameDriver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    @Override
    public String toString() {
        return "DriverLicense{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", nameDriver='" + nameDriver + '\'' +
                '}';
    }
}
