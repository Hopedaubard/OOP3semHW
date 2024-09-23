package Seminar6.Controller;

import Seminar6.Model.User;

public interface UserCreateController<T extends User> {

    void create(String firstName, String lastName, String middleName);
}
