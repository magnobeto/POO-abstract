
package entities;

/**
 *
 * @author Roberto
 */
public final class CompanyPayer extends TaxPayer {
    
    private Integer numEmp;
    
    public CompanyPayer(){
        super();
    }
    
    public CompanyPayer(String name,Double anualIncome,Integer numEmp){
        super(name,anualIncome);
        this.numEmp = numEmp;
    }
    
    public Integer getNumEmp(){
        return numEmp;
    }
    
    public void setNumEmp(Integer numEmp){
        this.numEmp = numEmp;
    }
    
    @Override
    public final Double taxesPaid(){
        Double sum;
        if (numEmp < 11){
            sum = super.getAnualIncome() * 0.16;
        }
        
        else{
            sum = super.getAnualIncome() *0.14;
        }
        
        return sum;
        
    }
    
}
