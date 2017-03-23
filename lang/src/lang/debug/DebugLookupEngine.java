package lang.debug;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.acceleo.query.runtime.ILookupEngine;
import org.eclipse.acceleo.query.runtime.IService;
import org.eclipse.acceleo.query.validation.type.IType;

public class DebugLookupEngine implements ILookupEngine{

	ILookupEngine wrapped;
	
	List<ILookupEngineListener> listeners;
	
	public DebugLookupEngine(ILookupEngine wrapped) {
		this.wrapped = wrapped;
		this.listeners = new ArrayList<ILookupEngineListener>();
	}
	
	public void registerListener(ILookupEngineListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(ILookupEngineListener listener) {
		listeners.remove(listener);
	}
	
	@Override
	public Set<IService> getRegisteredServices() {
		return wrapped.getRegisteredServices();
	}

	@Override
	public Set<IService> getServices(Set<IType> arg0) {
		return wrapped.getServices(arg0);
	}

	@Override
	public boolean isRegisteredService(IService arg0) {
		return wrapped.isRegisteredService(arg0);
	}

	@Override
	public IService lookup(String name, IType[] argumentTypes) {
		
		listeners.forEach(l -> l.preLookup(name,argumentTypes));
		
		IService service = wrapped.lookup(name, argumentTypes);
		
		listeners.forEach(l -> l.postLookup(service));
		
		return service;
	}

}