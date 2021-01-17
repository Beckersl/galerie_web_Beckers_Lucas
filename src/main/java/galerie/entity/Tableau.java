/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author becke
 */

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Tableau {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @NonNull
    private String title;
    
    @NonNull
    private int largeur;
    
    @NonNull
    private int huteur;
    
    @OneToOne(mappedBy = "ouevre")
    private Transaction vendu;
    
    @ManyToOne
    private Personne personne;
    
    @ManyToMany(mappedBy = "ouvres")
    List<Exposition> acrochage = new LinkedList<>();
}
