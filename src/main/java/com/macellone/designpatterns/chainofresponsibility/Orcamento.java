package com.macellone.designpatterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private double valor;
	private final List<Item> items;

	public Orcamento(double valor) {
		this.valor = valor;
		items = new ArrayList<>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}

	public void adicionaItem(Item item) {
		items.add(item);
	}

}
