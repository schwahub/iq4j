package com.iq4j.faces.composites.components;

import javax.faces.component.FacesComponent;

import com.iq4j.faces.composites.GeneralKeys;


@FacesComponent(DateRangeInput.COMPONENT_TYPE)
public class DateRangeInput extends Input {
	
	public static final String COMPONENT_TYPE = "com.iq4j.faces.composites.components.DateRange";
	
		
	@Override
	protected void onEncodeBegin() {
		getMessageComponent().setFor(GeneralKeys.validatorComponent.toString());
	}
	
	
}
