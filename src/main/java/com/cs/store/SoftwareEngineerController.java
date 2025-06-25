package com.cs.store;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineer")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Jaimico",
                        "Java 17"
                ),
                new SoftwareEngineer(
                        2,
                        "Raul",
                        "Node "
                )
        );
    }


}
