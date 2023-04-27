import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FangraphTopTen {
   public static void main(String[] args) {
      String[] years = {"2022", "2021", "2020"};

      for (String year : years) {
         String url = "https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=0&type=c" + "&year=" + year + "&month=0&season=2022&season1=2022&ind=0&team=0&rost=0&age=0&filter=&players=0&startdate=&enddate=&page=1_1000";

         try {
            Document doc = Jsoup.connect(url).get();
            Elements rows = doc.select("table#LeaderBoard1_dg1 tbody tr");

            System.out.println("Top 10 Batting Leaders in " + year + ":");
            for (int i = 0; i < 10; i++) {
               Element row = rows.get(i);
               String name = row.select("td:eq(1) a").text();
               String team = row.select("td:eq(2)").text();
               String avg = row.select("td:eq(3)").text();
               System.out.println((i+1) + ". " + name + " (" + team + "): " + avg);
            }
            System.out.println();

         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}
