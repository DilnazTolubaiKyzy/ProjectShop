package wheat;

import com.company.Product;

import java.time.LocalDate;

public class Flour extends WheatProducts {
    public Flour(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Flours{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
