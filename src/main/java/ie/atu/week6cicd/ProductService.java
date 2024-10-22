package ie.atu.week6cicd;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product>myList = new ArrayList<>();

    public List<Product> getProduct()
    {
        return myList;
    }

    public List<Product> addProduct(Product product)
    {
        myList.add(product);
        return myList;
    }
}
