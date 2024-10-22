package ie.atu.week6cicd;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }
    private List<Product> list = new ArrayList<>();
    //creating a class which handles requests and responses

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send for business logic
        list = myService.addProduct(product);
        return list;
    }
}
