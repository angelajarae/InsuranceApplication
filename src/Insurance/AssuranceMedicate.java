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
    
    public AssuranceMedicate(int policy, String name, float commission, float premium, int age) {
        super(policy, name, commission);
        setPremium(premium);
        _age = age;
    }
    
    @Override
    public void calculatePremium() {
        if( _age >= 60 )
            setPremium( getPremium() * 3 );
        else
            if( _age >= 40)
            setPremium( getPremium() * 2 );
    }
    
    @Override
    public void calculateCoverage() {
        int premium = (int)getPremium();
        
        if( _age >= 60 )
            premium = (int)(premium / 3);
        else
            if( _age >= 40)
                premium = (int)(premium / 2);

        switch ( (int)premium ){
            case 20: setCoverage( 5000 );
            break;

            case 40: setCoverage( 10000 );
            break;

            case 60: setCoverage( 20000 );
            break;

            case 80: setCoverage( 40000 );
            break;

            case 100:setCoverage( 80000 );
            break;
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
    
}
