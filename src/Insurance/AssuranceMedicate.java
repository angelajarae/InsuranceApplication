/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author AULA F. DE ING. DE S
 */
public class AssuranceMedicate extends Assurance {
    private int _age;
    private String _health;
    
    public AssuranceMedicate(int policy, String name, double premium, String plan, int age, String health) {
        super(policy, name, premium, plan);
        _age = age;
        _health=health;
    }
  
    @Override
    public void calculateCoverage() {
        if (_age>80){
            setCoverage(getPremium()*100);
        }
        else if(_age>60){
            setCoverage(getPremium()*200);
        }
        else if (_age>40){
            setCoverage(getPremium()*300);
        }
        else{
            setCoverage(getPremium()*400);
        }
        
        if(_health.equals("normal")){
            setCoverage(getCoverage()*2);
        }
        else{
            setCoverage(getCoverage()/2);
        }
    }
    
    /**
     * @return the _age
     */
    public int getAge() {
        return _age;
    }

    /**
     * @param _age the _age to set
     */
    public void setAge(int _age) {
        this._age = _age;
    }

    /**
     * @return the _health
     */
    public String getHealth() {
        return _health;
    }

    /**
     * @param _health the _health to set
     */
    public void setHealth(String _health) {
        this._health = _health;
    }
    
}
