package top.choiceof.hotels.model;

public class User {
    private String login;
    private String password;
    private String description;
    private boolean active;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean CheckPassword(String password) {
        return this.password == password;
    }

    public User(String login, String password, String description, boolean active) {
        this.login = login;
        this.password = password;
        this.description = description;
        this.active = active;
    }

	public User() {
		// TODO Auto-generated constructor stub
	}
}
