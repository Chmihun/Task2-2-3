package web.Servise;

import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServse {
    private final CarDAO carDao;

    public CarServse(CarDAO carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        List<Car> allCars = carDao.index();
        if (count >= 5) {
            return allCars;
        }
        if (count > allCars.size()) {
            count = allCars.size();
        }
        return allCars.subList(0, count);
    }
}
