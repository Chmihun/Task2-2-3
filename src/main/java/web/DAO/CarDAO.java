package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private static int CAR_COUNT;
    private  List<Car> car;
    {
        car = new ArrayList<>();

        car.add(new Car(++CAR_COUNT,"Model1", 2021, 11000));
        car.add(new Car(++CAR_COUNT,"Model2", 2022, 12000));
        car.add(new Car(++CAR_COUNT,"Model3", 2023, 13000));
        car.add(new Car(++CAR_COUNT,"Model4", 2024, 14000));
        car.add(new Car(++CAR_COUNT,"Model5", 2025, 15000));
    }
    public List<Car> index(){
        return car;
    }
    public  Car show(int id){
        return car.stream().filter(car-> (car.getId() == id)).
                findAny().orElse(null);
    }
}
