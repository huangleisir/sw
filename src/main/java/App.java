import com.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.UserService;

/**
 * Created by XuSong on 2017/11/21.
 */
public class App {
    //项目启动的入口
    public static void main(String[] arg){

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.add();
    }
}
