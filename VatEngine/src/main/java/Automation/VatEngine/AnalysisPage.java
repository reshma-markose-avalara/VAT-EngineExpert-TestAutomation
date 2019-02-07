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


public class AnalysisPage {
	

WebDriver driver;
 
 
public AnalysisPage(WebDriver ldriver)
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

@FindBy(how=How.CSS,using="select[title*='effective use and enjoyment'][class='LargeSizeControl']")
@CacheLookup
WebElement PlaceOfServiceSelect;

@FindBy(how=How.CSS,using="select[title*='transport'][class='LargeSizeControl']")
@CacheLookup
WebElement transportSelect;

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

@FindBy(how=How.CSS,using="select[title*='Who is the importer'][class='LargeSizeControl'] ")
@CacheLookup
WebElement importerSelect;
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

// start :test 1 to 27 is unit test for VatExpert
public boolean Test1() throws InterruptedException
{
	//supplier.sendKeys("BECOMPANY NV");
	selectSupplier("BECOMPANY NV");
	selectCustomer("FRCOMPANY SA");
	selectItem("shower-baths, sinks and wash basins");
	selectWhoCarriesTransport("There is no transport");	
	selectPlaceWhereGoodsLocated("France");
	selectCustomewerVatCountry("France");
	SelectIsTriangulationTransaction("Yes");	
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Art. 283, 1, 2 et 2ter du C.G.I.")==true)
			&&
			(legal4.equalsIgnoreCase("Article 197- Directive 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
}

public boolean 		Test2() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("FRCOMPANY SA");
	selectItem("computer");
	selectInstallationDetail("The goods are installed or assembled by the supplier");
	selectDepartureCountry("The Netherlands");
	selectinstallationCountry("France");
	waitForMentioningOrInvoiceLine();
	System.out.println(MentioningsDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 3 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 36 - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Levering niet onderworpen aan Nederlandse BTW art. 5, lid 1, b) io art. art. 3, lid 1, f) Wet OB")==true)
			&&
			(legal4.equalsIgnoreCase("Artikel 36 - Richtlijn 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
}


public boolean Test3() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("BETRADING NV");
	selectInvoiceType("Credit note sale");
	selectItem("computer");
	selectInstallationDetail("The goods are not installed");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Belgium");
	selectPlaceOfArrival("Belgium");
	selectCustomewerVatCountry("Belgium");
	waitForMentioningOrInvoiceLine();
	String VatPercent= getVatPercent();
	
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	if(
			(legal1.equalsIgnoreCase("BTW terug te storten aan de Staat in de mate waarin ze oorspronkelijk in aftrek werd gebracht")==true)
		&&
		(VatPercent.equalsIgnoreCase("21")==true)
		)
		{
			return true;
		}
	else	
		return false;
	
}

public boolean Test4() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("NLTRADING BV");
	selectItem("work on immovable goods");
	selectImmovablePropertyLocation("Belgium");
	
	selectCustomewerVatCountry("The Netherlands");
	waitForMentioningOrInvoiceLine();
	System.out.println(new Select(VatPercentage).getFirstSelectedOption().getText());
	String VatPercent= getVatPercent();
		
	if(
		(VatPercent.equalsIgnoreCase("21")==true)
		)
		{
			return true;
		}
	else	
		return false;
}



public boolean Test5() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BEGLOBAL");
	selectCustomer("FRCOMPANY SA");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Belgium");
	selectCustomewerVatCountry("France");	
	selectWhereSupplyTakesPlace("The supply takes place in a VAT warehouse");
	waitForMentioningOrInvoiceLine();
	String VatPercent= getVatPercent();
	
	if(
		(VatPercent.equalsIgnoreCase("21")==true)
		)
		{
			return true;
		}
	else	
		return false;
}



