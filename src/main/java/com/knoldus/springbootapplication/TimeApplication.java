package com.knoldus.springbootapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@RestController
public class TimeApplication implements TimeApplicationInterface {

    //This method will be called when we run the localhost/status api.
    @GetMapping("/status")
    public String getCurrentTime() {
     Date time = new Date();
     DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
     String currentTime = timeFormat.format(time);
    return "Successfully running API : "
        .concat(currentTime);
  }
}
