package ru.polybuh;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.13;
    }
}
