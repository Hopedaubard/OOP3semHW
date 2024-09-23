package Seminar6.View;

import Seminar6.Model.User;

import java.util.List;
public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);
}
