/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlOperations;

/**
 *
 * @author lll
 */
public class UserSettings {
     
    public UserSettings(){}
     
    private Integer fieldOne;
    private String fieldTwo;
    private boolean fieldThree;
 
    public Integer getFieldOne() {
        return fieldOne;
    }
 
    public void setFieldOne(Integer fieldOne) {
        this.fieldOne = fieldOne;
    }
 
    public String getFieldTwo() {
        return fieldTwo;
    }
 
    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }
 
    public boolean isFieldThree() {
        return fieldThree;
    }
 
    public void setFieldThree(boolean fieldThree) {
        this.fieldThree = fieldThree;
    }
 
    @Override
    public String toString() {
        
        return "UserSettings [fieldOne=" + fieldOne + ", fieldTwo=" + fieldTwo
                + ", fieldThree=" + fieldThree + "]";
    }
}