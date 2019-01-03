package com.tyb.tybmod.dao;

import com.tyb.tybmod.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auth: tyb
 * @Date: 19-1-2 下午2:33
 * @Desc:
 */
public interface MenuDao extends JpaRepository<Menu,String> {
}
