package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public List<Patients> hello(){
        List<Patients> student = List.of(
                new Patients(1, "Yamada", 25, "standing work", "sprain"),
                new Patients(2, "Shimamura",27, "desk work", "lower back pain"),
                new Patients(3, "Murakami", 29, "baseball player", "Shoulder pain"));
        return student;
    }
}
