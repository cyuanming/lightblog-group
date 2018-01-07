package service.impl;

import mapper.UserMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;
import pojo.User;
import pojo.UserTemp;
import service.UserService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
    private  static Logger log = Logger.getLogger(WorkServiceImpl.class);
    private  int count;
    @Autowired
    private UserMapper userMapper;
    public UserTemp getUserTempByUserId(String userId, HttpSession httpSession) {
        log.info("----usertemp获取处理：start");

        ServletContext sc = httpSession.getServletContext();
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);
        UserTemp userTemp = (UserTemp) applicationContext.getBean("userTemp");

        User user = userMapper.selectByPrimaryKey(userId);

        userTemp.userName = user.getUserName();
        userTemp.userIntroduction = user.getUserIntroduction();
        userTemp.userHeadiconPath = user.getUserHeadiconPath();

        log.info("返回userTemp: userName = "+userTemp.userName+"\nuserIntroduction = "+userTemp.userIntroduction+"\nuserHeadiconPath = "+userTemp.userHeadiconPath);

        log.info("----usertemp获取处理：end");
        return userTemp;
    }
}
