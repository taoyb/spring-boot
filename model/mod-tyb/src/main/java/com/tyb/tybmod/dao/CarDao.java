package com.tyb.tybmod.dao;

import com.tyb.tybmod.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auth: tyb
 * @Date: 18-8-31 上午10:07
 * @Desc:
 */
public interface CarDao extends JpaRepository<Car, String> {

}
