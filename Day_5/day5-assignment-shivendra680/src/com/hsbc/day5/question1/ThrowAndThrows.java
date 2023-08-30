package com.hsbc.day5.question1;

import java.io.IOException;

public class ThrowAndThrows {
	
	public static void main(String[] args) {
        try {
            Salary(15);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Salary(int salary) throws IOException {
        if (salary < 25000) {
            throw new IOException("Salary too low");
        }
    }

}
