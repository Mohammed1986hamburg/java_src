
package mhd.wahba.firstappgrafic;

import java.util.*;

/**
 *
 * @author mohammed
 */
public class MessageManager {
    
    private final List<Message> messages = new ArrayList<>();
    
    public void saveMessage(Message m){
        
        messages.add(m);
    }
    
    public List<Message> getMessages() {
        
        Collections.sort(messages);
        return messages;
         
    }
}
