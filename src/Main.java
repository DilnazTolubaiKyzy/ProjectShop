import com.company.Manager;
import com.company.Product;
import dairy.DairyProducts;
import dairy.Kefir;
import dairy.Milk;
import dairy.Yogurt;
import meat.Fish;
import meat.Meat;
import meat.MeatProducts;
import meat.Sausage;
import wheat.Bread;
import wheat.Flour;
import wheat.Pasta;
import wheat.WheatProducts;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Kefir kefir1 = new Kefir("Milk", 1, LocalDate.of(2023, 1, 7));
        Kefir kefir2 = new Kefir("Milk", 1, LocalDate.of(2022, 2, 10));

        Milk milk1 = new Milk("Milk", 2, LocalDate.of(2023, 2, 13));
        Milk milk2 = new Milk("Milk", 2, LocalDate.of(2021, 3, 1));
        Milk milk3 = new Milk("Milk", 2, LocalDate.of(2020, 12, 29));
        Yogurt yogurt1 = new Yogurt("Milk", 3, LocalDate.of(2023, 2, 13));
        Yogurt yogurt2 = new Yogurt("Milk", 3, LocalDate.of(2022, 10, 3));
        Meat meat1 = new Meat("Toiboss", 4, LocalDate.of(2023, 11, 29));
        Meat meat2 = new Meat("Toiboss", 4, LocalDate.of(2019, 6, 9));
        Fish fish1 = new Fish("Toiboss", 5, LocalDate.of(2023, 1, 2));
        Fish fish2 = new Fish("Toiboss", 5, LocalDate.of(2022, 11, 24));
        Sausage sausage1 = new Sausage("Toiboss", 6, LocalDate.of(2023, 1, 21));
        Sausage sausage2 = new Sausage("Toiboss", 6, LocalDate.of(2020, 5, 1));
        Bread bread1 = new Bread("Nur", 6, LocalDate.of(2023, 1, 7));
        Bread bread2 = new Bread("Nur", 6, LocalDate.of(2022, 10, 2));
        Flour flour1 = new Flour("Nur", 1, LocalDate.of(2023, 12, 22));
        Flour flour2 = new Flour("Nur", 1, LocalDate.of(2021, 4, 25));
        Pasta pasta1 = new Pasta("Nur", 3, LocalDate.of(2023, 11, 30));
        Pasta pasta2 = new Pasta("Nur", 3, LocalDate.of(2020, 1, 31));

        ArrayList<DairyProducts> dairyProducts = new ArrayList<>();
        dairyProducts.add(kefir1);
        dairyProducts.add(kefir2);
        dairyProducts.add(milk1);
        dairyProducts.add(milk2);
        dairyProducts.add(yogurt1);
        dairyProducts.add(yogurt2);
        ArrayList<MeatProducts> meatProducts = new ArrayList<>();
        meatProducts.add(fish1);
        meatProducts.add(fish2);
        meatProducts.add(meat1);
        meatProducts.add(meat2);
        meatProducts.add(sausage1);
        meatProducts.add(sausage2);
        ArrayList<WheatProducts> wheatProducts = new ArrayList<>();
        wheatProducts.add(bread1);
        wheatProducts.add(bread2);
        wheatProducts.add(pasta1);
        wheatProducts.add(pasta2);
        wheatProducts.add(flour1);
        wheatProducts.add(flour2);

        Manager manager = new Manager("dilnaz", "6650707", 1);
        Product.manager(wheatProducts, manager, meatProducts, dairyProducts);


    }


}


