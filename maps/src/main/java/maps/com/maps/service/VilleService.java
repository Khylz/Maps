package maps.com.maps.service;

import maps.com.maps.model.Ville;
import maps.com.maps.repository.VilleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {
    private final VilleRepository villeRepository;

    public VilleService(VilleRepository villeRepository) {
        this.villeRepository = villeRepository;
    }

    public double haversine(double lat1, double lon1, double lat2, double lon2) {
        // Calcul de la distance en km
        double R = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon/2) * Math.sin(dLon/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return Math.round(R * c);
    }

    // Méthode pour filtrer les villes selon les paramètres
    public List<Ville> findVilles(double lat, double lon, int max, int distMax, int popMin, String region) {
        // À compléter : requête filtrée sur la base
        return villeRepository.findAll(); // À remplacer
    }
}