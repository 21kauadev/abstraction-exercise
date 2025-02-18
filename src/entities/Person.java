package entities;

public abstract class Person {

    protected String name;
    protected Double annualIncome;

    public Person() {
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract Double tax();

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", this.name, this.tax());
    }
}