package entities;

public class NaturalPerson extends Person {

    private Double healthExpenditures;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (this.annualIncome > 20000.00) {
            // só cai nesse segundo if se teve gastos com saúde
            if (this.healthExpenditures > 0.0) {
                return (this.annualIncome * 0.25) - (healthExpenditures * 0.5);
            }
            // por padrão, retorna isso.
            return this.annualIncome * 0.25;
        }

        return this.annualIncome * 0.15;
    }

}