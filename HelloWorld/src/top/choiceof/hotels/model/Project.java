package top.choiceof.hotels.model;

import java.util.Calendar;

public class Project {
    private String user_login;
    private int project_id;
    private String project_name;
    private int year;
    private boolean active;
    private boolean read_only;
    private boolean current;

    public Project(String user_login, int project_id, String project_name, int year, boolean active, boolean read_only, boolean current) {
        this.user_login = user_login;
        this.project_id = project_id;
        this.project_name = project_name;
        this.year = year;
        this.active = active;
        this.read_only = read_only;
        this.current = current;
    }

    public Project(String user_login) {
        this.user_login = user_login;
        this.active = true;
        this.read_only = false;

        Calendar calendar = Calendar.getInstance();
        this.year = calendar.get(Calendar.YEAR);
        this.current = false;
        this.project_id = 0;

    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isRead_only() {
        return read_only;
    }

    public void setRead_only(boolean read_only) {
        this.read_only = read_only;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }
}
