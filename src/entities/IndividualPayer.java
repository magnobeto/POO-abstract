
package entities;

/**
 *
 * @author Roberto
 */
public final class IndividualPayer extends TaxPayer {
    
    private Double healthExp;
    
    public IndividualPayer(){
        super();
    }
    
    public IndividualPayer(String name,Double anualIncome,Double healthExp){
        super(name,anualIncome);
        this.healthExp = healthExp;
    }
    
    public Double getHealthExp(){
        return healthExp;
    }
    
    public void setHealthExp(Double healthExp){
        this.healthExp = healthExp;
    }
    
    @Override
    public final Double taxesPaid(){
        Double sum;
        if (super.getAnualIncome() < 20000.00){
            sum = super.getAnualIncome() * 0.15;
            if (healthExp > 0){
                sum -= healthExp * 0.5;
            }
        }
        else{
            sum = super.getAnualIncome() * 0.25;
            if (healthExp > 0){
                sum -= healthExp * 0.5;  
            }
        }
        return sum;
    }
}
