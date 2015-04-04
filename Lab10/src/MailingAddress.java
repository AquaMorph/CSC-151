
public class MailingAddress
{
	private String address;
	private String city;
	private String state;
	private String zipcode;

	/**
	 * 
	 * Constructs a new MailingAddress object given the street address (or PO Box),
	 * the city, state, and 5 digit zip code.
	 * 
	 * @param address
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public MailingAddress(String address, String city, String state, String zipcode)
	{
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	

	/**
	 * 
	 * This method returns the street address or PO Box for this mailing address. 
	 *
	 * @return a string representing the street address or PO Box
	 */
	public String getAddress()
	{
		return address;
	}

	
	/**
	 * 
	 * Sets the address of this mailing address to the address passed in. 
	 *
	 * @param addr the String representing the street address or PO Box
	 */
	public void setAddress(String addr)
	{
		this.address = addr;
	}

	
	/**
	 * 
	 * Returns the name of the city associated with this mailing address
	 *
	 * @return a String that is the city name
	 */
	public String getCity()
	{
		return city;
	}

	
	/**
	 * 
	 * Sets the city for this mailing address to the value passed in. 
	 *
	 * @param city
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	
	/**
	 * 
	 * Returns the state for this mailing address.
	 *
	 * @return a String representing the state for the mailing address.
	 */
	public String getState()
	{
		return state;
	}

	
	/**
	 * 
	 * Sets the state to the specified value for this mailing address. 
	 *
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	
	/**
	 * returns the 5 digit zipcode associated with this mailing address
	 *
	 * @return the 5 digit zipcode
	 */
	public String getZipcode()
	{
		return zipcode;
	}

	
	/**
	 * 
	 * Sets the 5 digit zipcode to the specified value.
	 *
	 * @param zipcode
	 */
	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode;
	}

}
