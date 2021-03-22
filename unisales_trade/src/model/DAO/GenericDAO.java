/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAO;

import java.util.List;
/**
 *
 * @author alanm
 */
public interface GenericDAO <T> {
    
    public void insert(T t);
    
    public void update(T t);
    
    public void delete(int id);
    
    public T getById(int id);
    
    public List<T> getAll();
}
