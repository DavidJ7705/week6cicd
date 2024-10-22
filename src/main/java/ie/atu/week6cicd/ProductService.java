package ie.atu.week6cicd;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product>myList = new ArrayList<>();

    public List<Product> getProduct()
    {
        return myList;
    }

    public List<Product> addProduct(@Valid  Product product)
    {
        myList.add(product);
        return myList;
    }

    public List<Product> updateProduct(@PathVariable int id, @RequestBody Product product)
    {
        for(Product p : myList) {
            if (p.getId()==id) {
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

    public List<Product> deleteProduct(@PathVariable int id)
    {
        for(Product p : myList) {
            if (p.getId()==id) {
                myList.remove(p);
            }
        }
        return myList;
    }
}
