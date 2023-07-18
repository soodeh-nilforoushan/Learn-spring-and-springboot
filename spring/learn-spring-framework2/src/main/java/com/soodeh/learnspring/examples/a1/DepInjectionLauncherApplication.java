package com.soodeh.learnspring.examples.a1;
import com.soodeh.learnspring.game.GameRunner;
import com.soodeh.learnspring.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessClass{

Dependency1 dependency1;

    public Dependency1 getDependency1() {
        return dependency1;
    }
@Autowired
    public void setDependency1(Dependency1 dependency1) {
    System.out.println("setter dependency 1");
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }
@Autowired
    public void setDependency2(Dependency2 dependency2) {
    System.out.println("setter dependency 2xs");
        this.dependency2 = dependency2;
    }

Dependency2 dependency2;



public  String toString(){
    return dependency1+ "busines clas"+ dependency2;
}
}

@Component
class Dependency1{

}
@Component
class Dependency2{

}


//Use @Configuration annotation on top of any class to declare that this class provides one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime.
@Configuration
//spring create bean for all cofigs in game package
@ComponentScan("com.soodeh.learnspring.examples.a1")
public class DepInjectionLauncherApplication {
//    @Bean
//    public GameRunner gameRunner(GamingConsole game){
////        System.out.println(game);
//        var gameRunner=new GameRunner(game);
//        return gameRunner;
//    }
    public static void main(String[] args) {
        var context=new
                AnnotationConfigApplicationContext
                (DepInjectionLauncherApplication.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(BusinessClass.class));
    }
    }

