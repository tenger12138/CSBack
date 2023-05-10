package bjfu.edu.cs.back.service.impl;

import bjfu.edu.cs.back.common.CommonResult;
import bjfu.edu.cs.back.domain.entity.User;
import bjfu.edu.cs.back.mapper.UserMapper;
import bjfu.edu.cs.back.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    @Transactional
    public CommonResult register(User user) {
        return null;
    }

}
