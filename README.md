to run kotlin in code space 
```bash
curl -s "https://get.sdkman.io" | bash
```

```bash
sdk install kotlin
```

for compiling replace f_n with actual file name to run

```bash
kotlinc f_n.kt -include-runtime -d f_n.jar && java -jar f_n.jar
```