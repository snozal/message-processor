package msgProcessor;

import javax.annotation.Generated;

import org.bson.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "userId", "currencyFrom", "currencyTo", "amountSell", "amountBuy", "rate", "timePlaced",
		"originatingCountry" })
public class TradeMessage extends Document {

	private static final long serialVersionUID = 1892476753278137147L;

	// Names are shortened for better performance "name" --> "n"
	public static final String USER_ID = "u";
	public static final String CURRENCY_FROM = "cf";
	public static final String CURRENCY_TO = "ct";
	public static final String AMOUNT_SELL = "as";
	public static final String AMOUNT_BUY = "ab";
	public static final String RATE = "r";
	public static final String TIME_PLACED = "tp";
	public static final String COUNTRY = "c";

	@JsonProperty("userId")
	private String userId;
	@JsonProperty("currencyFrom")
	private String currencyFrom;
	@JsonProperty("currencyTo")
	private String currencyTo;
	@JsonProperty("amountSell")
	private Integer amountSell;
	@JsonProperty("amountBuy")
	private Double amountBuy;
	@JsonProperty("rate")
	private Double rate;
	@JsonProperty("timePlaced")
	private String timePlaced;
	@JsonProperty("originatingCountry")
	private String originatingCountry;

	/**
	 * 
	 * @return The userId
	 */
	@JsonProperty("userId")
	public String getUserId() {
		return getString(USER_ID);
	}

	/**
	 * 
	 * @param userId
	 *            The userId
	 */
	@JsonProperty("userId")
	public void setUserId(String userId) {
		put(USER_ID, userId);
	}

	/**
	 * 
	 * @return The currencyFrom
	 */
	@JsonProperty("currencyFrom")
	public String getCurrencyFrom() {
		return getString(CURRENCY_FROM);
	}

	/**
	 * 
	 * @param currencyFrom
	 *            The currencyFrom
	 */
	@JsonProperty("currencyFrom")
	public void setCurrencyFrom(String currencyFrom) {
		put(CURRENCY_FROM, currencyFrom);
	}

	/**
	 * 
	 * @return The currencyTo
	 */
	@JsonProperty("currencyTo")
	public String getCurrencyTo() {
		return getString(CURRENCY_TO);
	}

	/**
	 * 
	 * @param currencyTo
	 *            The currencyTo
	 */
	@JsonProperty("currencyTo")
	public void setCurrencyTo(String currencyTo) {
		put(CURRENCY_TO, currencyTo);
	}

	/**
	 * 
	 * @return The amountSell
	 */
	@JsonProperty("amountSell")
	public Integer getAmountSell() {
		return getInteger(AMOUNT_SELL);
	}

	/**
	 * 
	 * @param amountSell
	 *            The amountSell
	 */
	@JsonProperty("amountSell")
	public void setAmountSell(Integer amountSell) {
		put(AMOUNT_SELL, amountSell);
	}

	/**
	 * 
	 * @return The amountBuy
	 */
	@JsonProperty("amountBuy")
	public Double getAmountBuy() {
		return getDouble(AMOUNT_BUY);
	}

	/**
	 * 
	 * @param amountBuy
	 *            The amountBuy
	 */
	@JsonProperty("amountBuy")
	public void setAmountBuy(Double amountBuy) {
		put(AMOUNT_BUY, amountBuy);
	}

	/**
	 * 
	 * @return The rate
	 */
	@JsonProperty("rate")
	public Double getRate() {
		return getDouble(RATE);
	}

	/**
	 * 
	 * @param rate
	 *            The rate
	 */
	@JsonProperty("rate")
	public void setRate(Double rate) {
		put(RATE, rate);
	}

	/**
	 * 
	 * @return The timePlaced
	 */
	@JsonProperty("timePlaced")
	public String getTimePlaced() {
		return getString(TIME_PLACED);
	}

	/**
	 * 
	 * @param timePlaced
	 *            The timePlaced
	 */
	@JsonProperty("timePlaced")
	public void setTimePlaced(String timePlaced) {
		put(TIME_PLACED, timePlaced);
	}

	/**
	 * 
	 * @return The originatingCountry
	 */
	@JsonProperty("originatingCountry")
	public String getOriginatingCountry() {
		return getString(COUNTRY);
	}

	/**
	 * 
	 * @param originatingCountry
	 *            The originatingCountry
	 */
	@JsonProperty("originatingCountry")
	public void setOriginatingCountry(String originatingCountry) {
		put(COUNTRY, originatingCountry);
	}
}