public boolean Test7() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("GBCOMPANY LTD");
	selectCustomer("GBTRADING LTD");
	selectMonthEndTransactionDate();
	selectItem("computer");
	selectInstallationDetail("The goods are not installed");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("United Kingdom");
	selectCustomewerVatCountry("United Kingdom");
	selectWhereSupplyTakesPlace("None of the following");
	selectCharity("No");
	waitForMentioningOrInvoiceLine();
	if(	(getVatPercent().equalsIgnoreCase("20")==true) )
		{
			return true;
		}
	else	
		return false;
}

public boolean Test8() throws InterruptedException
{
	startNewAnalysis();
	
	selectSupplier("GBCOMPANY LTD");
	selectCustomer("GBTRADING LTD");
	selectNextMonthTransactionDate();
	selectItem("computer");
	selectInstallationDetail("The goods are not installed");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("United Kingdom");
	selectCustomewerVatCountry("United Kingdom");
	selectWhereSupplyTakesPlace("None of the following");
	selectCharity("No");
	waitForMentioningOrInvoiceLine();
	if(	(getVatPercent().equalsIgnoreCase("20")==true) )
	{
		return true;
	}
	else	
		return false;
}

public boolean Test9() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("BETRADING NV");
	selectCustomerVatNumber("NL846468692B01");
	selectInvoiceType("Transfer document");
	selectItem("trailers and semi-trailers not mechanically propelled");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("Belgium");
	selectPlaceOfArrival("The Netherlands");
	waitForMentioningOrInvoiceLine();
	System.out.println(MentioningsDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	
	if(
			(legal1.equalsIgnoreCase("Vrijstelling van BTW art. 39bis, eerste lid, 4° van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 138, lid 2, onder c) - Richtlijn 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
}

public boolean  Test11() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("PLCOMPANY");
	//selectInvoiceType("Transfer document");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Belgium");
	selectCustomewerVatCountry("Poland");
	selectWhereSupplyTakesPlace("None of the following");
	//selectPlaceOfArrival("Poland");
	waitForMentioningOrInvoiceLine();
	System.out.println(MentioningsDetails.getText());
	if(	(getVatPercent().equalsIgnoreCase("21")==true) )
	{
		return true;
	}
	else	
		return false;
	
	
}
public boolean Test12() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("PLCOMPANY");	
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Poland");
	selectCustomewerVatCountry("Poland");
	SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;	
}

public boolean Test13() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BEINTERNATIONAL NV");
	selectCustomer("PLCOMPANY");
	
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	selectcountrySupplierUsePermanentEstablishment("Belgium");
	
	selectPlaceWhereGoodsLocated("Poland");
	selectCustomewerVatCountry("Poland");
	selectWhereSupplyTakesPlace("None of the following");
	
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;	
}

public boolean Test14() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("DKINTERNATIONAL");
	selectCustomerVatNumber("PL0938674822");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Poland");
	SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("art. 194 - Dyrektywa Rady 2006/112")==true)
			&&
			(legal4.equalsIgnoreCase("art. 194 - Dyrektywa Rady 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;

}
public boolean Test15() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("DKINTERNATIONAL");
	selectCustomerVatNumber("PL0938674822");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Poland");
	//selectCustomewerVatCountry("Poland");
	SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}

public boolean Test16() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BEINTERNATIONAL NV");
	selectCustomer("DKINTERNATIONAL");
	selectCustomerVatNumber("PL0938674822");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	
	selectcountrySupplierUsePermanentEstablishment("Poland");
	selectPlaceWhereGoodsLocated("Poland");
	//selectCustomewerVatCountry("Poland");
	//SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	if(
		(getVatPercent().equalsIgnoreCase("23")==true) 
	  )
		{
			return true;
		}
	else	
		return false;
}
public boolean Test17() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("NLTRADING BV");
	selectCustomerVatNumber("PL1320008876");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	
	//selectcountrySupplierUsePermanentEstablishment("Poland");
	selectPlaceWhereGoodsLocated("Poland");
	//selectCustomewerVatCountry("Poland");
	SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}
