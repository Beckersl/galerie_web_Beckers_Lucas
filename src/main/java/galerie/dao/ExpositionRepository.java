/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import galerie.entity.Exposition;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author becke
 */
public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    @Query("SELECT SUM(prixVente) "
		+ "FROM Exposition "
		+ "JOIN Transaction "
		+ "WHERE Exposition.id = :id ")
    float ChiffreAffairePour(Integer id);
}
