package com.company;

import dairy.DairyProducts;
import meat.MeatProducts;
import wheat.WheatProducts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Product {
    private String companyName;
    private int id;
    private LocalDate date;

    public Product(String companyName, int id, LocalDate date) {
        this.companyName = companyName;
        this.id = id;
        this.date = date;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public static void product(ArrayList<DairyProducts> dairyProducts, ArrayList<MeatProducts> meatProducts,
                               ArrayList<WheatProducts>wheatProducts){
        dairyProducts.stream().filter(s->s.getCompanyName().equals("Milk")).
                filter(a->a.getDate().isBefore(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Отказ");

        dairyProducts.stream().filter(s->s.getCompanyName().equals("Milk")).
                filter(a->a.getDate().isAfter(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Допускается");

        meatProducts.stream().filter(s->s.getCompanyName().equals("Toiboss")).
                filter(a->a.getDate().isBefore(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Отказ");
        meatProducts.stream().filter(s->s.getCompanyName().equals("Toiboss")).
                filter(a->a.getDate().isAfter(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Допускается");

        wheatProducts.stream().filter(s->s.getCompanyName().equals("Nur")).
                filter(a->a.getDate().isBefore(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Отказ");
        wheatProducts.stream().filter(s->s.getCompanyName().equals("Nur")).
                filter(a->a.getDate().isAfter(LocalDate.now().plusMonths(1))).
                forEach(System.out::println);
        System.out.println("Допускается");

    }
    public static void showcase(List<? extends Product> list){
        ArrayList<Product> productArrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate().isBefore(LocalDate.now().plusMonths(1))){
                productArrayList.remove(list.get(i));
            } else if (list.get(i).getCompanyName().equals("Milk") || list.get(i).getCompanyName()
                    .equals("Toiboss") || list.get(i).getCompanyName().equals("Nur") && list.get(i).
            getDate().isAfter(LocalDate.now().plusMonths(1))) {
                productArrayList.add(list.get(i));
            }
        }
        System.out.println("Витрина:"+productArrayList);

    }
    public static void discountShowcase(List<? extends Product> list){
        ArrayList<Product> discountShowcase = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getDate().isBefore(LocalDate.now().plusMonths(1))) {
                discountShowcase.remove(list.get(i));
            } else if (list.get(i).getDate().minusWeeks(1).
                    isAfter(LocalDate.now().plusMonths(1))) {
            discountShowcase.remove(list.get(i));
        }else if(list.get(i).getDate().minusWeeks(1).
                    isBefore(LocalDate.now().plusMonths(1))){
                discountShowcase.add(list.get(i));
                System.out.println("Витрина скидок:"+discountShowcase);

            }else {
                System.out.println("Это не входит в дисконтную витрину");
            }
        }
    }

    public static void manager(ArrayList<WheatProducts> wheatProducts,Manager manager,
                               ArrayList<MeatProducts> meatProducts,ArrayList<DairyProducts> dairyProducts){
        System.out.println("Введите свой логин и пароль:");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        if (login.equals(manager.getLogin()) && password.equals(manager.getPassword())){
            Product.product(dairyProducts,meatProducts,wheatProducts);
            Product.showcase(wheatProducts);
            Product.showcase(meatProducts);
            Product.showcase(dairyProducts);
            Product.discountShowcase(wheatProducts);
            Product.discountShowcase(meatProducts);
            Product.discountShowcase(dairyProducts);

        }else {
            System.out.println("Ваш логин и пароль не совпадает");
        }


    }

    @Override
    public String toString() {
        return "dairy.DairyProducts.Product{" +
                "companyName='" + companyName + '\'' +
                ", id=" + id +
                ", date=" + date +
                '}';
    }


}
