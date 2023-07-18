package com.soodeh.learnspring.examples.a0;

        import com.soodeh.learnspring.game.GameRunner;
        import com.soodeh.learnspring.game.GamingConsole;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;


        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;

        import java.sql.SQLOutput;
        import java.util.Arrays;

//Use @Configuration annotation on top of any class to declare that this class provides one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
@Configuration
//spring create bean for all cofigs in game package
@ComponentScan("com.soodeh.learnspring.examples.a1")
public class SimpleSpringLauncherApplication {
    //    @Bean
//    public GameRunner gameRunner(GamingConsole game){
////        System.out.println(game);
//        var gameRunner=new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context=new
                AnnotationConfigApplicationContext
                (com.soodeh.learnspring.examples.a1.DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}

