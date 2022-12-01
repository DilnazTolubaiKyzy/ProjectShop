package meat;

import com.company.Product;

import java.time.LocalDate;

public class Sausage extends MeatProducts {
    public Sausage(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Sausages{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
