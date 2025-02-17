package entities;

public class LegalPerson extends Person {

    private Integer numberOfEmployees;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double tax() {
        // verifica, se for verdadeiro, já retorna o valor e a função para.
        if (numberOfEmployees > 10) {
            return this.annualIncome * 0.14;
        }

        // caso contrário executa normalmente.

        return this.annualIncome * 0.16;
    }
}