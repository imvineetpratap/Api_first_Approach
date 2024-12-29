package com.open_specApi.open_specApi.api;

import com.open_specApi.open_specApi.model.Greetings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController implements GreetingsApi{

    @Override
    public ResponseEntity<Greetings> getGreetings() {
       String hello="hii cool buddy";
       Greetings greet=new Greetings();
       greet.setHey(hello);
       return ResponseEntity.ok(greet);
    }
}
