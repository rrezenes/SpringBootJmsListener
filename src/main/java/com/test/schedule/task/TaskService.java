package com.test.schedule.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TaskService {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Scheduled(fixedDelay = 3000)
	public void verificaPorHora() {

		jmsTemplate.convertAndSend("fila.financeiro",
				"{\"user\": \"admin\", \"usando\": \"springboot\", \"datahora\": \""
						+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + "\"}");
	}

}
