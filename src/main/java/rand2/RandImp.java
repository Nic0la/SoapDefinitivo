package rand2;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Random;


@WebService(endpointInterface = "rand2.RandService")
public class RandImp implements RandService {
    private static final int maxRands = 16;

    @WebMethod
    public int next1() {
        return new Random().nextInt();
    }
    @WebMethod
    public int[] nextN(final int n) {
        final int k = (n > maxRands) ? maxRands : Math.abs(n);
        int[] rands = new int[k];
        Random r = new Random();
        for(int i = 0; i < k; i++) rands[i] = r.nextInt();
        return rands;
    }
}
