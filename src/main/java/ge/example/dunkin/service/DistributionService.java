package ge.example.dunkin.service;

import ge.example.dunkin.model.Distribution;
import org.springframework.stereotype.Service;

@Service
public interface DistributionService {

    void addDistribution(Distribution distribution);
}
