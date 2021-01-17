/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author becke
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Exposition {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    
    @NonNull
    private Date dateDebut;
    
    @NonNull
    private String intitule;
    
    private Integer duree;
    
    @ManyToOne
    private Galerie galerie;
    
    @OneToMany(mappedBy = "exposition")
    private List<Transaction> transactions;
    
    public List<Transaction> getTransactions(){
    return transactions;
    }
    
    @ManyToMany
    List<Tableau> oeuvres = new LinkedList<>();
}

