package ge.example.dunkin.controller;


import ge.example.dunkin.model.Distribution;
import ge.example.dunkin.service.DistributionService;
import ge.example.dunkin.service.DistributionServiceImpl;
import ge.example.dunkin.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "distribution")
public class DistributionController {
    ProductService productService;
    DistributionService distributionService;

    @Autowired
    DistributionController(ProductService productService, DistributionService distributionService){
        this.productService=productService;
        this.distributionService=distributionService;

    }
    @PostMapping("{singlePrise}/product/{id}")
    public String distribution(@PathVariable Double singlePrise, @PathVariable Integer id, @RequestBody Distribution distribution){

        if (productService.Dist(singlePrise,id)){
            distributionService.addDistribution(distribution);
            return "მოთხოვნა წარმატებით შესრულდა";
        }
        return "არასაკმარისი რაოდენობა";
    }

}
