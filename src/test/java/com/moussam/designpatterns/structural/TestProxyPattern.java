package com.moussam.designpatterns.structural;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.structural.proxy.AccessDeniedException;
import com.moussam.designpatterns.structural.proxy.ProxyInternet;
import com.moussam.designpatterns.structural.proxy.RealInternet;

class TestProxyPattern {

	private ProxyInternet underTest;
	
	@BeforeEach
	void setUp() {
		underTest = new ProxyInternet(new RealInternet());
		List<String> sites = Arrays.asList("abc.com", "def.com", "ijk.com", "lmn.com");
		underTest.addAllSites(sites); 
		
	}

	@Test
	void shouldThrowExceptionWhenSiteAccessIsDenied() {
		AccessDeniedException exception = assertThrows(AccessDeniedException.class, () -> underTest.connectTo("ijk.com"));
		
		assertEquals("Access Denied to ijk.com", exception.getMessage());
	}
	
	@Test
	void testConnectTo() throws AccessDeniedException {
		String site = "opq.com";
		underTest.connectTo(site);
		assertFalse(underTest.getSites().contains(site));
	}
	


}
