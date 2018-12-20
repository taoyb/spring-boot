/*
package com.tyb.tybsvc.service.impl;

import com.tyb.infra.AjaxDone;
import com.tyb.tybmod.dao.UserDao;
import com.tyb.tybmod.entity.User;
import com.tyb.tybsvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

*/
/**
 * @Auth: tyb
 * @Date: 18-12-13 下午2:53
 * @Desc:
 *//*

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Autowired
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public AjaxDone findLoginByUserName(String userName) {
        List<User> list = userDao.findByUserName(userName);
        if (list.size() > 0) {
            if (true
                   */
/* && !Tools.isEmpty(model.getPassword())
                    && Md5Util.getEncryptedPwd(model.getPassword()).equals(user.getPassword())
                    && model.getPassword().trim().equals(user.getPassword()) && model.getUserName().equals(user.getUserName())*//*

                    ) {
//                request.getSession().setAttribute("loginUser", user);
                return AjaxDone.successCloseRel("jbsxBox");
            } else {
                return AjaxDone.error("用户密码有误");
            }
        } else {
            return AjaxDone.error("用户名不存在");
        }
    }
}
*/
