package dairy;

import com.company.Product;

import java.time.LocalDate;

public class Yogurt extends DairyProducts {
    public Yogurt(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Yogurts{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
