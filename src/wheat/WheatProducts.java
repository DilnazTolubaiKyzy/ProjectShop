package wheat;

import com.company.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class WheatProducts extends Product {

    public WheatProducts(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
}
