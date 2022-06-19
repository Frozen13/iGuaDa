package life.iGuaDa.community.listener;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import life.iGuaDa.community.listener.event.QuestionRateLimiterEvent;
import life.iGuaDa.community.mapper.QuestionMapper;
import life.iGuaDa.community.mapper.UserMapper;
import life.iGuaDa.community.model.User;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class QuestionRateLimiterListener implements ApplicationListener<QuestionRateLimiterEvent> {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionMapper questionMapper;

    private static Cache<Long, Integer> disableUsers = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterWrite(1, TimeUnit.DAYS)
            .build();

    @SneakyThrows
    @Override
    public void onApplicationEvent(QuestionRateLimiterEvent event) {
        Integer count = disableUsers.get(event.getUserId(), () -> 0);
        disableUsers.put(event.getUserId(), count + 1);
        log.info("receive rate limit event : {}, count : {}", event.getUserId(), count);
        if (count >= 60) {
            User user = userMapper.selectByPrimaryKey(event.getUserId());
            if (user != null) {
                user.setDisable(1);
                log.info("disable user {}", event.getUserId());
                userMapper.updateByPrimaryKey(user);
            }
        }
    }
}
