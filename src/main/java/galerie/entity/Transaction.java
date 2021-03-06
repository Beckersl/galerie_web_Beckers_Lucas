/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.sql.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author becke
 */

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Transaction {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    private Date venduLe;
    
    private float prixVente;
    
    @ManyToOne
    private Exposition exposition;
    
    @ManyToOne
    private Personne personne;
    
    @OneToOne
    private Tableau ouevre;
    
    
    
}
