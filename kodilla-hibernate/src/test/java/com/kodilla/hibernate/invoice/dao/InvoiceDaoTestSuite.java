package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        Product product1 = new Product("Car");
        Product product2 = new Product("Chocolate");
        productDao.save(product1);
        productDao.save(product2);

        Item item1 = new Item(product1, BigDecimal.valueOf(98000), 2, BigDecimal.valueOf(3));
        Item item2 = new Item(product2, BigDecimal.valueOf(4), 12, BigDecimal.valueOf(7));

        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        Invoice invoice = new Invoice("20190217", itemList);

        invoiceDao.save(invoice);
        int id = invoice.getId();

        Assert.assertNotEquals(0, id);

        productDao.deleteAll();
        invoiceDao.deleteAll();
    }
}