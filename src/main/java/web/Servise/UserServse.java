package web.Servise;

import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Users;

import java.util.List;

@Service
public class CarServse {
    private final CarDAO carDao;

    public CarServse(CarDAO carDao) {
        this.carDao = carDao;
    }

    public List<Users> getCars(int count) {
        List<Users> allUsers = carDao.index();
        if (count >= 5) {
            return allUsers;
        }
        if (count > allUsers.size()) {
            count = allUsers.size();
        }
        return allUsers.subList(0, count);
    }
}
