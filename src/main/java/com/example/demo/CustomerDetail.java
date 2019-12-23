package com.example.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://ws.shopdirect.com/xsd/AccountStatus",name = "CustomerDetail")
public class CustomerDetail 
{
private String accountNumber;
private String chordiantId;

@XmlElement(namespace="http://ws.shopdirect.com/xsd/AccountStatus",name = "AccountNumber")
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
@XmlElement(namespace="http://ws.shopdirect.com/xsd/AccountStatus",name = "ChordiantId")
public String getChordiantId() {
	return chordiantId;
}
public void setChordiantId(String chordiantId) {
	this.chordiantId = chordiantId;
}


}
