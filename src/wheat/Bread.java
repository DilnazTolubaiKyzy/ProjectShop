package wheat;

import com.company.Product;

import java.time.LocalDate;

public class Bread extends WheatProducts {
    public Bread(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Breads{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
