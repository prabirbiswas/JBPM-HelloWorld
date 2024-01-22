package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ProcessMain {
	public static void main(String[] args) {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();

		// Create a KieSession
		KieSession kieSession = kieContainer.newKieSession();

		try {
			// Start the process
			kieSession.startProcess("helloworld");

			System.out.println("Process executed successfully!");

		} finally {
			// Dispose of the KieSession to release resources
			kieSession.dispose();
		}
	}
}
