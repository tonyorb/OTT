package ru.gorbunov;

public class Locale {
	private String limit;
	private String lang;
	private String locale;
	private String currency;
	public Locale (String lang, String locale, String currency){
		SetLimit("7");
		this.lang = lang;
		this.locale = locale;
		this.currency = currency;
	}
	public Locale (String lang, String locale, String currency, String limit){
		SetLimit(limit);
		this.lang = lang;
		this.locale = locale;
		this.currency = currency;
	}
	public String GetLang () {
		return lang;
	}
	public String GetLocale () {
		return locale;
	}
	public String GetCurrency () {
		return currency;
	}
	public String GetLimit () {
		return limit;
	}
	public void SetLimit (String limit) {
		this.limit = limit;
	}
}
