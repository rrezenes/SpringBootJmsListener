package com.test.schedule.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "user", "usando", "datahora" })
public class UserDTO {

	@JsonProperty("user")
	private String user;

	@JsonProperty("usando")
	private String usando;

	@JsonProperty("datahora")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	private Date datahora;

	@JsonProperty("user")
	public String getUser() {
		return user;
	}

	@JsonProperty("user")
	public void setUser(String user) {
		this.user = user;
	}

	@JsonProperty("usando")
	public String getUsando() {
		return usando;
	}

	@JsonProperty("usando")
	public void setUsando(String usando) {
		this.usando = usando;
	}

	@JsonProperty("datahora")
	public Date getDatahora() {
		return datahora;
	}

	@JsonProperty("datahora")
	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	@Override
	public String toString() {
		return "UserDTO [user = " + user + ", usando = " + usando + ", datahora = " + new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(datahora) + "]";
	}

}
