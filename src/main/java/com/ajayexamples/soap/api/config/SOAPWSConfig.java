package com.ajayexamples.soap.api.config;

import java.util.Properties;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.soap.SoapVersion;
import org.springframework.ws.soap.axiom.AxiomSoapMessage;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.soap.server.endpoint.interceptor.SoapEnvelopeLoggingInterceptor;
import org.springframework.ws.transport.WebServiceMessageReceiver;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import ch.qos.logback.core.Context;

@Configuration
@EnableWs
public class SOAPWSConfig {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Bean
	public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context)
	{
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		servlet.setMessageReceiverBeanName("SoapRequest");
		return new ServletRegistrationBean<MessageDispatcherServlet>(servlet,"/ws/loanServices/*");
	}
	
	@Bean(name = "loanEligibility")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema)
	{
		DefaultWsdl11Definition defaultWsdl11Definition=new DefaultWsdl11Definition();
		defaultWsdl11Definition.setPortTypeName("LoanEligibiltyPortType");
		defaultWsdl11Definition.setLocationUri("/ws/loanServices");
		defaultWsdl11Definition.setTargetNamespace("http://www.ajayexamples.com/soap/api/loanServices");
		defaultWsdl11Definition.setSchema(schema);
		defaultWsdl11Definition.setCreateSoap12Binding(true);	
		  Properties soapActions = new Properties();
		  soapActions.setProperty("getLoanEligibilityStatus","http://www.ajayexamples.com/soap/api/loanServices/getLoanEligibilityStatus");
		  defaultWsdl11Definition.setSoapActions(soapActions);
		 
		return defaultWsdl11Definition;
		
	}
	
	@Bean
	@RequestScope
	public SaajSoapMessageFactory messageFactory() {
	    SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
	    //WebServiceMessage requestMessage = (WebServiceMessage) applicationContext.getBean("SoapRequest");
	    //if(requestMessage.getPayloadResult().)
	    messageFactory.setSoapVersion(SoapVersion.SOAP_12);
	    //else
	    //messageFactory.setSoapVersion(SoapVersion.SOAP_11);	
	    return messageFactory;
	}
	
		
	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("schema/LoanServices.xsd"));
	}
	

}
