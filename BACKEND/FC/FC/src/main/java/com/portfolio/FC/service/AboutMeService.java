package com.portfolio.FC.service;

import com.portfolio.FC.Exception.UserNotFoundException;
import com.portfolio.FC.Repository.AboutMeRepo;
import com.portfolio.FC.models.AboutMe;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
@Transactional
public class AboutMeService {
    
    private final AboutMeRepo aboutMeRepo;
    
    @Autowired
    public AboutMeService(AboutMeRepo aboutMeRepo) {
        this.aboutMeRepo = aboutMeRepo;
    }
    
    public AboutMe addUser (AboutMe aboutMe){
        return aboutMeRepo.save(aboutMe);
    }
    
    public List<AboutMe>buscarUser(){
        return aboutMeRepo.findAll();
    }
    
    public AboutMe editUser (AboutMe aboutMe){
        return aboutMeRepo.save(aboutMe);
    }
    
    public void deleteUser(Long id){
        aboutMeRepo.deleteById(id);
    }
    
    public AboutMe buscarUsuarioPorId (long id){
        return aboutMeRepo.findById(id).orElseThrow(()->new UserNotFoundException("Usuario no encontrado."));
    }
    
}
