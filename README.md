# Scala 2.11 Compiler Manifest Problem

A minimal example to show the `StackOverflowError` that the 2.11 Scala compiler throws when trying to compile Scala code that needs a `Manifest[T]` when the class for `T` uses generics of the form `SomeClass<T extends SomeClass<T>>`.

### Running
Run `sbt clean compile` 

If you change `build.sbt`'s `scalaVersion` to any `2.10.x` or `2.9.x` it works, but fails on `2.11.x`

#### Note

If you open this project in your IDE using Scala 2.11, your IDE will throw an exception.
