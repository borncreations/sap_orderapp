package com.sap.cloud.extensibility.services;

import org.slf4j.Logger;

import com.sap.cloud.extensibility.model.OneTimeCustomerOrder;
import com.sap.cloud.sdk.cloudplatform.logging.CloudLoggerFactory;
import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Instantiates a new one time customer record create fluent helper.
 *
 * @param entity the entity
 */
@RequiredArgsConstructor
public class OneTimeCustomerRecordCreateFluentHelper 
extends FluentHelperCreate<OneTimeCustomerRecordCreateFluentHelper, OneTimeCustomerOrder> {
	
	/** The Constant LOGGER. */
	private static final Logger LOGGER = CloudLoggerFactory.getLogger(OneTimeCustomerRecordCreateFluentHelper.class);
	
	/* 
	 * @see com.sap.cloud.sdk.s4hana.datamodel.odata.helper.FluentHelperCreate#getEntity()
	 */
	@Getter
	private final OneTimeCustomerOrder entity;
	
}
