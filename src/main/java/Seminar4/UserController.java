package Seminar4;

public interface UserController<T extends User> {

    void create(String firstName, String lastName, String middleName);
}
