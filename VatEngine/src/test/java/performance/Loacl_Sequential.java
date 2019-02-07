package performance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Loacl_Sequential {

	public static void main(String ar[]) throws IOException
	{
		//OkHttpClient client = new OkHttpClient();
		OkHttpClient client = new OkHttpClient.Builder()
			        .connectTimeout(10, TimeUnit.SECONDS)
			        .writeTimeout(10, TimeUnit.SECONDS)
			        .readTimeout(30, TimeUnit.SECONDS)
			        .build();
		MediaType mediaType = MediaType.parse("text/xml; charset=utf-8");
		
		String filetosend= convertFileToString("test1-BLFR.xml");
		
	//	RequestBody body = RequestBody.create(mediaType, "<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n  <soap:Body>\r\n    <AnalyseDocument xmlns=\"http://tempuri.org/\">\r\n      <document><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n<?xml-stylesheet type=\"text/xsl\" href=\"http://www.vatat.com/xml/vatat_invoice_view_jscript.xsl\"?>\r\n<iVATEngineInput>\r\n\t<Supplier>\r\n\t\t<ID>2837</ID>\r\n\t\t<Name>BECOMPANY NV</Name>\r\n\t\t<Address>TOEKOMSTSTRAAT 10</Address>\r\n\t\t<ZIP>1000</ZIP>\r\n\t\t<City>BRUSSEL</City>\r\n\t\t<Country>BE</Country>\r\n\t\t<RegOfCommerce/>\r\n\t\t<BancAccountNumber/>\r\n\t\t<IBAN/>\r\n\t\t<BIC/>\r\n\t\t<TelephoneNumber/>\r\n\t\t<FaxNumber/>\r\n\t\t<EmailAddress/>\r\n\t\t<SpecialType>0</SpecialType>\r\n\t\t<DeductionType>0</DeductionType>\r\n\t\t<VATNumberSupplier Country=\"BE\">\r\n\t\t\t<VATNumber>BE0686731303</VATNumber>\r\n\t\t\t<VATNumberType>1</VATNumberType>\r\n\t\t\t<Name/>\r\n\t\t\t<Address1/>\r\n\t\t\t<Address2/>\r\n\t\t\t<Address3/>\r\n\t\t\t<TaxNumber/>\r\n\t\t\t<BelongsToFiscalUnit>0</BelongsToFiscalUnit>\r\n\t\t</VATNumberSupplier>\r\n\t\t<CountryChosenVATNumber>BE</CountryChosenVATNumber>\r\n\t</Supplier>\r\n\t<Customer>\r\n\t\t<ID>2842</ID>\r\n\t\t<Name>FRCOMPANY SA</Name>\r\n\t\t<Address>RUE NATIONAL 15</Address>\r\n\t\t<ZIP>59800</ZIP>\r\n\t\t<City>LILLE</City>\r\n\t\t<Country>FR</Country>\r\n\t\t<SpecialType>0</SpecialType>\r\n\t\t<VATNumberCustomer Country=\"FR\">\r\n\t\t\t<VATNumber>FR01160568416</VATNumber>\r\n\t\t\t<VATNumberType>1</VATNumberType>\r\n\t\t\t<Name/>\r\n\t\t\t<Address1/>\r\n\t\t\t<Address2/>\r\n\t\t\t<Address3/>\r\n\t\t\t<RequiredOnInvoicePicture>False</RequiredOnInvoicePicture>\r\n\t\t\t<BelongsToFiscalUnit>0</BelongsToFiscalUnit>\r\n\t\t</VATNumberCustomer>\r\n\t\t<CountryChosenVATNumber>FR</CountryChosenVATNumber>\r\n\t</Customer>\r\n\t<InvoiceProperties>\r\n\t\t<DocumentType>0</DocumentType>\r\n\t\t<Disconto>0</Disconto>\r\n\t\t<Currency1>EUR</Currency1>\r\n\t\t<InvoiceNumber/>\r\n\t\t<ReferenceInvoiceNumber/>\r\n\t\t<InvoiceDate>2008-10-29</InvoiceDate>\r\n\t\t<OfficialLanguage>1</OfficialLanguage>\r\n\t</InvoiceProperties>\r\n\t<Item ID=\"1\">\r\n\t\t<Properties>\r\n\t\t\t<Description>test 1</Description>\r\n\t\t\t<InternationalDescription LanguageID=\"1\">badkuipen</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"2\">baignoires</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"3\">shower-baths, sinks and wash basins</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"4\">bañeras</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"5\">badewannen</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"6\">banheiras</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"7\">vasche da bagno</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"9\">badekar</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"10\">muoviset kylpyammeet</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"11\">badkar</InternationalDescription>\r\n\t\t\t<InternationalDescription LanguageID=\"15\">du?as telpas, izlietnes un mazga?anas tvertnes</InternationalDescription>\r\n\t\t\t<TaricCode>3922100000</TaricCode>\r\n\t\t\t<Amounts CurrencyNumber=\"1\">\r\n\t\t\t\t<UnitPriceExclVAT>100</UnitPriceExclVAT>\r\n\t\t\t\t<TotalAmountExclVAT>100</TotalAmountExclVAT>\r\n\t\t\t\t<PackagingCosts>0</PackagingCosts>\r\n\t\t\t</Amounts>\r\n\t\t\t<Number>1</Number>\r\n\t\t\t<Unit/>\r\n\t\t\t<VATRate>0</VATRate>\r\n\t\t\t<Reduction>0</Reduction>\r\n\t\t\t<AdditionalProperties>\r\n\t\t\t\t<PropertiesPerCountry Country=\"BE\">\r\n\t\t\t\t\t<VATRateCode>S</VATRateCode>\r\n\t\t\t\t</PropertiesPerCountry>\r\n\t\t\t\t<PropertiesPerCountry Country=\"FR\">\r\n\t\t\t\t\t<VATRateCode>S</VATRateCode>\r\n\t\t\t\t</PropertiesPerCountry>\r\n\t\t\t\t<PropertiesPerCountry Country=\"FR\">\r\n\t\t\t\t\t<VATRateCode>S</VATRateCode>\r\n\t\t\t\t</PropertiesPerCountry>\r\n\t\t\t\t<EngineParameter1>AAAA0</EngineParameter1>\r\n\t\t\t\t<EngineParameter2/>\r\n\t\t\t\t<EngineParameter3/>\r\n\t\t\t</AdditionalProperties>\r\n\t\t\t<OutOfVAT>0</OutOfVAT>\r\n\t\t\t<ReportingProperties>\r\n\t\t\t\t<CommodityCode>39221000</CommodityCode>\r\n\t\t\t</ReportingProperties>\r\n\t\t</Properties>\r\n\t\t<Conditions>\r\n\t\t\t<CountryOperation>FR</CountryOperation>\r\n\t\t\t<Installation>0</Installation>\r\n\t\t\t<SupplyIn>0</SupplyIn>\r\n\t\t\t<Transporter>2</Transporter>\r\n\t\t\t<Triangulation>1</Triangulation>\r\n\t\t\t<ContinuousSupply>0</ContinuousSupply>\r\n\t\t\t<DateTransaction>2008-10-29</DateTransaction>\r\n\t\t</Conditions>\r\n\t\t<Mentioning Country=\"BE\">\r\n\t\t\t<Number>1</Number>\r\n\t\t\t<Text>Levering van goederen niet onderworpen aan Belgische BTW.  art. 15, § 2, eerste lid van het WBTW</Text>\r\n\t\t</Mentioning>\r\n\t\t<Mentioning Country=\"FR\">\r\n\t\t\t<Number>219</Number>\r\n\t\t\t<Text>Art. 258D du C.G.I.- Taxe due par le cocontractant - Art. 283, 1, 2 et 2ter du C.G.I.</Text>\r\n\t\t</Mentioning>\r\n\t\t<AdditionalMentioning>\r\n\t\t\t<Text>De goederen worden niet geïnstalleerd. / Les biens ne sont pas installés.</Text>\r\n\t\t</AdditionalMentioning>\r\n\t\t<AdditionalMentioning>\r\n\t\t\t<Text>Het goed bevindt zich in Frankrijk. / Les biens se trouvent en France.</Text>\r\n\t\t</AdditionalMentioning>\r\n\t</Item>\r\n\t<AmountsSummary CurrencyNumber=\"1\">\r\n\t\t<VATTotals VATRate=\"0\">\r\n\t\t\t<AmountDisconto>0</AmountDisconto>\r\n\t\t\t<AmountExclVAT>100</AmountExclVAT>\r\n\t\t\t<AmountVAT>0</AmountVAT>\r\n\t\t</VATTotals>\r\n\t\t<Totals>\r\n\t\t\t<TotalAmountVAT>0</TotalAmountVAT>\r\n\t\t\t<TotalAmountInclVAT>100</TotalAmountInclVAT>\r\n\t\t\t<TotalAmountDisconto>0</TotalAmountDisconto>\r\n\t\t\t<TotalAmountInclVATCash>100</TotalAmountInclVATCash>\r\n\t\t\t<TotalAmountPackagingCosts>0</TotalAmountPackagingCosts>\r\n\t\t</Totals>\r\n\t</AmountsSummary>\r\n\t<CheckValue>100</CheckValue>\r\n</iVATEngineInput>\r\n]]></document>\r\n    </AnalyseDocument>\r\n  </soap:Body>\r\n</soap:Envelope>");
		RequestBody body = RequestBody.create(mediaType, filetosend);
		Request request = new Request.Builder()
		  .url("http://localhost/iVATEngineService/EngineService.asmx")
		  .post(body)
		  .addHeader("content-type", "text/xml; charset=utf-8")
		  .addHeader("soapaction", "http://tempuri.org/AnalyseDocument")
		  .addHeader("cache-control", "no-cache").build();
		 // .addHeader("postman-token", "7842e6f9-1bd6-2225-bf48-7c51eeabba94")
		 

		 long startTime = System.currentTimeMillis();
		 Response response = client.newCall(request).execute();
	        long elapsedTime = System.currentTimeMillis() - startTime;
	       double  validationTime=elapsedTime/1000.00;
		System.out.println("validationTime="+validationTime);
		
	System.out.println(response.body().string());
	
	
	startTime = System.currentTimeMillis();
	  response = client.newCall(request).execute();
        elapsedTime = System.currentTimeMillis() - startTime;
        validationTime=elapsedTime/1000.00;
	System.out.println("validationTime="+validationTime);
	System.out.println(response.body().string());
	}
	public static String convertFileToString (String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		String finalstring="";
		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				finalstring=finalstring+sCurrentLine;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
      return finalstring;
    }
}
