/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.BodyLocationENUM;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author lele
 */
public class BodyLocationFeatModel{
    List<BodyLocationENUM> bodyLocationENUM = new ArrayList<BodyLocationENUM>();

    public BodyLocationFeatModel(List<BodyLocationENUM> bodyLocationENUM) {
        this.bodyLocationENUM = bodyLocationENUM;
    }
    
    public BodyLocationFeatModel() {
    }

    /**
     * Get Body Location
     * @return 
     */
    public List<BodyLocationENUM> getBodyLocationENUM() {
        return bodyLocationENUM;
    }

    /**
     * Set Body Location
     * @param bodyLocationENUM 
     */
    public void setBodyLocationENUM(List<BodyLocationENUM> bodyLocationENUM) {
        this.bodyLocationENUM = bodyLocationENUM;
    }

    /**
     * add Body Location
     * @param bodyLocationENUM 
     */
    public void addBodyLocationENUM(BodyLocationENUM bodyLocationENUM) {
        this.bodyLocationENUM.add(bodyLocationENUM);
    }

}
