package mg.poja.api.service.event;

import java.math.BigInteger;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrimeNumberService {
  public BigInteger generatePrimeNumber() {
    int bitLength = 10_000;
    Random rdn = new Random();
    return BigInteger.probablePrime(bitLength, rdn);
  }
}
