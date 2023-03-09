public class Author {
    private String name;
    private String lastName;
    private String emaill;
    private char gender;

    public Author(String name,String lastName, String emaill, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.emaill = emaill;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "name " + name + " " +
                "lastName " + lastName +"\n" +
                "emaill " + emaill + "\n" +
                "gender " + gender ;
    }
}