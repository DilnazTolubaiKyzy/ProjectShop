package meat;

import com.company.Product;

import java.time.LocalDate;

public class Meat extends MeatProducts {
    public Meat(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Meats{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
