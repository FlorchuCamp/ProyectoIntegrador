package com.portfolio.FC.controller;

import com.portfolio.FC.models.AboutMe;
import com.portfolio.FC.service.AboutMeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins= "http://localhost:4200")
@RequestMapping ("/usuario")
public class AboutMeController {
    
    private final AboutMeService aboutMeService;

    public AboutMeController(AboutMeService aboutMeService) {
        this.aboutMeService = aboutMeService;
    }
    
    @GetMapping("/id/{id}")
    
    public ResponseEntity<AboutMe>ObtenerUsuario(@PathVariable("id") Long id){
        
        AboutMe aboutMe= aboutMeService.buscarUsuarioPorId(id);
        return new ResponseEntity<> (aboutMe, HttpStatus.OK);
    }
    
    
    @PostMapping ("/add")
    public ResponseEntity<AboutMe> createUser(@RequestBody AboutMe aboutMe){
        AboutMe newUser= aboutMeService.addUser(aboutMe);
        return new ResponseEntity <>(newUser, HttpStatus.CREATED);
    }
    
    
    @PutMapping ("/update")
    public ResponseEntity<AboutMe>editUser(@RequestBody AboutMe aboutMe){
     
        AboutMe updateUsuario=aboutMeService.editUser(aboutMe);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
    
  
    @DeleteMapping ("/delete")
    public String deleteUser (@PathVariable ("id") Long id){
        aboutMeService.deleteUser(id);
        return "La persona fue eliminada correctamente";
    }
}

