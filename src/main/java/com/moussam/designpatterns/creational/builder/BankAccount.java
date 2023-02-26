package com.moussam.designpatterns.creational.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BankAccount {

	private String name;
	private String accountNumber;
	private String email;
	private boolean newsletter;

}
