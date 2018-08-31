package top.choiceof.hotels.model;

public class URLs {
    private int project_id;
    private String URL;
    private String status;
    private String domain;

    public int getProject_id() {
        return project_id;
    }

    //public void setProject_id(int project_id) {
    //    this.project_id = project_id;
    //}

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public URLs(int project_id, String URL, String status, String domain) {
        this.project_id = project_id;
        this.URL = URL;
        this.status = status;
        this.domain = domain;
    }
}
