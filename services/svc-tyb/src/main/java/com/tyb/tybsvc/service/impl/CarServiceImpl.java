package com.tyb.tybsvc.service.impl;

import com.tyb.tybmod.dao.CarDao;
import com.tyb.tybmod.entity.Car;
import com.tyb.tybsvc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-12-13 下午2:53
 * @Desc:
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarDao carDao;

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }
}
