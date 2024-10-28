package emad;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static List<Sale> listOfsales;
    public static void main( String[] args ) throws IOException
    {
        listOfsales = readSales("sales.csv");
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
