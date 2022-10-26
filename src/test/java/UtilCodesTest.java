import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UtilCodesTest {

    @DisplayName("Utilizando a lib 'Apache PDFBox', este método realiza a conversão da primeira página do documento, em uma imagem '.jpg' ")
    @Test
    public void convertFirstPageFromPDFToImage() throws IOException {

        PDDocument document = PDDocument.load(new File("/home/ronaldo/Downloads/guia_rapido_merchandising_abr_2022_papo_de_farmacia.pdf"));
        BufferedImage image = new PDFRenderer(document).renderImageWithDPI(0, 600, ImageType.RGB);

        ImageIO.write(image, "jpg", new File("/home/ronaldo/Desktop/image.jpg"));
        document.close();
    }

    @DisplayName("Utilizando a lib 'Apache PDFBox', este método realiza a conversão da primeira página do documento, em uma imagem '.jpg' ")
    @Test
    public void getWordsFromPDF() throws IOException {

        PDDocument document = PDDocument.load(new File("/home/ronaldo/Downloads/guia_rapido_merchandising_abr_2022_papo_de_farmacia.pdf"));
        BufferedImage image = new PDFRenderer(document).renderImageWithDPI(0, 600, ImageType.RGB);

        ImageIO.write(image, "jpg", new File("/home/ronaldo/Desktop/image.jpg"));
        document.close();
    }
}
