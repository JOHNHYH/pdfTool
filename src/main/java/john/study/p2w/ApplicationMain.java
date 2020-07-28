package john.study.p2w;

public class ApplicationMain {
    public static void main(String[] args) {
//        String res = new PdfToWord().pdftoword("*******.pdf");
//        System.out.println(res);

        ExecuteServiceManager executeServiceManager = new ExecuteServiceManager();
        PdfToWordPerfect pdfToWordPerfect = new PdfToWordPerfect(executeServiceManager.getSe());
        String res = pdfToWordPerfect.pdftoword("******.pdf");
        System.out.println(res);
        executeServiceManager.getSe().shutdown();
    }
}
