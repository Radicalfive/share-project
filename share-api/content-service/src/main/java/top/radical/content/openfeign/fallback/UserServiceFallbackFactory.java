package top.syhan.content.openfeign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import top.syhan.content.common.ResponseResult;
import top.syhan.content.domain.entity.User;
import top.syhan.content.openfeign.UserService;

/**
 * @description:
 * @author: syhan
 * @create: 2022-09-27
 **/

@Slf4j
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable cause) {
        return  id -> {
            log.info("fallback factory method test" +  cause);
            User user = User.builder().nickname("降级方案返回用户").avatar("defalut.jpg").build();
            return ResponseResult.success(user);
        };
    }
}