public boolean Test18() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("NLTRADING BV");
	selectCustomerVatNumber("PL1320008876");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	
	//selectcountrySupplierUsePermanentEstablishment("Poland");
	selectPlaceWhereGoodsLocated("Poland");
	//selectCustomewerVatCountry("Poland");
	SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}

public boolean Test19() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BEINTERNATIONAL NV");
	selectCustomer("NLTRADING BV");
	selectCustomerVatNumber("PL1320008876");
	selectItem("ceramic building bricks");
	selectWhoCarriesTransport("There is no transport");
	
	selectcountrySupplierUsePermanentEstablishment("Poland");
	selectPlaceWhereGoodsLocated("Poland");
	//selectCustomewerVatCountry("Poland");
	//SelectIsTriangulationTransaction("No");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	if(
			(getVatPercent().equalsIgnoreCase("23")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}


public boolean Test20() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("NLGLOBAL");
	selectCustomer("NLCOMPANY BV");
	selectInvoiceType("Credit note sale");	
	selectItem("transport of goods");	 
	selectPlaceOfDeparture("United Kingdom");
	selectPlaceOfArrival("United Kingdom");
	selectIsExemptedtransT1("None of the following");
	selectCustomewerVatCountry("The Netherlands");		
	waitForMentioningOrInvoiceLine();
	if(
			(getVatPercent().equalsIgnoreCase("21")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}
public boolean Test21() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("CHCOMPANY LTD");
	selectItem("transport of goods");
	selectPlaceOfDeparture("Luxembourg");
	selectPlaceOfArrival("Italy");	
	selectPartialWholTransportCountry("None of the following");
	selectPlaceOfServiceCountry("Italy");
	
	selectIsExemptedtransT1("None of the following");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 2 van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 44 Richtlijn 2006/112/EG")==true)
	  )
		{
			return true;
		}
	else	
		return false;
}

public boolean Test22() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("FRCOMPANY SA");
	selectItem("road transport services of freight");
	selectPlaceOfDeparture("The Netherlands");
	selectPlaceOfArrival("Switzerland");
	selectIsExemptedtransT1("Export of goods out of the EU");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 2 van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 44 Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Exempté de TVA - Article 262.I C.G.I.")==true)
			&&
			(legal4.equalsIgnoreCase("Article 146, paragraphe 1, point e) - Directive 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
}
public boolean Test23() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("BETRADING NV");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("There is no transport");
	selectCustomewerVatCountry("Belgium");
	selectPlaceWhereGoodsLocated("Belgium");
	//selectCustomewerVatCountry("Belgium");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();	
	if(
			(getVatPercent().equalsIgnoreCase("21")==true) 
		)
		{
			return true;
		}
	else	
		return false;

}
public boolean Test25() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("NLCOMPANY BV");
	selectCustomer("BECOMPANY NV");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("The Netherlands");
	selectPlaceOfArrival("Belgium");
	selectCustomewerVatCountry("Belgium");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("art 9, lid 2, b) Wet OBTabel II, onderdeel a, post 6")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 138, lid 1 - Richtlijn 2006/112")==true)
	  )
		{
			return true;
		}
	else	
		return false;
}

public boolean Test26() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BEPRIVE");
	selectCustomer("FRCOMPANY SA");
	selectItem("Movable tangible property");
	setAmount("456");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("Belgium");
	selectPlaceOfArrival("France");
	selectCustomewerVatCountry("France");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	//String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Verkoop door particulier, niet aan BTW onderworpen")==true)
			//&&
			//(legal2.equalsIgnoreCase("Artikel 138, lid 1 - Richtlijn 2006/112")==true)
	  )
		{
			return true;
		}
	else	
		return false;
}

