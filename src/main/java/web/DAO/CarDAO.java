package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Model1", 2021, 11000));
        cars.add(new Car(++CAR_COUNT, "Model2", 2022, 12000));
        cars.add(new Car(++CAR_COUNT, "Model3", 2023, 13000));
        cars.add(new Car(++CAR_COUNT, "Model4", 2024, 14000));
        cars.add(new Car(++CAR_COUNT, "Model5", 2025, 15000));
    }

    public List<Car> index() {
        return cars;
    }
}
