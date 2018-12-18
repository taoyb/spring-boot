package com.tyb.tybsvc.service;


import com.tyb.infra.AjaxDone;
import com.tyb.tybmod.entity.User;

import java.util.List;

/**
 * @Auth: tyb
 * @Date: 18-12-13 下午2:51
 * @Desc:
 */
public interface UserService {

    public List<User> findAll();

    public AjaxDone findLoginByUserName(String userName);

}
