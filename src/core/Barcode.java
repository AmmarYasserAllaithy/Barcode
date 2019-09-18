package core;

import java.io.File;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode {

    public static boolean generate(String imagePath, String barCodeData) {
        try {
            String charset = "UTF-8"; // or "ISO-8859-1"
            Code128Writer writer = new Code128Writer();
            BitMatrix matrix = writer.encode(
                    new String(barCodeData.getBytes(charset), charset),
                    BarcodeFormat.CODE_128,
                    400,
                    200);
            MatrixToImageWriter.writeToFile(
                    matrix,
                    "PNG",
                    new File(imagePath + ".png"));
            return true;
        } catch (IOException | WriterException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        }
        return false;
    }

    public static String read(String imagePath) {
        try {
            BinaryBitmap binaryBitmap = new BinaryBitmap(
                    new HybridBinarizer(
                            new BufferedImageLuminanceSource(
                                    ImageIO.read(new FileInputStream(imagePath)))));
            Result barCodeResult = new MultiFormatReader().decode(binaryBitmap);
            return barCodeResult.getText();
        } catch (FileNotFoundException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        } catch (NotFoundException | IOException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        }
        return null;
    }
}
