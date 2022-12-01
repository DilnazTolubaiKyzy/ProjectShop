package dairy;

import com.company.Product;

import java.time.LocalDate;

public class Kefir extends DairyProducts {
    public Kefir(String companyName, int id, LocalDate date) {
        super(companyName, id, date);

    }

    @Override
    public String toString() {
        return "Kefirs{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
