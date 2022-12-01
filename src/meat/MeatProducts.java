package meat;

import com.company.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class MeatProducts extends Product {

    public MeatProducts(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
}
