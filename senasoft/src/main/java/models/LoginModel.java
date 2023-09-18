package models;

public class LoginModel {
    //atributos de clase
    private String document;
    private String password;

    //constructor
    public LoginModel(String document, String password) {
        this.document = document;
        this.password = password;
    }
    //setter y getters
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
