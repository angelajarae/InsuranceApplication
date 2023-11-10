/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Insurance;

/**
 *
 * @author AULA F. DE ING. DE S
 */
public abstract class Assurance {
    private int _policy;
    private String _name;
    private double _premium;
    private String _plan;
    private double _coverage;
    
    public Assurance(int policy, String name, double premium, String plan) {
        _policy = policy;
        _name = name;
        _premium = premium;
        _plan = plan;
        _coverage = 0;
    }
    
    
    public abstract void calculateCoverage();

    /**
     * @return the _policy
     */
    public int getPolicy() {
        return _policy;
    }

    /**
     * @param _policy the _policy to set
     */
    public void setPolicy(int _policy) {
        this._policy = _policy;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _premium
     */
    public double getPremium() {
        return _premium;
    }

    /**
     * @param _premium the _premium to set
     */
    public void setPremium(float _premium) {
        this._premium = _premium;
    }

    /**
     * @return the _coverage
     */
    public double getCoverage() {
        return _coverage;
    }

    /**
     * @param _coverage the _coverage to set
     */
    public void setCoverage(double _coverage) {
        this._coverage = _coverage;
    }

    /**
     * @return the _plan
     */
    public String getPlan() {
        return _plan;
    }

    /**
     * @param _plan the _plan to set
     */
    public void setPlan(String _plan) {
        this._plan = _plan;
    }
}
