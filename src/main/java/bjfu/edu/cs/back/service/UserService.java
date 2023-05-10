package bjfu.edu.cs.back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import bjfu.edu.cs.back.common.CommonResult;
import bjfu.edu.cs.back.domain.entity.User;

import java.util.List;


public interface UserService extends IService<User> {

    public CommonResult register(User user);

}
