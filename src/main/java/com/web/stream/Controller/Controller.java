package com.web.stream.Controller;

import com.web.stream.Services.StreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/")
public class Controller {

    @Autowired
    private StreamService streamService;

    @GetMapping(value = "video/{title}", produces = "videos/mp4")
    public Mono<Resource> getVideo(@PathVariable String title, @RequestHeader("Range") String range) {
        System.out.println("Range in bytes "+range);
        return  streamService.getVideo(title);
    }

}
