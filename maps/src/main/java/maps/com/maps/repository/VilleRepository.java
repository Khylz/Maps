package maps.com.maps.repository;

import maps.com.maps.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VilleRepository extends JpaRepository<Ville, Long> {
    // Méthodes personnalisées à ajouter si besoin
}