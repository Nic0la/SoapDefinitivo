package client;

import server.RandService;
import server.RandServiceService;

import java.util.List;

public class RandClient {
    public static void main(String[] args) {

        RandServiceService service = new RandServiceService();
        RandService port= service.getRandServicePort();
        //Simple calls
        System.out.println(port.next1());
        System.out.println();
        List<Integer> nums = port.nextN(4);
        for (int i : nums) {
            System.out.println(nums);
        }
    }
}

