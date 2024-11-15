package Pk1;

public class Usuario {

    int id;
    private String name;
    private String user;
    private String password;

    public Usuario() {
        id = 0;
        name = "";
        user = "";
        password = "";
    }

    public Usuario(int id, String name, String user, String password) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return "Id: " + id + ", Nombre: " + name + ", Usuario: " + user + ", Password: " + password;
    }
}
