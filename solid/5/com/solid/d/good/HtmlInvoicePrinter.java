package com.solid.d.good;

import com.solid.i.ComplexInvoice;
import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter_I;

public class HtmlInvoicePrinter implements GoodInvoicePrinter_I {
    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing HTML invoice " + invoice);
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing complex HTML invoice " + complexInvoice);
    }
}
