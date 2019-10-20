package de.martcre.wf;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class OrderBusinessLogicService implements JavaDelegate {
	
	public void execute(DelegateExecution delegate) throws Exception {
		System.out.println("Spring Bean OrderBusinessLogicService invoked.");
	}
	
	public void persistOrder(String execution) {
		System.out.println("Persisting " + execution);
	}
	
	public void rejectOrder(String execution) {
		System.out.println("Rejecting " + execution);
	}

}