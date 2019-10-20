package de.martcre.wf;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.camunda.bpm.engine.rest.impl.CamundaRestResources;

public class MyApplication extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		
		classes.addAll(CamundaRestResources.getResourceClasses());
		classes.addAll(CamundaRestResources.getConfigurationClasses());
		
		return classes;
	}

}