public boolean Test27() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("FRCOMPANY SA");
	selectCustomer("BECOMPANY NV");
	selectGoodServices("car");
	selectWhatTypeOfTangibleGood("none of the following");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("France");
	selectPlaceOfArrival("Belgium");
	selectCustomewerVatCountry("Belgium");
	
	Select kmSelect = new Select(KM);
	kmSelect.selectByVisibleText("Less than 6000 km");
	Thread.sleep(5000);
	fillTextOtherDetails("Brand", "ford");
	fillTextOtherDetails("Model", "fiesta");
	fillTextOtherDetails("Cylinder", "600");
	fillTextOtherDetails("Motor power", "1.2");
	fillTextOtherDetails("Bodywork", "nothing");
	fillTextOtherDetails("Chassis", "1234");
	fillTextOtherDetails("Registration year", "2018");
	
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Exempté de TVA - Art. 262 ter-I 1°du CGI")==true)
			&&
			(legal2.equalsIgnoreCase("Article 138, paragraphe 1 - Directive 2006/112")==true)
	  )
		{
			return true;
		}
	else	
		return false;
}
//end :test 1 to 27 is unit test for VatExpert

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

public boolean Test5_RTestdistanceSale() throws InterruptedException
{
	selectSupplier("BECOMPANY NV");
	selectCustomer("DEPRIVE");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("Belgium");
	selectPlaceOfArrival("Germany");
	selectIfThresholdOrDistanceSale("Yes");
	waitForMentioningOrInvoiceLine();
	String VatPercent= getVatPercent();
	if(
		(VatPercent.equalsIgnoreCase("19")==true)
		)
		{
			return true;
		}
	else	
		return false;
}


public boolean Test1_RTestBEGR_ExpertiseOnImovableProperty() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("ELCOMPANY");
	selectItem("expertise on immovable property");
	selectImmovablePropertyLocation("Greece");
	//selectCustomewerVatCountry("Greece");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 3, 1° van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 47 Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
			&&
			(legal4.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
	
}
public boolean Test2_RTestBEGR_workOnImovableProperty() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("ELCOMPANY");
	selectItem("work on immovable property (-238-)");
	selectImmovablePropertyLocation("Greece");
	//selectCustomewerVatCountry("Greece");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 3, 1° van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 47 Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
			&&
			(legal4.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;	
	
}
public boolean Test3_RTestBRnotRegisteredInGR_mobileSale() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("ELCOMPANY");
	selectItem("Mobile phone (-120-)");
	selectWhoCarriesTransport("The buyer or for his account");
	selectPlaceOfDeparture("Greece");
	selectPlaceOfArrival("Greece");
	selectCustomewerVatCountry("Greece");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	if(
			(legal1.equalsIgnoreCase("KB nr. 1, art. 20ter")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 199bis Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Αντίστροφη επιβάρυνση")==true)
			&&
			(legal4.equalsIgnoreCase("Article 199a - Directive 2006/112/EC")==true)
		)
		{
			return true;
		}
	else	
		return false;
}
public boolean Test4_RTestBR_GRregistered_mobileSale() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("ELCOMPANY");
	selectItem("Mobile phone (-120-)");
	selectWhoCarriesTransport("The seller or for his account");
	selectPlaceOfDeparture("Belgium");
	selectPlaceOfArrival("Greece");
	selectCustomewerVatCountry("Greece");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	
	if(
			(legal1.equalsIgnoreCase("Vrijstelling van BTW art. 39bis, eerste lid, 1° van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 138, lid 1 - Richtlijn 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
	
}
public boolean Test5_RTestBE_notRegisteredInGR_toGR_workOnImovableProperty() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("ELCOMPANY");
	selectItem("expertise on immovable property");
	selectImmovablePropertyLocation("Greece");
	//selectCustomewerVatCountry("Greece");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 3, 1° van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 47 Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
			&&
			(legal4.equalsIgnoreCase("Article 199(1)(a) - Directive 2006/112")==true)
		)
		{
			return true;
		}
	else	
		return false;
	
}

