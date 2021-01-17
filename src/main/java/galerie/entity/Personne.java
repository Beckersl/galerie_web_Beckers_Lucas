/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author becke
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private PorfessionType profession;
    
    @NonNull
    private String nom;
    
    private String adresse;
    
    private String biographie;
    
    
    @OneToMany(mappedBy = "personne")
    private List<Transaction> transactions;
    
    
    public List<Transaction> getTransactions(){
    return transactions;
    }
    
    @OneToMany(mappedBy = "personne")
    private List<Transaction> tableaux;
    
    
    public List<Transaction> getTableaux(){
    return tableaux;
    }
}
