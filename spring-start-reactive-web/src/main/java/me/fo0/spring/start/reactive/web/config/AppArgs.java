package me.fo0.spring.start.reactive.web.config;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

/**
 * @created 10.10.2020 - 22:51:06
 * @author fo0 (GH:fo0)
 * @version 0.1
 */
@Component
@Log4j2
public class AppArgs {

    @Autowired
    private ApplicationArguments args;

    public List<String> getCmdArgs() {
        return args.getNonOptionArgs();
    }

    public List<String> getSpringArgs() {
        return Stream.of(args.getSourceArgs()).collect(Collectors.toList());
    }
}