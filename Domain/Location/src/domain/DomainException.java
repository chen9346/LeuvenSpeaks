/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

public class DomainException extends RuntimeException {
    
    public DomainException() {
        super();
    }
    
    public DomainException(String message) {
        super(message);
    }
    
    public DomainException(String message, Exception exc) {
        super(message, exc);
    }
    
}
