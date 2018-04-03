package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class SpringExam01 {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        MediaPlayer player = context.getBean(CDPlayer.class);
        player.play();
    
        MediaPlayer player2 = context.getBean(CDPlayer2.class);
        player2.play();
        
        
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        
        
    }
    
}
