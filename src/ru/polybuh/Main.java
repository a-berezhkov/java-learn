package ru.polybuh;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(100, new VATaxType(), new TaxService()),
                new Bill(100_001, new ProgressiveTaxType(), new TaxService())
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
