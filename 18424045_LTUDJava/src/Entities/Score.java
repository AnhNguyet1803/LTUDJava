/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.List;

/**
 *
 * @author LAP11368-local
 */
public class Score {
    private String _stdID;
    private String _name;
    private Float _middleExam;
    private Float _finalExam;
    private Float _plusExam;
    private Float _avgScore;
    
    public Score() {
        this._stdID = "";
        this._name = "";
        this._middleExam = (float) 0;
        this._finalExam = (float) 0;
        this._plusExam = (float) 0;
        this._avgScore = (float) 0;
    }
    
    public Score(String stdID, String name, Float middleExam, Float finalExam, Float plusExam, Float avgScore) {
        this._stdID = stdID;
        this._name = name;
        this._middleExam = middleExam;
        this._finalExam = finalExam;
        this._plusExam = plusExam;
        this._avgScore = avgScore;
    }
    
    public String getStdID() {
        return _stdID;
    }
    
    public void setStdID(String _stdID) {
        this._stdID = _stdID;
    }
    
    public String getName() {
        return _name;
    }
    
    public void setName(String _name) {
        this._name = _name;
    }
    
    public Float getMidleExam() {
        return _middleExam;
    }
    
    public void setMidleExam(Float _middleExam) {
        this._middleExam = _middleExam;
    }
    
    public Float getFinalExam() {
        return _finalExam;
    }
    
    public void setFinalExam(Float _finalExam) {
        this._finalExam = _finalExam;
    }
    
    public Float getPlusExam() {
        return _plusExam;
    }
    
    public void setPlusExam(Float _plusExam) {
        this._plusExam = _plusExam;
    }
    
    public Float getAvgScore() {
        return _avgScore;
    }
    
    public void setAvgScore(Float _avgScore) {
        this._avgScore = _avgScore;
    }
    
    public static Score readFromMetaData(List<String> metaData) {
        String stdID = metaData.get(0);
        String name = metaData.get(1);
        Float middleExam = Float.parseFloat(metaData.get(2));
        Float finalExam = Float.parseFloat(metaData.get(3));
        Float plusExam = Float.parseFloat(metaData.get(4));
        Float avgScore = Float.parseFloat(metaData.get(5));

        return new Score(stdID, name, middleExam, finalExam, plusExam, avgScore);
    }
}
