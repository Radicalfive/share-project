package top.syhan.content.openfeign.fallback;

import lombok.extern.slf4j.Slf4j;
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
public class UserServiceFallback implements UserService {
    @Override

    public ResponseResult getUser(int id) {
        log.info("fallback getUser");
        User user = User.builder().id(111).mobile("18700002333").nickname("降级方案返回用户").build();

        return  ResponseResult.success(user);
    }
}

