/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LAP11368-local
 */
public class Student {
    private String _stdID;
    private String _fullName;
    private String _gender;
    private String _IDCard;
    
    public Student(String stdID, String fullName, String gender, String IDCard){
        this._stdID = stdID;
        this._fullName = fullName;
        this._gender = gender;
        this._IDCard = IDCard;
    }
    
    public Student() {
        this._stdID = "";
        this._fullName = "";
        this._gender = "";
        this._IDCard = "";
    }
    
    public String getStdID() {
        return this._stdID;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Student readFromMetaData(List<String> metaData) {
        String stdID = metaData.get(0);
        String fullName = metaData.get(1);
        String gender = metaData.get(2);
        String IDCard = metaData.get(3);

        // create and return book of this metadata
        return new Student(stdID, fullName, gender, IDCard);
    }
    
    public List<Student> getAll(String fileName) {
        List<Student> result = new ArrayList<Student>();
        return result;
    }
}
