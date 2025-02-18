package numberConvertion;

import numberConvertion.server.NumberConversion;
import numberConvertion.server.NumberConversionSoapType;

import java.math.BigInteger;

public class NumberClient {
    public static void main(String[] args){
        BigInteger big = new BigInteger("15");

        NumberConversion service = new NumberConversion();
        NumberConversionSoapType port = service.getNumberConversionSoap();
        //Simple calls
        System.out.println(port.numberToWords(big));
        System.out.println();

    }
}
