package Automation.VatEngine;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AnalysisPageBahrain1 {
	

WebDriver driver;
 
 
public AnalysisPageBahrain1(WebDriver ldriver)
{
this.driver=ldriver;
}
 
 
//@FindBy(how=How.CSS, using ="input[name*='SupplierEntitySelector_NameAutoComplete'][type='text'][id*='SupplierEntitySelector']") 
@FindBy(how=How.CSS, using ="div[id*='SupplierEntitySelector_NamePanel'] i[class*='search'][title*='Entities'][onclick*='AllItemsForm']")
@CacheLookup
WebElement supplierSearchIcon; 

@FindBy(how=How.CSS, using ="div[id*='ctl00_ContentPlaceHolder1_CustomerEntitySelector_NamePanel'] i[class*='search'][title*='Entities'][onclick*='AllItemsForm']")
@CacheLookup
WebElement customerSearchIcon; 

@FindBy(how=How.CSS,using="input[name*='CustomerEntitySelector_NameAutoCompleteEdit'][type='text'][id*='CustomerEntitySelector']")
@CacheLookup
WebElement customer;

@FindBy(how=How.CSS,using="select[name*='CustomerEntitySelector'][id*='VatNumber']")
@CacheLookup
WebElement customerVatNumber;

@FindBy(how=How.CSS,using="input[name*='SuggestItemNames'][type='text'][id*='SuggestItemNames']")
@CacheLookup
WebElement item;

@FindBy(how=How.CSS,using="input[name*='price'][type='text'][id*='price']")
@CacheLookup
WebElement amount;

@FindBy(how=How.CSS,using="select[title*='Where do the goods depart from'][class='LargeSizeControl']")
@CacheLookup
WebElement placeOfDepartureGoods;

@FindBy(how=How.CSS,using="select[title*='place of departure'][class='LargeSizeControl']")
@CacheLookup
WebElement placeOfDeparture;

@FindBy(how=How.CSS,using="select[title*='In which country are they installed'][class='LargeSizeControl']")
@CacheLookup
WebElement installationCountrySelect;


@FindBy(how=How.CSS,using="select[title*='exempted transportation'][class='LargeSizeControl']")
@CacheLookup
WebElement isExemptedTransportation;


@FindBy(how=How.CSS,using="select[title*='transport wholly or partly'][class='LargeSizeControl']")
@CacheLookup
WebElement PartialWholTransportSelect;

@FindBy(how=How.CSS,using="select[title*='Where is the effective use and enjoyment?'][class='LargeSizeControl']")
@CacheLookup
WebElement PlaceOfServiceSelect;

@FindBy(how=How.CSS,using="select[title*='transport'][class='LargeSizeControl']")
@CacheLookup
WebElement transportSelect;

@FindBy(how=How.CSS,using="select[title*='Who carries out the transport?'][class='LargeSizeControl']")
@CacheLookup
WebElement transportCarrier;

@FindBy(how=How.CSS,using="select[title*='Will the supplier pay the VAT directly in Belgium']")
@CacheLookup
WebElement supplierPayVATDirectlyYesNoSelect;

@FindBy(how=How.CSS,using="select[title*='Are the goods installed'][class='LargeSizeControl']")
@CacheLookup
WebElement installationSelect;

@FindBy(how=How.CSS,using="select[title*='Where is the immovable property situated'][class='LargeSizeControl']")
@CacheLookup
WebElement immovablePropertyLocationSelect;

@FindBy(how=How.CSS,using="select[title*='goods located'][class='LargeSizeControl']")
@CacheLookup
WebElement goodsLocated;

@FindBy(how=How.CSS,using="select[title*='Are the goods a vehicle'][class='LargeSizeControl']")
@CacheLookup
WebElement isVehicleSelect;

@FindBy(how=How.CSS,using="select[title*='permanent establishment'][class='LargeSizeControl']")
@CacheLookup
WebElement SuplPermanentEstablishmentCountrySelect;

@FindBy(how=How.CSS,using="select[title*='arrival'][class='LargeSizeControl'] ")
@CacheLookup
WebElement placeOfArrival;

@FindBy(how=How.CSS,using="select[title*='Who is the importer?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement importerSelect;

@FindBy(how=How.CSS,using="select[title*='In which country is the vehicle made available'][class='LargeSizeControl'] ")
@CacheLookup
WebElement PlacewheremadeavailableSelect;

@FindBy(how=How.CSS,using="select[title*='What type of vehicle is it?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement TypeofvehicleSelect;

@FindBy(how=How.CSS,using="select[title*='Where does the transport depart from?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement departureSelect;//FOR PERSONS

@FindBy(how=How.CSS,using="select[title*='What is the place of departure?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement placedepartureSelect;//FOR GOODS

@FindBy(how=How.CSS,using="select[title*='What is the place of arrival?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement placeArrivalSelect;//FOR GOODS

@FindBy(how=How.CSS,using="select[title*='Where does the transport arrive?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement arrivalSelect;//FOR PERSONS

@FindBy(how=How.CSS,using="select[title*='Was the transport wholly or partly carried out in one of the following countries?'][class='LargeSizeControl'] ")
@CacheLookup
WebElement specialCountrySelect;

@FindBy(how=How.CSS,using="select[title*='To which country are they imported'][class='LargeSizeControl'] ")
@CacheLookup
WebElement importerCountrySelect;


@FindBy(how=How.CSS,using="select[title*='distance sales or is the treshold'] ")
@CacheLookup
WebElement thresholdOrDistanceSaleSelect;

@FindBy(how=How.CSS,using="select[title*='supply'][class='LargeSizeControl'] ")
@CacheLookup
WebElement supply;

@FindBy(how=How.CSS,using="select[title*='Is there a triangular transaction']")
@CacheLookup
WebElement triangulationSelect;


@FindBy(how=How.CSS,using="select[title*='charity']")
@CacheLookup
WebElement charitySelect;

@FindBy(how=How.CSS,using="select[title*='In which country does the customer use his VAT number'][class='LargeSizeControl']")
@CacheLookup
WebElement UsedVAT_Customer;
 

@FindBy(how=How.CSS,using="select[title*='What type of tangible goods are they'][class='LargeSizeControl'] ")
@CacheLookup
WebElement typeOfTangiblePropertySelect;

@FindBy(how=How.CSS,using="select[title*='What type of tangible goods are they'][class='LargeSizeControl'] ")
@CacheLookup
WebElement Tangible_PropertySelect;

@FindBy(how=How.CSS,using="i[class*='search'][onclick*='AllItemsForm'][title*='Show all']")
@CacheLookup
WebElement All_Item_page;


@FindBy(how=How.CSS,using="select[title*='kilometres'][class='LargeSizeControl']")
@CacheLookup
WebElement KM;

@FindBy(how=How.CSS,using="select[name*='VatPercentageDDL'][id*='VatPercentageDDL']")
@CacheLookup
WebElement VatPercentage;



@FindBy(how=How.CSS,using="#InvoiceLinesTable")
@CacheLookup
WebElement all_InvoiceRow;

@FindBy(how=How.CSS,using="#MentioningsSummaryTD")
@CacheLookup
WebElement MentioningsDetails;

@FindBy(how=How.CSS,using="#WarningsOverview")
@CacheLookup
WebElement WarningsOverview;

@FindBy(how=How.CSS,using="#vat-expert-invoice__vat-codes--sales")
@CacheLookup
WebElement InvoiceLinesDetails;

@FindBy(how=How.CSS,using="#vat-expert-invoice__vat-codes--purchasing")
@CacheLookup
WebElement PurchaseInvoiceLinesDetails;

@FindBy(how=How.CSS,using="td.InvoiceLineFooterAmountCell:nth-of-type(2)")
@CacheLookup
WebElement taxAmount;

@FindBy(how=How.CSS,using="select[title*='Where is the service rendered'][class='LargeSizeControl']")
@CacheLookup
WebElement PlaceOfService;


public void selectGoodServices(String itemName) throws InterruptedException {
	All_Item_page.click();
	Thread.sleep(5000);
	driver.findElement(By.linkText(itemName)).click();
	Thread.sleep(5000);	
}

private void setAmount(String amountValue) {
	amount.click();
	amount.sendKeys(Keys.ARROW_RIGHT);
	amount.sendKeys(Keys.ARROW_RIGHT);
	amount.sendKeys(Keys.BACK_SPACE);
	amount.sendKeys(Keys.BACK_SPACE);
	amount.sendKeys(Keys.BACK_SPACE);
	amount.sendKeys(amountValue+Keys.TAB);
}

//18 scenarios for VEN-230_Bahrain: Supply of Cultural, Artistic, Sports and Recreational Services
public boolean TestGCC1_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC2_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
//
public boolean TestGCC3_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC4_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC5_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC6_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC7_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceGCC("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC8_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean TestGCC9_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceGCC("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean TestGCC10_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC11_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean TestGCC12_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceGCC("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC13_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC15_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC16_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean TestGCC17_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean TestGCC18_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectPlaceOfServiceGCC("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

// 2 Scenarios(19-20) for VEN-222_Add Bahrain (BH) VAT rates

public boolean BH_19_VatRates() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("BHCOMPANY1");
	selectCustomer("BECOMPANY NV");
	selectItem("Movable tangible property / No installation");
	selectWhoCarriesTransport("The buyer or for his account");
	selectPlaceOfDeparture("Bahrain");
	selectPlaceOfArrival("Belgium");
	selectWhoIsImporter("The buyer");
	selectCustomewerVatCountry("Belgium");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_20_VatRates() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("Movable tangible property / No installation");
	selectWhoCarriesTransport("There is no transport");
	//selectPlaceOfServiceGCC("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	//selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

// VEN-231 scenarios

public boolean BH_21_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_22_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_23_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_24_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_25_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_26_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_27_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_28_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_29_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Renting Vehicle");
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	selectPlaceOfServiceCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_30_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Renting Vehicle");
	selectWhattypeofvehicleisit("Ships, short lease"); //err in identifying tis
	selectInwhichCountryVehiclemadeAvailable("Bahrain");
	selectPlaceOfServiceCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_31_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("Renting Vehicle");
//	selectWhattypeofvehicleisit("Ships, short lease"); //err in identifying tis
//	selectInwhichCountryVehiclemadeAvailable("Bahrain");
//	selectPlaceOfServiceCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_32_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Renting Vehicle");
//	selectWhattypeofvehicleisit("Ships, short lease"); //err in identifying tis
//	selectInwhichCountryVehiclemadeAvailable("Bahrain");
//	selectPlaceOfServiceCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_33_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Renting Vehicle");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH_34_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Renting Vehicle");
	selectPlaceOfServiceCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH_35_RentingVehicle() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Renting Vehicle");
	selectPlaceOfServiceCountry("Spain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//197

public boolean BH1_SaleOfServices_telecommunication_services() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_SaleOfServices_telecommunication_services() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_SaleOfServices_telecommunication_services() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_SaleOfServices_telecommunication_services() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
//198

public boolean BH1_SaleOfServices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("consultancy services, supplying of information (-215-)");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH2_SaleOfServices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("consultancy services, supplying of information (-215-)");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_SaleOfServices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("consultancy services, supplying of information (-215-)");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_SaleOfServices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("consultancy services, supplying of information (-215-)");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//199-TransportOfPassengers

public boolean BH1_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_TransportOfPassengers() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("transport of persons (land)");
	selectdepartureSelect("Bahrain");
	selectarrivalSelect("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//199-TransportOfGoods

public boolean BH1_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_TransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//243-Test scenarios for local supply of goods with installation by non-residents

public boolean BH1_SupplyGoodsWithInstallation() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("supply with installation or assembly");
	selectDepartureCountry("Spain");
	selectinstallationCountry("Bahrain");
	selectWhoIsImporter("The buyer");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//183-Bahrain - export of goods

public boolean BH1_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH9_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH10_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH11_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH12_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH13_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH14_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH15_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH16_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH17_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH18_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH19_exportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("Movable tangible property / No installation");
	selecttransportCarrier("The seller or for his account");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
//245-Bahrain: TBE services

public boolean BH1_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public boolean BH2_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH9_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH10_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH11_TBEservices() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("telecommunication services");
	selectPlaceOfServiceCountry("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//VEN-262- Bahrain: VAT treatment for services related to transport of goods and passengers 

public boolean BH1_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("Bahrain");
//	selectSpecialCountry("None of the following");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlacedepartureSelect("Bahrain");
//	selectPlaceArrivalSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("Bahrain");
//	selectSpecialCountry("None of the following");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
//	selectPlaceArrivalSelect("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("services relating to transport of goods");
//	selectSpecialCountry("None of the following");
//	selectPlaceOfServiceCountry("India");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("services relating to transport of goods");
	selectPlacedepartureSelect("Bahrain");
	selectPlaceArrivalSelect("India");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_servicesRelatedToTransportOfGoods() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("services relating to transport of goods");
//	selectSpecialCountry("None of the following");
//	selectPlaceOfServiceCountry("India");
	selectPlacedepartureSelect("Bahrain");
	//selectCustomewerVatCountry("none");
	selectPlaceArrivalSelect("India");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//286
public boolean BH1_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("supply of staff");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH2_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("supply of staff");
	selectPlaceOfServiceCountry("India");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH3_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectItem("supply of staff");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH4_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("supply of staff");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH5_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED B");
	selectItem("supply of staff");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH6_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED ECONOMIC ACTIVITY");
	selectItem("supply of staff");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH7_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
	selectItem("supply of staff");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH8_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
	selectItem("supply of staff");
	//selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH9_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("supply of staff");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean BH10_questionOfUandE() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectCustomer("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectItem("supply of staff");
	selectCustomewerVatCountry("none");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("0.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

public String getTaxAmount(){
	return  driver.findElements(By.className("InvoiceLineFooterAmountCell")).get(1).getText();
	//return taxAmount.getText();
}

public void selectInwhichCountryGoodsImported(String impoprtedCountry) throws InterruptedException {
	Select importerCountry = new Select(importerCountrySelect);
	importerCountry.selectByVisibleText(impoprtedCountry);	
	Thread.sleep(2000);
}

public void selectWhoIsImporter(String whoIsImporter) throws InterruptedException {
	Select importer = new Select(importerSelect);
	importer.selectByVisibleText(whoIsImporter);	
	Thread.sleep(2000);
}
public void selectdepartureSelect(String departureSelectCountry) throws InterruptedException {
	Select whereDoesTheTransportDepartFrom = new Select(departureSelect);
	whereDoesTheTransportDepartFrom.selectByVisibleText(departureSelectCountry);	
	Thread.sleep(2000);
}
public void selectPlacedepartureSelect(String placedepartureSelectCountry) throws InterruptedException {
	Select whatIsThePlaceOfDeparture = new Select(placedepartureSelect);
	whatIsThePlaceOfDeparture.selectByVisibleText(placedepartureSelectCountry);	
	Thread.sleep(2000);
}
public void selectPlaceArrivalSelect(String placearrivalSelectCountry) throws InterruptedException {
	Select whatIsThePlaceOfArrival = new Select(placeArrivalSelect);
	whatIsThePlaceOfArrival.selectByVisibleText(placearrivalSelectCountry);	
	Thread.sleep(2000);
}

public void selectarrivalSelect(String arrivalSelectCountry) throws InterruptedException {
	Select whereDoesTheTransportArrive = new Select(arrivalSelect);
	whereDoesTheTransportArrive.selectByVisibleText(arrivalSelectCountry);	
	Thread.sleep(2000);
}

//public void selectWhoIsImporter(String whoIsImporter) throws InterruptedException {
//	Select importer = new Select(importerSelect);
//	importer.selectByVisibleText(whoIsImporter);	
//	Thread.sleep(2000);
//}

public void selectInwhichCountryVehiclemadeAvailable(String InwhichCountryVehiclemadeAvailable) throws InterruptedException {
  Select Placewheremadeavailable = new Select(PlacewheremadeavailableSelect);
  Placewheremadeavailable.selectByVisibleText(InwhichCountryVehiclemadeAvailable);	
  Thread.sleep(2000);
}

public void selectWhattypeofvehicleisit(String Whattypeofvehicleisit) throws InterruptedException {
	  Select Typeofvehicle = new Select(TypeofvehicleSelect);
	  Typeofvehicle.selectByVisibleText(Whattypeofvehicleisit);	
	  Thread.sleep(2000);
	}

public  void selectTypeOfTangibleProperty(String TypeOfTangibleProperty) throws InterruptedException {
	Select type_Tangible_Property = new Select(typeOfTangiblePropertySelect);
	type_Tangible_Property.selectByVisibleText(TypeOfTangibleProperty);	
	Thread.sleep(2000);
}
public String  getVatPercent() {

	return new Select(VatPercentage).getFirstSelectedOption().getText();	
}

public  void selectIfThresholdOrDistanceSale(String option) throws InterruptedException {
	Select thresholdOrDistanceSale = new Select(thresholdOrDistanceSaleSelect);
	thresholdOrDistanceSale.selectByVisibleText(option);
	Thread.sleep(2000);
}
public void startNewAnalysis() throws InterruptedException {
	driver.navigate().refresh();
	Thread.sleep(5000);
	WebElement role = driver.findElement(By.partialLinkText("Analysis"));
	 Actions action = new Actions(driver);
	 action.moveToElement(role).build().perform(); 
	 Thread.sleep(1500);
	 driver.findElement(By.partialLinkText("New analysis")).click();
	 Thread.sleep(1500);
	
}
public void selectImmovablePropertyLocation(String immovablePropertyLocationCountry) throws InterruptedException {
	Select immovablePropertyLocation = new Select(immovablePropertyLocationSelect);
	immovablePropertyLocation.selectByVisibleText(immovablePropertyLocationCountry);
	
	Thread.sleep(5000);
	
}
public  void selectIsExemptedtransT1(String isExemptedtransactionT1) throws InterruptedException {
	Select isExemptedtransT1 = new Select(isExemptedTransportation);
	isExemptedtransT1.selectByVisibleText(isExemptedtransactionT1);
	Thread.sleep(5000);
	
}
public  void selectMonthEndTransactionDate() throws InterruptedException {
	 getLastDayOfTheMonth();
	driver.findElement(By.cssSelector(".-date")).click();
	List<WebElement> alldatealinks = driver.findElements(By.cssSelector("table[id*='InvoiceDateCalendar'] a"));
	for(WebElement temp:alldatealinks)
	{
		if(temp.getAttribute("title").equalsIgnoreCase(lastDayOfTheMonth))
		{
			temp.click();Thread.sleep(2000);
			break;
			
		}
	}
}

public void nextMonth() throws InterruptedException {
	driver.findElement(By.cssSelector(".-date")).click();
	List<WebElement> alldatealinks = driver.findElements(By.cssSelector("table[id*='InvoiceDateCalendar'] a"));
	for(WebElement temp:alldatealinks)
	{
		if(temp.getAttribute("title").equalsIgnoreCase("Go to the next month"))
		{
			temp.click();Thread.sleep(2000);
			break;
			
		}
	}
}

public void Jan2019() throws InterruptedException {
	//driver.findElement(By.cssSelector(".-date")).click();
	List<WebElement> alldatealinks = driver.findElements(By.cssSelector("table[id*='InvoiceDateCalendar'] a"));
	for(WebElement temp:alldatealinks)
	{
		if(temp.getAttribute("title").equalsIgnoreCase("1 January"))
		{
			temp.click();Thread.sleep(2000);
			break;
			
		}
	}
}
public  void selectNextMonthTransactionDate() throws InterruptedException {
	 getLastDayOfTheMonth();
	driver.findElement(By.cssSelector(".-date")).click();
	List<WebElement> alldatealinks = driver.findElements(By.cssSelector("table[id*='InvoiceDateCalendar'] a"));
	for(WebElement temp:alldatealinks)
	{
		if(temp.getAttribute("title").equalsIgnoreCase(firstDayofNextMonth))
		{
			temp.click();Thread.sleep(2000);
			break;
			
		}
	}
}
private void waitForMentioningOrInvoiceLine() throws InterruptedException {
	jumpToElementThroughTabs(1);
	Thread.sleep(3000);
	jumpToElementThroughTabs(3);	
	Thread.sleep(3000);
}

public  void selectPlaceOfArrival(String ArrivalCountry) throws InterruptedException {
	Select arrival = new Select(placeOfArrival);
	arrival.selectByVisibleText(ArrivalCountry);	
	Thread.sleep(2000);
	
}
public  void selecttransportCarrier(String transportCarriedBy) throws InterruptedException {
	Select whoCarriesTransport = new Select(transportCarrier);
	whoCarriesTransport.selectByVisibleText(transportCarriedBy);	
	Thread.sleep(2000);
	
}
public  void selectSupplierPayDirectVat(String YesOrNo) throws InterruptedException {
	Select willSupplierPayVATDirectly = new Select(supplierPayVATDirectlyYesNoSelect);
	willSupplierPayVATDirectly.selectByVisibleText(YesOrNo);	
	Thread.sleep(2000);
	
}
public void selectPlaceOfDeparture(String departFrom) throws InterruptedException {
	Select departure = new Select(placeOfDeparture);
	departure.selectByVisibleText(departFrom);
	Thread.sleep(5000);
	
}

public void selectWhoCarriesTransport(String whoDoTransport) throws InterruptedException {
	Select transport = new Select(transportSelect);
	transport.selectByVisibleText(whoDoTransport);
	Thread.sleep(5000);
	
}

public void selectItem(String item) throws InterruptedException {
	Thread.sleep(2000);
	All_Item_page.click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText(item)).click();
	Thread.sleep(3000);	

}

public void selectInvoiceType(String invoiceType) throws InterruptedException {
	WebElement role = driver.findElement(By.cssSelector("tr[id*='menInvoiceType']"));
	 Actions action = new Actions(driver);
	 action.moveToElement(role).build().perform(); 
	 Thread.sleep(1500);
	 driver.findElement(By.partialLinkText(invoiceType)).click();
	 Thread.sleep(1500);
	
}

public void selectCustomerVatNumber(String vatnumber) throws InterruptedException {
	Select custVatNumber = new Select(customerVatNumber);
	custVatNumber.selectByVisibleText(vatnumber);
	Thread.sleep(2000);

}

public void selectCustomer(String customer) throws InterruptedException {
	customerSearchIcon.click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText(customer)).click();
	Thread.sleep(2000);
	
}

public void selectCustomerText(String customer) throws InterruptedException {
	driver.findElement(By.cssSelector("input[name*='CustomerEntitySelector'][type='text'][id*='NameAutoCompleteEdit']"))
	.sendKeys(customer+Keys.TAB);
	
	List<WebElement> items= driver.findElements(By.cssSelector("div[id*='ContentPlacCustomerEntitySelector_NameAutoCompleteSuggestionsDiv'] td"));
	for(WebElement temp:items)
	{
		if(temp.getText().equalsIgnoreCase(customer))
		{
			temp.click();
			Thread.sleep(2000);
			break;
		}
	}
}

public void selectSupplier(String supplier) throws InterruptedException {
	supplierSearchIcon.click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText(supplier)).click();
	Thread.sleep(2000);

}

public  void selectPlaceOfServiceCountry(String PlaceOfService)  throws InterruptedException {
	Select PlaceOfServiceCountry = new Select(PlaceOfServiceSelect);
	PlaceOfServiceCountry.selectByVisibleText(PlaceOfService);
	Thread.sleep(4000);
}


public  void selectPlaceOfServiceGCC(String PlaceOfService1)  throws InterruptedException {
	Select PlaceOfServiceCountry1 = new Select(PlaceOfService);
	PlaceOfServiceCountry1.selectByVisibleText(PlaceOfService1);
	Thread.sleep(4000);
}

public void selectPartialWholTransportCountry(String PartialWholTransport) throws InterruptedException {
	Select iswholPartialTrans = new Select(PartialWholTransportSelect);
	iswholPartialTrans.selectByVisibleText(PartialWholTransport);
	Thread.sleep(4000);
}

private void fillTextOtherDetails(String rowText, String value) throws InterruptedException {
	List<WebElement> check= all_InvoiceRow.findElements(By.tagName("tr"));
	for(WebElement temp:check)
	{
		if(temp.getText().contains(rowText))
		{
			temp.findElement(By.tagName("input")).sendKeys(value+Keys.TAB);
			Thread.sleep(2000);
			break;
		}
	}
}

public void jumpToElementThroughTabs(int i) throws InterruptedException {
	int count = 1;
	while (count <= i) {
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		count++;
	}
}


public static String lastDayOfTheMonth = "";
public static String firstDayofNextMonth="";
public void  get2019() {
	Date date = Calendar.getInstance().getTime();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String today = formatter.format(date);
       
	
    SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
    try{
    java.util.Date dt= formater.parse(today);
    Calendar calendar = Calendar.getInstance();  
    calendar.setTime(dt);  

    calendar.add(Calendar.MONTH, 1);  
    calendar.set(Calendar.DAY_OF_MONTH, 1);  
    calendar.add(Calendar.DATE, -1);  

    java.util.Date lastDay = calendar.getTime();  

    lastDayOfTheMonth = formatter.format(lastDay);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    
    String month= lastDayOfTheMonth.substring(6, 10);
   if(month.equalsIgnoreCase("01")) 
	   {lastDayOfTheMonth= "31 January";firstDayofNextMonth= "1 February";}
   if(month.equalsIgnoreCase("02")) 
	   {lastDayOfTheMonth= "28 February";firstDayofNextMonth= "1 March";}
	if(month.equalsIgnoreCase("03")) 
	   {lastDayOfTheMonth= "31 March";firstDayofNextMonth= "1 April";}
    if(month.equalsIgnoreCase("04")) 
	   {lastDayOfTheMonth= "30 April";firstDayofNextMonth= "1 May";}
	if(month.equalsIgnoreCase("05")) 
	   {lastDayOfTheMonth= "31 May";firstDayofNextMonth= "1 June";}
	if(month.equalsIgnoreCase("06")) 
	   {lastDayOfTheMonth= "30 June";firstDayofNextMonth= "1 July";}
	if(month.equalsIgnoreCase("07")) 
	   {lastDayOfTheMonth= "31 July";firstDayofNextMonth= "1 August";}
	if(month.equalsIgnoreCase("08")) 
	   {lastDayOfTheMonth= "31 August";firstDayofNextMonth= "1 September";}
	if(month.equalsIgnoreCase("09")) 
	   {lastDayOfTheMonth= "30 September";firstDayofNextMonth= "1 October";}
	if(month.equalsIgnoreCase("10")) 
	   {lastDayOfTheMonth= "31 October";firstDayofNextMonth= "1 November";}
	if(month.equalsIgnoreCase("11")) 
	   {lastDayOfTheMonth= "30 November";firstDayofNextMonth= "1 December";}
	if(month.equalsIgnoreCase("12")) 
	   {lastDayOfTheMonth= "31 December";firstDayofNextMonth= "1 January";}
																		    		    
    //return lastDayOfTheMonth;
}

public void  getLastDayOfTheMonth() {
	Date date = Calendar.getInstance().getTime();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String today = formatter.format(date);
       
	
    SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
    try{
    java.util.Date dt= formater.parse(today);
    Calendar calendar = Calendar.getInstance();  
    calendar.setTime(dt);  

    calendar.add(Calendar.MONTH, 1);  
    calendar.set(Calendar.DAY_OF_MONTH, 1);  
    calendar.add(Calendar.DATE, -1);  

    java.util.Date lastDay = calendar.getTime();  

    lastDayOfTheMonth = formatter.format(lastDay);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    
    String month= lastDayOfTheMonth.substring(3, 5);
   if(month.equalsIgnoreCase("01")) 
	   {lastDayOfTheMonth= "31 January";firstDayofNextMonth= "1 February";}
   if(month.equalsIgnoreCase("02")) 
	   {lastDayOfTheMonth= "28 February";firstDayofNextMonth= "1 March";}
	if(month.equalsIgnoreCase("03")) 
	   {lastDayOfTheMonth= "31 March";firstDayofNextMonth= "1 April";}
    if(month.equalsIgnoreCase("04")) 
	   {lastDayOfTheMonth= "30 April";firstDayofNextMonth= "1 May";}
	if(month.equalsIgnoreCase("05")) 
	   {lastDayOfTheMonth= "31 May";firstDayofNextMonth= "1 June";}
	if(month.equalsIgnoreCase("06")) 
	   {lastDayOfTheMonth= "30 June";firstDayofNextMonth= "1 July";}
	if(month.equalsIgnoreCase("07")) 
	   {lastDayOfTheMonth= "31 July";firstDayofNextMonth= "1 August";}
	if(month.equalsIgnoreCase("08")) 
	   {lastDayOfTheMonth= "31 August";firstDayofNextMonth= "1 September";}
	if(month.equalsIgnoreCase("09")) 
	   {lastDayOfTheMonth= "30 September";firstDayofNextMonth= "1 October";}
	if(month.equalsIgnoreCase("10")) 
	   {lastDayOfTheMonth= "31 October";firstDayofNextMonth= "1 November";}
	if(month.equalsIgnoreCase("11")) 
	   {lastDayOfTheMonth= "30 November";firstDayofNextMonth= "1 December";}
	if(month.equalsIgnoreCase("12")) 
	   {lastDayOfTheMonth= "31 December";firstDayofNextMonth= "1 January";}
																		    		    
    //return lastDayOfTheMonth;
}
public  void selectCharity(String charityYesNo) throws InterruptedException {
	Select charity = new Select(charitySelect);
	charity.selectByVisibleText(charityYesNo);
	Thread.sleep(2000);
}

public  void selectinstallationCountry(String installationCountryName) throws InterruptedException {
	Select installationCountry = new Select(installationCountrySelect);
	installationCountry.selectByVisibleText(installationCountryName);
	Thread.sleep(2000);
}

public  void selectDepartureCountry(String departureCountry) throws InterruptedException {
	Select departure = new Select(placeOfDepartureGoods);
	departure.selectByVisibleText(departureCountry);
	Thread.sleep(5000);
}
public  void selectDeparturePlaceCountry(String departureCountry) throws InterruptedException {
	Select departure = new Select(placeOfDeparture);
	departure.selectByVisibleText(departureCountry);
	Thread.sleep(5000);
}
public  void selectSpecialCountry(String specialCountrySelection) throws InterruptedException {
	Select specialCountry = new Select(specialCountrySelect);
	specialCountry.selectByVisibleText(specialCountrySelection);
	Thread.sleep(5000);
}
public void selectInstallationDetail(String installationType) throws InterruptedException {
	Select installation = new Select(installationSelect);
	installation.selectByVisibleText(installationType);
	Thread.sleep(5000);
	
}
public void selectWhatTypeOfTangibleGood(String Tangible_Property) throws InterruptedException {
	Select trans = new Select(Tangible_PropertySelect);
	trans.selectByVisibleText(Tangible_Property);
	
	Thread.sleep(2000);
}

public  void selectCustomewerVatCountry(String CustomewerVatCountry) throws InterruptedException {
		Select customer_vat_country = new Select(UsedVAT_Customer);
	customer_vat_country.selectByVisibleText(CustomewerVatCountry);	
	Thread.sleep(3000);
}
public  void selectplaceOfDepartureGoods(String PlaceOfDepartureGoods) throws InterruptedException {
	Select place_Of_Departure_Goods = new Select(placeOfDepartureGoods);
	place_Of_Departure_Goods.selectByVisibleText(PlaceOfDepartureGoods);	
Thread.sleep(3000);

}

public  void selectWhereSupplyTakesPlace(String whereSuppleTakePlace) throws InterruptedException {
	Select suply = new Select(supply);
	suply.selectByVisibleText(whereSuppleTakePlace);
	Thread.sleep(2000);
	
}

public void SelectIsTriangulationTransaction(String isTriangulatioonTransaction) throws InterruptedException {
	Select places = new Select(triangulationSelect);
	places.selectByVisibleText(isTriangulatioonTransaction);	
	Thread.sleep(5000);
}
public void selectPlaceWhereGoodsLocated(String placewhereGoodsLocated) throws InterruptedException {
	Select places = new Select(goodsLocated);
	places.selectByVisibleText(placewhereGoodsLocated);	
	Thread.sleep(2000);
	jumpToElementThroughTabs(2);
	Thread.sleep(2000);
}


public void selectVehicleType(String VehicleType) throws InterruptedException {
	Select Vehicle_Type = new Select(isVehicleSelect);
	Vehicle_Type.selectByVisibleText(VehicleType);	
	Thread.sleep(5000);
}
public void selectcountrySupplierUsePermanentEstablishment(String countrySupplierUsePermanentEstablishment) throws InterruptedException {
	Select places = new Select(SuplPermanentEstablishmentCountrySelect);
	places.selectByVisibleText(countrySupplierUsePermanentEstablishment);	
	Thread.sleep(5000);
}

}
