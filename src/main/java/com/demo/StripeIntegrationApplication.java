package com.demo;

import java.util.StringTokenizer;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.stripe.exception.StripeException;

@SpringBootApplication
public class StripeIntegrationApplication {

	public static void main(String[] args) throws StripeException {
		StringTokenizer st = new StringTokenizer("My name is vivek.");
		System.out.println(st.countTokens());

		System.out.println(st.toString());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
