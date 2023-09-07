package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public List<Patient> hello(){
        List<Patient> patient = List.of(
                new Patient(1, "Yamada", 25, "standing work", "sprain"),
                new Patient(2, "Shimamura",27, "desk work", "lower back pain"),
                new Patient(3, "Murakami", 29, "baseball player", "Shoulder pain"));
        return patient;
    }
}
