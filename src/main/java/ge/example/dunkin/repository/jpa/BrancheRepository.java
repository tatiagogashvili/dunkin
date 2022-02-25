package ge.example.dunkin.repository.jpa;

import ge.example.dunkin.model.Branch;
import jdk.dynalink.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrancheRepository extends JpaRepository<Branch, Integer> {
}
