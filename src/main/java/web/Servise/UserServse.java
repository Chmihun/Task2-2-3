package web.Servise;

import org.springframework.stereotype.Service;
import web.DAO.PersonDAO;
import web.model.Person;

import java.util.List;

@Service
public class UserServse {
    private final PersonDAO userDao;

    public UserServse(PersonDAO userDAO) {
        this.userDao = userDAO;
    }

    public List<Person> getUsers(int count) {
        List<Person> allUsers = userDao.index();
        if (count >= 5) {
            return allUsers;
        }
        if (count > allUsers.size()) {
            count = allUsers.size();
        }
        return allUsers.subList(0, count);
    }
}
