import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/fibonacci")
public class FibonacciController {
    @GetMapping("/{n}")
    public int nthFibonacci(@PathVariable int n) {
        return Fibonacci.nthFibonacci(n);
    }

    @GetMapping("/first/{n}")
    public int[] firstNFibonacci(@PathVariable int n) {
        return Fibonacci.firstNFibonacci(n);
    }
}
