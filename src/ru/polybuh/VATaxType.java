package ru.polybuh;

public class VATaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
