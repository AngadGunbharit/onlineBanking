/**
 * 
 */
package com.cg.obs.util;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sohel
 *
 */
@RestController
public class FundTransferController {
	@PostMapping(path = "/fundtransfer/from/{senderAccountNo}/to/{recieverAccountNo}/{amount}")
	public String fundTransfer(@PathVariable String senderAccountNo,@PathVariable String recieverAccountNo,@PathVariable double amount) {
		System.out.println("this will transfer funds from one account to other and update transactions also");
		return "fund transferred";
	}
}
