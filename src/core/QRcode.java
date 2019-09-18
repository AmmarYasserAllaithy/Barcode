package core;

import java.io.File;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class QRcode {

    public static boolean generate(String imagePath, String qrCodeData) {
        try {
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(qrCodeData.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE,
                    400,
                    400,
                    hintMap);
            MatrixToImageWriter.writeToFile(
                    matrix,
                    "PNG",
                    new File(imagePath + ".png"));
            return true;
        } catch (WriterException | IOException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        }
        return false;
    }

    public static String read(String imagePath) {
        try {
            Map<EncodeHintType, ErrorCorrectionLevel> hintMap = new HashMap<>();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BinaryBitmap binaryBitmap = new BinaryBitmap(
                    new HybridBinarizer(
                            new BufferedImageLuminanceSource(
                                    ImageIO.read(new FileInputStream(imagePath)))));
            Result qrCodeResult = new MultiFormatReader().decode(binaryBitmap, (Map) hintMap);
            return qrCodeResult.getText();
        } catch (FileNotFoundException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        } catch (IOException | NotFoundException e) {
            NewJFrame.showError(e.toString(), e.getClass().toString());
        }
        return null;
    }
}
