package org.example.config;

import org.example.Alien;
import org.example.Computer;
import org.example.Desktop;
import org.example.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

//    @Bean
//    public Alien alien(@Autowired Computer com){ //@Qualifier("desktop")
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setCom(desktop());
//        return obj;
//    }
////    @Bean(name = {"com1", "desktop", "Beast"})
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop(){
//        return  new Desktop();
//    }
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return  new Laptop();
//    }

}
