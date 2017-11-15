## Comparing/benchmarking 10 different ways to implement the Fibonacci sequence

To make this work you need to ...

* install git with `brew install git`
* install sbt with `brew install sbt`
* clone the repo with `git clone https://github.com/rolandtritsch/scala-fib-bench.git`

To make the jvm version work ...

* you need to cd into `jvm`
* build and run the tests with `sbt test`
* look at the results by opening `target/benchmark/results/index.html` in the browser of your choice

To make the llvm version work ...

* you need to cd into `llvm`
* run the tests with `sbt run`