package ie.atu.week6cicd;

import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/getProducts")
    public List<Product> getProduct()
    {
        list = myService.getProduct();
        return list;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send for business logic
        list = myService.addProduct(product);
        return list;
    }
}
