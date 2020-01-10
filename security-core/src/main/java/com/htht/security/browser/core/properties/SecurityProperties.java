/**
 * 
 */
package com.htht.security.browser.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wqw
 *
 */
@ConfigurationProperties(prefix = "htht.security")
public class SecurityProperties {
	
	private BrowserProperties browser = new BrowserProperties();

	private ValidateCodeProperties code = new ValidateCodeProperties();

	public BrowserProperties getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserProperties browser) {
		this.browser = browser;
	}

	public ValidateCodeProperties getCode() {
		return code;
	}

	public void setCode(ValidateCodeProperties code) {
		this.code = code;
	}
}

