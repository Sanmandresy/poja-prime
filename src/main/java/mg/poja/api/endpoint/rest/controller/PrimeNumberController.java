package mg.poja.api.endpoint.rest.controller;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import mg.poja.api.service.event.PrimeNumberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PrimeNumberController {
  private final PrimeNumberService service;

  @GetMapping("/new-prime")
  public BigInteger generatePrime() {
    return service.generatePrimeNumber();
  }
}
