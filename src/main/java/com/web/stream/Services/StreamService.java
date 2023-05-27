package com.web.stream.Services;

import org.springframework.core.io.Resource;
import reactor.core.publisher.Mono;

public interface StreamService {

    public Mono<Resource> getVideo(String title);

}
