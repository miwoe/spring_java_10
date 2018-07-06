package de.miwoe.java10.a;

import de.miwoe.java10.b.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    BService bService;

    public void doSomething(){
        System.out.println("Do something!");
        bService.doB();
    }
}
