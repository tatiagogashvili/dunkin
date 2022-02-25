package ge.example.dunkin.repository.jpa;

import ge.example.dunkin.model.Distribution;
import jdk.dynalink.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributionRepository extends JpaRepository<Distribution, Integer> {
}
