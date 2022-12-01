package dairy;

import com.company.Product;

import java.time.LocalDate;

public class Milk extends DairyProducts {
    public Milk(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Milks{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
