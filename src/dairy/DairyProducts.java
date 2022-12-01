package dairy;

import com.company.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class DairyProducts extends Product {

    public DairyProducts(String companyName, int id, LocalDate date) {
        super(companyName, id, date);

    }



}
