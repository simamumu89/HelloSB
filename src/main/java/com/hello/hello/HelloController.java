package com.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public List<Student> hello(){
        List<Student> student = List.of(
                new Student(1, "Yamada", 25, "standing work", "sprain"),
                new Student(2, "Shimamura",27, "desk work", "lower back pain"),
                new Student(3, "Murakami", 29, "baseball player", "Shoulder pain"));
        return student;
    }
}
