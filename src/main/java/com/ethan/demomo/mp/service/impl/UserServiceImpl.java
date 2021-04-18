package com.ethan.demomo.mp.service.impl;

import com.ethan.demomo.mp.entity.User;
import com.ethan.demomo.mp.mapper.UserMapper;
import com.ethan.demomo.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author czy
 * @since 2021-04-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
