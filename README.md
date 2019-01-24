# gatlingTest
Continuous load testing for my Backend API.

> require: 
> IntelliJ IDEA Setting -> pulgin -> Scala [Languages]

### How To Run
#### Step 1. compile
```shell
mvn clean test
```

#### [Optional] Step 2. run `src/test/scala/Recorder`

#### Step 3.  run `src/test/scala/Engine`, you can see:

```shell
Choose a simulation number:
     [0] Rest
     [1] WebClient
```

#### Step 4. check test report under: `target/gatling/`



