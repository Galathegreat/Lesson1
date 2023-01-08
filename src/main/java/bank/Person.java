package bank;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDate;

    public Person(String firstName,String lastName,int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (birthDate > 0) {
            this.birthDate = birthDate;
        }
    }
    public void setBirthDate(int birthDate) {
        if (birthDate > 0) {
            this.birthDate = birthDate;
        }
    }
    public int getBirthDate() {
        return this.birthDate;
    }
}

