/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mhd.wahba.firstappgrafic;

import java.time.LocalDateTime;

/**
 *
 * @author mohammed
 */
class Message implements Comparable<Message>{
    
    private final LocalDateTime createdAt;
    private final String msgText;
    

    public Message(String msgText) {
        this.createdAt = LocalDateTime.now();
        this.msgText = msgText;
        
        
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getMsgText() {
        return msgText;
    }

    @Override
    public int compareTo(Message o) {
//        return createdAt.compareTo(o.createdAt);
          return this.msgText.hashCode()-o.msgText.hashCode();
       
            }

    @Override
    public String toString() {
        return createdAt + "   " + msgText ;
    }
    
    
    
    
    

   
    
}
