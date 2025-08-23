# jmh-sample

## Build
```bash
./mvnw clean package
```

## Direct JMH Parameters

You can also run with direct JMH parameters for maximum control:

```bash
# Ultra-fast development run
java -cp benchmarks/target/benchmarks-1.0-SNAPSHOT-benchmarks.jar info.jab.demo.BenchmarkLoop -wi 1 -i 1 -f 1
# List available benchmarks
java -jar benchmarks/target/benchmarks-1.0-SNAPSHOT-benchmarks.jar -l
```

Key JMH Parameters You Can Use:

```bash
-wi N: Warmup iterations (fewer = faster)
-i N: Measurement iterations (fewer = faster)
-f N: Number of forks (fewer = faster)
-t N: Number of threads
-tu UNIT: Time unit (ns, us, ms, s)
-bm MODE: Benchmark mode (thrpt, avgt, sample, ss)
"pattern": Run only benchmarks matching pattern
-l: List available benchmarks
-h: Show help with all parameters


# Check for dependency updates
./mvnw versions:display-property-updates
./mvnw versions:display-dependency-updates
./mvnw versions:display-plugin-updates
```

## References

- https://jmh.morethan.io/

