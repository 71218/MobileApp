package com.example.mobileapp.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@Slf4j
@RequestMapping("info")
public class InfoCOntroller {

    @GetMapping
    public String info() {
        log.info("Wykonanie metody info");
        return "Hello World";
    }
    @ResponseBody
    @GetMapping("record")
    public RecordDto record() {
        return RecordDto.builder().name("Gaśnica").value(2.7).build();
    }

    @PostMapping("record")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createRecord(@RequestBody RecordDto dto) {
        log.info("Otrzymałem rekord: " + dto);
    }

    @PutMapping("record/{id}")
    @ResponseStatus(code = HttpStatus.FOUND)
    public void updateRecord(@RequestBody RecordDto dto, @PathVariable("id") Long id) {
        log.info("Aktualizuję  rekord nr " + id + ": " + dto);
    }

    @DeleteMapping("record/{id}")
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public void updateRecord(@PathVariable("id") Long id) {
        log.info("Usuwam  rekord nr " + id + ".");
    }
    //TODO: JPA, SERVICE,  BAZA H2 + DOCKER
}