public boolean Test6_Rtest_NLcompNLcomp_GoodsTransportedFrom_BE_DE() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("NLCOMPANY BV");
	selectCustomerText("NLCOMPANY BV B");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Belgium");
	selectPlaceOfArrival("Germany");
	selectSupplierPayDirectVat("Yes");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String warning= WarningsOverview.getText();

	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering niet onderworpen aan Nederlandse BTW art. 5, lid 1, a) Wet OB")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(warning.equalsIgnoreCase("Supplier should be Registered in Country of Departure and Customer should be Registered in Country of Arrival"))
	 )
		{
			return true;
		}
	else	
		return false;
	
}
public boolean Test7_Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BECOMPANY NV");
	selectCustomer("FRCOMPANY SA");
	selectItem("Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Germany");
	selectPlaceOfArrival("The Netherlands");
	selectCustomewerVatCountry("France");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	
	String warning= WarningsOverview.getText();

	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 2 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Steuerbefreiung §4 Nr. 1 (b) i.V.m. §6a Abs 1 UStG")==true)
			&&
			(legal4.equalsIgnoreCase("Artikel 138 Absatz 1 - Richtlinie 2006/112")==true)
			&&
			(warning.equalsIgnoreCase("Supplier should be Registered in Country of Departure and Customer should be Registered in Country of Arrival"))
	 )
		{
			return true;
		}
	else	
		return false;
	
}


// GCC test vases starts from here 
public boolean test_GCC1() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("AECOMPANY");
	selectItem("storage of goods (-265-)");
	selectCustomewerVatCountry("United Arab Emirates");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 2 van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 44 Richtlijn 2006/112/EG")==true)
		)
		{
			return true;
		}
	else	
		return false;
}

public boolean test_GCC2() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("AECOMPANY");
	selectItem("semi-manufactured gold 325/1000 (-117-)");
	selectTypeOfTangibleProperty("none of the following");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Belgium");
	selectVehicleType("No vehicle");
	selectCustomewerVatCountry("United Arab Emirates");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();	
	if(
			(getVatPercent().equalsIgnoreCase("21")==true) 
		)
		{
			return true;
		}
	else	
		return false;
}
public boolean test_GCC3() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("AECOMPANY");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("There is no transport");
	selectPlaceWhereGoodsLocated("Belgium");
	selectCustomewerVatCountry("United Arab Emirates");
	selectWhereSupplyTakesPlace("None of the following");
	waitForMentioningOrInvoiceLine();
	if(
			(getVatPercent().equalsIgnoreCase("21")==true) 
		)
		{
			return true;
		}
	else	
		return false;

}
public boolean test_GCC4() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("NLCOMPANY BV");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("United Arab Emirates");
	selectPlaceOfArrival("United Arab Emirates");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 1 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 31 - Richtlijn 2006/112")==true)
			&&
			(getVatPercent().equalsIgnoreCase("5")==true) 
		)
		{
			return true;
		}
	else	
		return false;	

}
public boolean test_GCC5() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("SACOMPANY");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("United Arab Emirates");
	selectPlaceOfArrival("Saudi Arabia");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("Saudi Arabia");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 2 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Reg Art 30")==true)
		)
		{
			return true;
		}
	else	
		return false;	

}

public boolean test_GCC6() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("AECOMPANY");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Saudi Arabia");
	selectPlaceOfArrival("United Arab Emirates");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("Abu Dhabi");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 2 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Reg Art 32")==true)
		)
		{
			return true;
		}
	else	
		return false;	

}

