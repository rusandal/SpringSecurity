package ru.minikhanov.springsecirity.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/news")
    public ResponseEntity<String> getNews(){
        return new ResponseEntity<String>("News, news,new", HttpStatus.OK);
    }

    @GetMapping("/topsecret")
    public ResponseEntity<String> getSecretNews(){
        return new ResponseEntity<String>("Secret news", HttpStatus.OK);
    }

}
