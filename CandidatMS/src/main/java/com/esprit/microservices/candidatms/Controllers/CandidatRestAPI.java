package com.esprit.microservices.candidatms.Controllers;

import com.esprit.microservices.candidatms.Entities.Candidat;
import com.esprit.microservices.candidatms.Services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/candidats")
public class CandidatRestAPI {
    private String hello="Hello From MS1";
    @RequestMapping("/hello")
    public String sayHello(){
        return hello;
    }
    @Autowired
    private CandidatService candidatService;
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Candidat> createCandidat(@RequestBody Candidat candidat) {  return new ResponseEntity<>(candidatService.addCandidat(candidat), HttpStatus.OK); }
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Candidat> updateCandidat(@PathVariable(value = "id") int id,  @RequestBody Candidat candidat){  return new ResponseEntity<>(candidatService.updateCandidat(id, candidat),  HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}") @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> deleteCandidat(@PathVariable(value = "id") int id){  return new ResponseEntity<>(candidatService.deleteCandidat(id), HttpStatus.OK); }


}