public boolean test_GCC7() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("AECOMPANY");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Belgium");
	selectPlaceOfArrival("United Arab Emirates");
	selectWhoIsImporter("The buyer");
	//selectInwhichCountryGoodsImported("Abu Dhabi");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Vrijstelling van BTW art. 39, § 1, 1° van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 146, lid 1, onder a) - Richtlijn 2006/112")==true)
			&&
			(getTaxAmount().contains("0.00"))
		)
		{
			return true;
		}
	else	
		return false;	

}
public boolean test_GCC8() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("SACOMPANY");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Belgium");
	selectPlaceOfArrival("Saudi Arabia");
	selectWhoIsImporter("The buyer");
	//selectInwhichCountryGoodsImported("Abu Dhabi");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Vrijstelling van BTW art. 39, § 1, 1° van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 146, lid 1, onder a) - Richtlijn 2006/112")==true)
			&&
			(getTaxAmount().contains("0.00"))
		)
		{
			return true;
		}
	else	
		return false;	

}

public boolean test_GCC9() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("NLCOMPANY BV");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("United Arab Emirates");
	selectPlaceOfArrival("Saudi Arabia");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("Saudi Arabia");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 2 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Reg Art 30")==true)
			&&
			(getTaxAmount().contains("0.00"))
		)
		{
			return true;
		}
	else	
		return false;	

}

public boolean test_GCC10() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("NLCOMPANY BV");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Saudi Arabia");
	selectPlaceOfArrival("United Arab Emirates");
	selectWhoIsImporter("The buyer");
	selectInwhichCountryGoodsImported("Ajman");
	waitForMentioningOrInvoiceLine();
	System.out.println(InvoiceLinesDetails.getText());
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Levering van goederen niet onderworpen aan Belgische BTW. art. 14, § 2 van het WBTW")==true)
			&&
			(legal2.equalsIgnoreCase("Artikel 32, eerste alinea - Richtlijn 2006/112")==true)
			&&
			(legal3.equalsIgnoreCase("Reg Art 32")==true)
			&&
			(getTaxAmount().contains("0.00"))
		)
		{
			return true;
		}
	else	
		return false;	

}

public boolean test_GCC11() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("AEDHLclienttest");
	selectCustomerText("AECOMPANY B");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The buyer or for his account");
	selectDeparturePlaceCountry("United Arab Emirates");
	selectPlaceOfArrival("United Arab Emirates");
	waitForMentioningOrInvoiceLine();
	if(
		(getTaxAmount().contains("5.00"))
	  )
		{
			return true;
		}
	else	
		return false;	
}

public boolean test_GCC12() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("AECOMPANY");
	selectCustomerText("AECOMPANY B");
	selectItem("storage of goods (-265-)");
	selectcountrySupplierUsePermanentEstablishment("United Arab Emirates");
	//selectCustomewerVatCountry("United Arab Emirates");
	waitForMentioningOrInvoiceLine();
	if(
		(getTaxAmount().contains("5.00"))
	  )
		{
			return true;
		}
	else	
		return false;	
}

public boolean test_GCC13() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("SACOMPANY");
	selectCustomerText("SACOMPANY B");
	selectItem("100 - Movable tangible property");
	selectWhoCarriesTransport("The seller or for his account");
	selectDeparturePlaceCountry("Saudi Arabia");
	selectPlaceOfArrival("Saudi Arabia");
	waitForMentioningOrInvoiceLine();
	if(
		(getTaxAmount().contains("5.00"))
	  )
		{
			return true;
		}
	else	
		return false;	
}
public boolean test_GCC14() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("SACOMPANY");
	selectCustomerText("SACOMPANY B");
	selectItem("215 - consultancy services");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;	
}
public boolean test_GCC15() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomerText("AECOMPANY");
	selectItem("206 - transport of goods");
	selectDeparturePlaceCountry("Abu Dhabi");
	selectIsExemptedtransT1("None of the following");
	selectPlaceOfArrival("Dubai");
	selectPartialWholTransportCountry("None of the following");
	selectPlaceOfServiceCountry("Dubai");
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 2 van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 44 Richtlijn 2006/112/EG")==true)
	  )
	{
		return true;
	}
	else	
		return false;
}

