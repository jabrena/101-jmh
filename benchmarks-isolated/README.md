# Without any module + Isolated JMH tests

```bash
./mvnw --batch-mode --no-transfer-progress install --file pom.xml
cd benchmarks
./mvnw --batch-mode --no-transfer-progress package --file pom.xml
java -cp target/benchmarks-1.0-SNAPSHOT-benchmarks.jar info.jab.demo.BenchmarkLoop -wi 1 -i 1 -f 1
```
