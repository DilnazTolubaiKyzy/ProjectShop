package meat;

import com.company.Product;

import java.time.LocalDate;

public class Fish extends MeatProducts {
    public Fish(String companyName, int id, LocalDate date) {
        super(companyName, id, date);
    }
    @Override
    public String toString() {
        return "Fishes{:"+"Company name: "+getCompanyName()+", Date: "+getDate()+", Id: "+getId()+"}";
    }
}
