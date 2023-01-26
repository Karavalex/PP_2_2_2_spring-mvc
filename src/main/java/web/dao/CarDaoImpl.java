package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("Geely" , "Red" , 2021));
        carList.add(new Car("BMW" , "Green" , 2022));
        carList.add(new Car("LADA" , "Black" , 2001));
        carList.add(new Car("Nissan" , "Blue" , 2016));
        carList.add(new Car("Volvo" , "Gray" , 2023));


    }

    @Override
    public List<Car> getCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
