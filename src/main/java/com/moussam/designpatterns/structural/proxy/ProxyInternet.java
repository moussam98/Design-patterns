package com.moussam.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet target;
	private List<String> bannedSites;

	public ProxyInternet(Internet internet) {
		this.target = internet;
		bannedSites = new ArrayList<>();
	}

	@Override
	public void connectTo(String serverHost) throws AccessDeniedException {
		if (bannedSites.contains(serverHost)) {
			throw new AccessDeniedException("Access Denied to " + serverHost);
		}

		target.connectTo(serverHost);
	}

	public boolean addSite(String site) {
		return bannedSites.add(site);
	}
	
	public boolean addAllSites(List<String> sites) {
		return bannedSites.addAll(sites);
	}

	public List<String> getSites() {
		return bannedSites;
	}

	/**
	 * Removes the element at specified position in the list.
	 * 
	 * @param index the index of the element to be removed
	 * 
	 * @return <strong>true</strong> if the element was removed <br/>
	 *         <strong>false</strong> if index is out of range
	 * 
	 */
	public boolean removeSiteAt(int index) {
		if (index >= 0 || index < bannedSites.size()) {
			bannedSites.remove(index);
			return true;
		}

		return false;
	}

}
