package ru.polybuh;

public class ProgressiveTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount < 100_000 ? amount * 0.1 : amount * 0.15;
    }
}
