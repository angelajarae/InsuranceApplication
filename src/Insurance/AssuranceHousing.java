/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author AULA F. DE ING. DE S
 */
public class AssuranceHousing extends Assurance{
    private String _location;
    private double _valueLand;
    private double _percentage;
    
    public AssuranceHousing(int policy, String name, double premium, String plan, String location, double valueLand, double percentage) {
        super(policy, name, premium, plan);
        _location = location;
        _valueLand = valueLand;
        _percentage = percentage;
    }
   
    
    @Override
    public void calculateCoverage() {
        setCoverage( getValueLand() * getPercentage() );
    }
    
    /**
     * @return the _location
     */
    public String getLocation() {
        return _location;
    }

    /**
     * @param _location the _location to set
     */
    public void setLocation(String _location) {
        this._location = _location;
    }

    /**
     * @return the _valueLand
     */
    public double getValueLand() {
        return _valueLand;
    }

    /**
     * @param _valueLand the _valueLand to set
     */
    public void setValueLand(double _valueLand) {
        this._valueLand = _valueLand;
    }

    /**
     * @return the _percentage
     */
    public double getPercentage() {
        return _percentage;
    }

    /**
     * @param _percentage the _percentage to set
     */
    public void setPercentage(float _percentage) {
        this._percentage = _percentage;
    }
}
    
