package solid_principles;

class InvoiceCalculator{

    public void calculateInvoiceTotal(){
        // Logic to calculate invoice total.
    }
}

class PDFGenerator{

    public void generatePDF(){
        // Logic to generate PDF.
    }
}

class EmailSender{

    public void sentInvoiceEmail(){
        // Logic to send the email.
    }
}

public class SRP_solution {

    private InvoiceCalculator calc = new InvoiceCalculator();
    private PDFGenerator pdfGenerator = new PDFGenerator();
    private EmailSender emailSender = new EmailSender();

    public void processInvoice(){

        calc.calculateInvoiceTotal();
        pdfGenerator.generatePDF();
        emailSender.sentInvoiceEmail();
    }
}
