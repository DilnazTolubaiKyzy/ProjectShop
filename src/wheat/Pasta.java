package wheat;

import com.company.Product;

import java.time.LocalDate;

public class Pasta extends WheatProducts {
    public Pasta(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Pastas{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