public boolean test_GCC16() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomerText("NLCOMPANY BV");
	selectItem("206 - transport of goods");
	selectDeparturePlaceCountry("Abu Dhabi");
	selectIsExemptedtransT1("None of the following");
	selectPlaceOfArrival("Dubai");
	/*selectPartialWholTransportCountry("None of the following");
	selectPlaceOfServiceCountry("Dubai");*/
	waitForMentioningOrInvoiceLine();
	String legal1= MentioningsDetails.findElements(By.tagName("a")).get(0).getText();
	String legal2= MentioningsDetails.findElements(By.tagName("a")).get(1).getText();
	String legal3= MentioningsDetails.findElements(By.tagName("a")).get(2).getText();
	String legal4= MentioningsDetails.findElements(By.tagName("a")).get(3).getText();
	
	System.out.println(MentioningsDetails.getText());
	if(
			(legal1.equalsIgnoreCase("Dienstverrichting niet onderworpen aan Belgische btw art. 21, § 2 van het Wbtw")==true)
			&&
			(legal2.equalsIgnoreCase("Art. 44 Richtlijn 2006/112/EG")==true)
			&&
			(legal3.equalsIgnoreCase("Art. 12, tweede lid wet OB")==true)
			&&
			(legal4.equalsIgnoreCase("Artikel 196 - Richtlijn 2006/112/EG")==true)
		)
	{
		return true;
	}
	else	
		return false;
}
public boolean test_GCC17() throws InterruptedException
{
	startNewAnalysis();
	selectSupplier("BETRADING NV");
	selectCustomer("EEPRIVE"); 
	selectItem("206 - transport of goods");
	selectDeparturePlaceCountry("United Arab Emirates");
	selectIsExemptedtransT1("None of the following");
	selectPlaceOfArrival("Dubai");
	if(	(getTaxAmount().contains("5.00"))  )
	{
		return true;
	}
	else	
		return false;
}

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
//public boolean TestGCC9_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
//	selectCustomer("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN B");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
public boolean TestGCC10_Cultural() throws InterruptedException
{
	startNewAnalysis();
	nextMonth();
	Jan2019();
	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
	selectItem("Cultural, Artistic, Sports and Recreational Services");
	selectPlaceOfServiceCountry("Bahrain");
	selectCustomewerVatCountry("Bahrain");
	waitForMentioningOrInvoiceLine();
	if(	(getTaxAmount().contains("50.00"))  )
	{
		return true;
	}
	else	
		return false;	
}

//public boolean TestGCC11_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
//	selectCustomer("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//public boolean TestGCC12_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN - NON ESTABLISHED REGISTERED IN BAHRAIN");
//	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//public boolean TestGCC13_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
//	selectCustomer("TEST BAHRAIN - ESTABLISHED NON REGISTERED NON TAXABLE ACTIVITY");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//
//public boolean TestGCC15_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
//	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//
//public boolean TestGCC16_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
//	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//
//public boolean TestGCC17_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN - NON ESTABLISHED NOT REGISTERED TAXABLE ACTIVITY");
//	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}
//public boolean TestGCC18_Cultural() throws InterruptedException
//{
//	startNewAnalysis();
//	nextMonth();
//	Jan2019();
//	selectSupplier("TEST BAHRAIN ESTABLISHED AND REGISTERED");
//	selectCustomer("TEST BAHRAIN - BAHRAIN PRIVATE PERSON");
//	selectItem("Cultural, Artistic, Sports and Recreational Services");
//	selectPlaceOfServiceCountry("Bahrain");
//	selectPlaceOfServiceGCC("Bahrain");
//	waitForMentioningOrInvoiceLine();
//	if(	(getTaxAmount().contains("50.00"))  )
//	{
//		return true;
//	}
//	else	
//		return false;	
//}

public String getTaxAmount() {
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
