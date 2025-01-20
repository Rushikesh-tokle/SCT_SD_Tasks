import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class SCT_SD_Task4 {

    public static void main(String[] args) {
        String url = "https://www.amazon.in/s?k=flipkart+online+shopping&adgrpid=1322714098021561&hvadid=82669890077096&hvbmt=be&hvdev=c&hvlocphy=156130&hvnetw=o&hvqmt=e&hvtargid=kwd-82670515805048%3Aloc-90&hydadcr=26727_2506368&tag=msndeskstdin-21&ref=pd_sl_40oj31wdpt_e"; // Replace with the e-commerce URL
        String outputCsv = "products.csv";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements products = doc.select(".product"); // Replace '.product' with the actual CSS selector for products

            FileWriter csvWriter = new FileWriter(outputCsv);
            csvWriter.append("Product Name,Price,Rating\n");

            for (Element product : products) {
                String name = product.select(".product-name").text(); // Replace '.product-name' with actual CSS selector
                String price = product.select(".product-price").text(); // Replace '.product-price' with actual CSS selector
                String rating = product.select(".product-rating").text(); // Replace '.product-rating' with actual CSS selector

                csvWriter.append(name).append(",").append(price).append(",").append(rating).append("\n");
            }

            csvWriter.flush();
            csvWriter.close();

            System.out.println("Product information extracted and stored in " + outputCsv);

        } catch (IOException e) {
            System.out.println("An error occurred while fetching the website data.");
            e.printStackTrace();
        }
    }
}
