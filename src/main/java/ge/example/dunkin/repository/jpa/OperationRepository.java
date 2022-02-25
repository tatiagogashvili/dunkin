package ge.example.dunkin.repository.jpa;

import ge.example.dunkin.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<Operation,Integer> {
}
