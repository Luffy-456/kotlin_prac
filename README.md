to run kotlin in code space 
```bash
curl -s "https://get.sdkman.io" | bash
```

```bash
sdk install kotlin
```

for compiling 

```bash
kotlinc basic.kt -include-runtime -d basic.jar && java -jar basic.jar
```