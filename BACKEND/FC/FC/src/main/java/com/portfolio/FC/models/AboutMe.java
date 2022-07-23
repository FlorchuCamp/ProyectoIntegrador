package com.portfolio.FC.models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class AboutMe implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idUser;
    
    @NotNull
    @Size (min= 1, max = 50, message = "No cumple con la longitud.")
    private String name; 
    
    @NotNull
    @Size (min= 1, max = 50, message = "No cumple con la longitud.")
    private String surname;
    
    @NotNull
    @Size (min= 1, max = 50, message = "No cumple con la longitud.")
    private String title;
    
    @NotNull
    @Size (min= 1, max = 50, message = "No cumple con la longitud.")
    private String img;
    
    @NotNull
    @Size (min= 1, max = 500, message = "No cumple con la longitud.")
    private String description;
    
    

    public AboutMe() {
    }

    public AboutMe(Long idUser, String name, String surname, String title, String img, String description) {
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.img = img;
        this.description = description;
        
    }

    
    
    
}
