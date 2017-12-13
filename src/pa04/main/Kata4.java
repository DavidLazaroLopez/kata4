package pa04.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import pa04.model.Histogram;
import pa04.view.HistogramDisplay;
import pa04.view.MailHistogramBuilder;
import pa04.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "C:\\Users\\Entrar\\Desktop\\emails.txt";
        output(process(input(fileName)));
    }
    private static List<String> input(String fileName) throws FileNotFoundException, IOException{
        return MailListReader.read(fileName);
    }
    private static Histogram<String> process(List<String>mailList){
        return MailHistogramBuilder.build(mailList);
    }
    private static void output(Histogram<String> histogram){
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    } 
}
