package ge.example.dunkin.service;


import ge.example.dunkin.model.Distribution;
import ge.example.dunkin.repository.jpa.DistributionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributionServiceImpl implements DistributionService{
    DistributionRepository distributionRepository;

    @Autowired
    DistributionServiceImpl(DistributionRepository distributionRepository){
        this.distributionRepository=distributionRepository;
    }
    @Override
    public void addDistribution(Distribution distribution) {
        distribution.setId(null);
        distributionRepository.save(distribution);
    }

}
