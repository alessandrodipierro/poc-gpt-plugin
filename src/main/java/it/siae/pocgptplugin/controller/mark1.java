package it.siae.pocgptplugin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class mark1 {

    private final List<String> placeHolder;

    public mark1() {
        this.placeHolder = new ArrayList<>();
        this.placeHolder.add("Stringa 1");
        this.placeHolder.add("Stringa 2");
        this.placeHolder.add("Stringa 3");
        this.placeHolder.add("Stringa 4");
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/")
    List<String> all() {
        return placeHolder;
    }
    // end::get-aggregate-root[]
}
