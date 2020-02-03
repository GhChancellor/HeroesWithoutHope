/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.fatherClasses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class FatherClass001{
//    private List < T > lists = new ArrayList<T>();
    private String name;
    private String description;
    private int id;
    
    public FatherClass001() {
    }     
    
    /**
     * Get Name
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Set Name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Description
     * @return 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set Description
     * @param description 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get id
     * @return 
     */
    
    public int getId() {
        return id;
    }

    /**
     * Set id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
//    /**
//     * Get Lists
//     * @return List<T> 
//     */
//    public List<T> getLists() {
//        return lists;
//    }
//
//    /**
//     * Add Lists
//     * @param t 
//     */
//    public void addLists(T t) {
//        this.lists.add(t);
//    }

//    /**
//     * Get Lists
//     * @param value
//     * @return T
//     */
//    public T getList(int value) {
//        return lists.get(value);
//    }      
    
}
