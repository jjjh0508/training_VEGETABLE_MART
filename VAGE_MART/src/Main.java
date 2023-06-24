import com.jihwan.mart.config.ContextConfiguration;
import com.jihwan.mart.dto.MartDTO;
import com.jihwan.mart.service.MartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name: names
             ) {
            System.out.println(name);
        }
        MartService martService = context.getBean("martService", MartService.class);

        MartDTO martDTO = martService.selectProduct();

        System.out.println(martDTO);
    }
}