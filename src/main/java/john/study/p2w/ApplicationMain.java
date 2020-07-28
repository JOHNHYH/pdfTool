package john.study.p2w;

public class ApplicationMain {
    public static void main(String[] args) {
//        String res = new PdfToWord().pdftoword("C:\\Users\\JOHN\\Desktop\\convert\\每日易购平台计划书(1)(1).pdf");
//        System.out.println(res);

        ExecuteServiceManager executeServiceManager = new ExecuteServiceManager();
        PdfToWordPerfect pdfToWordPerfect = new PdfToWordPerfect(executeServiceManager.getSe());
        String res = pdfToWordPerfect.pdftoword("C:\\Users\\JOHN\\Desktop\\convert\\Java多线程编程核心技术_完整版+PDF电子书下载+带书签目录.pdf");
        System.out.println(res);
        executeServiceManager.getSe().shutdown();
    }
}
