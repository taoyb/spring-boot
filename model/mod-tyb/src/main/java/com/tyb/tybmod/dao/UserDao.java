package com.tyb.tybmod.dao;

import com.tyb.tybmod.entity.Car;
import com.tyb.tybmod.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-8-31 上午10:07
 * @Desc:
 */
public interface UserDao extends JpaRepository<User, String> {

    public List<User> findByUserName(String userName);

}
