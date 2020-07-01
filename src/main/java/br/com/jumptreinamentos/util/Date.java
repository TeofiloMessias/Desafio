package br.com.jumptreinamentos.util;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Date {
	DateTimeFormatter varialvelData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public String getDataAtual() {

		return LocalDate.now().format(varialvelData);

	}

	public String getDataFutura() {

		return LocalDate.now().plusDays(30).format(varialvelData).toString();

	}
}
