package emad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;


public class App 
{
    public static List<Sale> listOfsales;

    public static void main(String[] args) throws IOException {
        System.out.println();
        listOfsales = readSales("sales.csv");

        // *Filter sales where quantity > Threshold
        // List<Sale> filterByQuantity = filterByQuantity(listOfsales, 7);
        // List<Sale> filterByCategory = filterByCategory(listOfsales,"Electronics");
        // filterByCategory.forEach(e -> System.out.println(e));

        // sortByOrderDateDescending(listOfsales).forEach(e -> System.out.println(e));

       // printSales(listOfsales);
     
       System.out.println(listOfsales.size());
       System.out.println(listOfsales.get(0).getProductName());
       System.out.println(listOfsales.get(1).getPrice());

    //    List<Sale> sortByPrice= sortByPrice(listOfsales);
    //    sortByPrice.forEach(e -> System.out.println(e));        
             
    }
    public static List<Sale> sortByPrice(List<Sale> sales) {
        return sales.stream()
                .sorted(Comparator.comparing(Sale::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Sale> sortByOrderDateDescending(List<Sale> sales) {
        return sales.stream()
                .sorted(Comparator.comparing(Sale::getOrderDate).reversed())
                .collect(Collectors.toList());
    }

    public static List<Sale> filterByQuantity(List<Sale> sales, int quantityThreshold) {
        return sales.stream()
                .filter(sale -> sale.getQuantity() > quantityThreshold)
                .collect(Collectors.toList());
    }

    public static List<Sale> filterByCategory(List<Sale> sales, String category) {
        return sales.stream()
                .filter(sale -> sale.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public static void printSales(List<Sale> listOfSales) {
        listOfSales
                .stream()
                .forEach(record -> System.out.println(record));
    }

    public static List<Sale> readSales(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .skip(1)
                .map(line -> {
                    String[] row = line.split(",");
                    return new Sale(Integer.parseInt(row[0]), row[1], row[2], row[3], Integer.parseInt(row[4]),
                            Integer.parseInt(row[5]), Integer.parseInt(row[6]), LocalDate.parse(row[7]));
                })
                .collect(Collectors.toList());
    }
}
