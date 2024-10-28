package emad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class SaleTest {



    private List<Sale> sales;

     @Test
    public void testReadSales() throws IOException {
        // Adjust the path to the file's location
        String filePath = "sales.csv";
        
        List<Sale> salesFromFile = App.readSales(filePath);

        assertEquals(20, salesFromFile.size());
        assertEquals("Laptop", salesFromFile.get(0).getProductName());
        assertEquals(800, salesFromFile.get(1).getPrice());
    }
//     @Test
//     public void testPrintSales() {
//         List<Sale> printSales = App.printSales();
        
    
// }

}
