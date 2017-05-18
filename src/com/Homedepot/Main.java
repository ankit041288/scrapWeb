package com.Homedepot;

import com.Homedepot.DTOs.ProductResponse;
import com.Homedepot.RetorFit.RetrieveProducts;
import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.JauntException;
import com.jaunt.UserAgent;
import retrofit.Call;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<searchProducts> aProducts = new ArrayList<>();

    public static String getProductName(String sku) throws IOException {
        RetrieveProducts retrieveProducts = RetrieveProducts.retrofit.create(RetrieveProducts.class);
        Call<ProductResponse> call = retrieveProducts.getProductDetails(sku,"json","bHprAUPmEerV6zuHDEpiKY2BBlD0OFGQ","info");
        ProductResponse r = call.execute().body();
        if(r == null){
            return "";
        }
     //   Double price =r.getProducts().getProduct().getSkus().getSku().getStoreSkus().getStoreSku().getPricing().getOriginalPrice();
        String productName =r.getProducts().getProduct().getSkus().getSku().getInfo().getBrandName()+" "+ r.getProducts().getProduct().getSkus().getSku().getInfo().getProductLabel();
        return productName;
    }



    public static void main(String[] args) throws Exception {
        BufferedWriter bw = null;
        FileWriter fw = null;

        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String productName = getProductName(scan.nextLine());
            if (productName.length() > 1) {


                // write your code here
                UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
                userAgent.settings.checkSSLCerts = false;
                userAgent.visit("https://www.google.com");

                userAgent.doc.apply(productName);            //apply form input (starting at first editable field)
                userAgent.doc.submit("Google Search");         //click submit button labelled "Google Search"

                Elements links = userAgent.doc.findEvery("<h3 class=r>").findEvery("<a>");  //find search result links
                int count = 0;
                for (Element link : links) {

                 //   System.out.println(link.getAt("href"));
                    if (link.getAt("href").contains("amazon.com")) {
                        try {
                            amazonScrap(link);


                        } catch (Exception ex) {

                        }

                    }
            /*else if(link.getAt("href").contains("lowes")){
                lowesScrap(link);
            }*/
                    else if (link.getAt("href").contains("homedepot.com")) {
                        homedepotScrape(link);
                    }

                }

                for (searchProducts a : aProducts
                        ) {
                 System.out.println(productName+ " "+ a.getURL()+" "+ a.CompanyName + " " + a.getCost() );


                }

                aProducts = new ArrayList<>();

            }
        }
    }



    public  static void amazonScrap(Element link) throws JauntException{
        UserAgent userAgent = new UserAgent();
        userAgent.settings.checkSSLCerts=false;
        searchProducts a = new searchProducts();
        a.setCompanyName("Amazon.com");
        String url = "https://www.amazon.com/gp/offer-listing/"+link.getAt("href").split("q=")[1].split("&")[0].split("/")[5];
        a.setURL(url);
        userAgent.visit(url);
        a.setCost(userAgent.doc.findFirst("<span  class=\"a-size-large a-color-price olpOfferPrice a-text-bold\">").innerHTML());
        a.setImageUrl(userAgent.doc.findFirst("<img alt=\"Return to product information\">").getAt("src").toString());
        aProducts.add(a);


    }

    public static void lowesScrap(Element link) throws Exception {
        UserAgent userAgent = new UserAgent();
        userAgent.settings.checkSSLCerts=false;
        searchProducts a = new searchProducts();
        a.setCompanyName("Lowes.com");
        String url = link.getAt("href").split("q=")[1].split("&")[0]+"?productId=&searchTerm=75063";
        /*userAgent.visit(url);
        Form form = userAgent.doc.getForm("<form id=\"store-locator-form\"");
       form.getElement().findFirst("<input aria-describedby=\"ada-zipcode-describedby\" aria-labelledby=\"ada-zipcode-describedby\" name=\"searchTerm\"").innerHTML("75063");
        //Cookie cookie = new Cookie("https://www.lowes.com","user=\t\n" +
          //      "%7B%22authToken1%22%3A%22%22%2C%22SSOToken%22%3A%22Guest%22%2C%22authToken2%22%3A%22Guest%22%2C%22storeNumber%22%3A%220515%22%2C%22segment%22%3Anull%2C%22zipPrompt%22%3Atrue%2C%22hasReloadedPage%22%3Atrue%7D");

        //userAgent.cookies.addCookie(cookie);

        a.setURL(url);
        a.setImageUrl(userAgent.doc.findFirst("<img itemprop=\"image\" class=\"product-image pd-epc\">").getAt("src").toString());
        a.setCost(userAgent.doc.findFirst("<span class=\"primary-font jumbo strong\"").innerHTML());*/

      //  Document doc = Jsoup.connect(url).get();

    }

    public static void homedepotScrape(Element link) throws Exception{
        try {
        UserAgent userAgent = new UserAgent();
        userAgent.settings.checkSSLCerts=false;
        searchProducts a = new searchProducts();
        a.setCompanyName("Homedepot.com");
        String url = link.getAt("href").split("q=")[1].split("&")[0];
        userAgent.visit(url);
        a.setURL(url);

            a.setImageUrl(userAgent.doc.findFirst("<img  id=\"mainImage\" itemprop=\"image\"").getAt("src").toString());
            a.setCost(userAgent.doc.findFirst("<span id=\"ajaxPrice\" class=\"pReg\" itemprop=\"price\"").innerHTML().replace("\t","").replace("\n",""));
            aProducts.add(a);

        }
        catch (Exception ex){

        }


    }





}
