package in.asananda.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.asananda.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
