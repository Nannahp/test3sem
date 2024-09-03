package com.example.test3sem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @GetMapping("/")
        @ResponseBody
    //This one is the most interesting one
        public Greeting index(@RequestParam String name, int age) {
         return new Greeting(name, age);
        }
    public class Greeting {
        public  String name;
        public  int age;

        public Greeting(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    //This is just to refresh
        @GetMapping("/ping")
        @ResponseBody
        public String Pong() {
             return "Pong";
        }

        @PostMapping("/start")
        @ResponseBody
        public String start(){
            return "Helt Sikkert!";
        }

    }

