package com.test.schedule.task;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.test.schedule.dto.UserDTO;

@Component
public class MessageListenerService {

	@JmsListener(destination = "fila.financeiro")
	public void onReceiverQueue(String jsonData) {
		
		UserDTO user = new Gson().fromJson(jsonData, UserDTO.class); 
		System.out.println(user);
	}

}
