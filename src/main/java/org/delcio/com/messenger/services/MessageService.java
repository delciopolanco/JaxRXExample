package org.delcio.com.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.delcio.com.messenger.database.DatabaseClass;
import org.delcio.com.messenger.model.Message;

public class MessageService {
	
	private static Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService( ) {
		messages.put(1L, new Message(1, "Hello World", "Delcio Polanco"));
		messages.put(2L, new Message(2, "Hello World", "Jayden Polanco"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(Long id) {
		return messages.get(id);	
	}
	
	public Message addMessage(Message message ) 
	{
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId() <= 0) {
			return null;
		}
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(Long id) {
		return messages.remove(id);
	}
}
