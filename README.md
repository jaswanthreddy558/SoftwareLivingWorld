********# SoftwareLivingWorld
**This Project is developed by Jaswanth Reddy 
A cheat sheet for Java 8
Contents
Why Java 8
Lambdas
Streams
Optionals
Default and Static Methods on Interfaces
Date & Time
Why Java 8**



**Java 8 is great for removing "boiler-plate" code. It introduces several new language features to do this including lambdas, streams, method references and optionals. These can all be used to help you write fluent easy to read code.

****Collections.sort(inventory, new Comparator<Apple>() {
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight().compareTo(a2.getWeight());
    }
});********
  
  
  
VS

inventory.sort(comparing(Apple::getWeight));
****Lambdas
****A lambda expression is an anonymous function that can passed as an argument to a method or stored in a variabl.********

(int x) -> { return x * 2; }        //> The double of "x"
(int a, int b) -> { return a + b; } //> The sum of "a" and "b"
() -> {}                            //> This is a valid lambda that takes no arguments and does nothing
Syntax
There are two main kinds of lambdas:

Lambdas with multiple statements
(Person p) -> {
    String name = p.getName();
    int age = p.getAge();
    return name + " is " + age;
}
Lambdas with a single expression (note no return keyword)
(Person p) -> p.getName() + " is " + p.getAge()
Functional Interfaces
The a lambda's type is a Functional Interface. A functional interface is any interface that has exactly one abstract method. A simple example in Java 8 is the Consumer interface:

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);    
}
Wherever a Consumer is needed, a lambda with a method signiture that matches the single abstract method accept(T t) can be used.

An example of this is the new forEach method on Iterable

void forEach(Consumer<? super T> action);
Because Consumer is a Functional Interface we can call forEach with a lambda expression.

beatlesMembers.forEach((String name) -> System.out.printLn(name))
//> John
//> Paul
//> George
//> Ringo
Because beatlesMembers has the type List<String>, forEach expects a Consumer<String> as it's argument. The given lambda is a valid Consumer because it has the same method signature as Consumer.accept.

Method	Signature
consumer.accept(String name)	(String) -> void
(String name) -> System.out.printLn(name)	(String) -> void
Common Functional Interfaces
Interface	Signature
BiFunction<T,U,R>	(T, U) -> R
Consumer<T>	(T) -> void
Function<T,R>	(T) -> R
Predicate<T>	(T) -> boolean
Supplier<T>	() -> T
UnaryOperator<T>	(T) -> T
There are also Functional Interfaces that accept and return primitives, but they follow these structures.

Method References
A Method Reference can be used instead of a lambda to represent a Functional interface. For example System.out.printLn has the same method signature as the accept method in Consumer, so it can be used in a forEach:

primeNumbers.forEach(System.out::printLn);
//> 2
//> 3
//> 5
//> 7
// ...
Lambda	Method Reference
s -> System.out.printLn(s)	System.out::printLn
(String s) -> s.toLowerCase()	String::toLowerCase
Streams
A Stream is useful for performing common operations on collections such as mapping from one type to another, filtering out elements based on a predicate or sorting by custom comparator.

Making a Stream
The Java Collection interface now has a method stream() that returns a Stream object.

Method	Description
Collection<T>.stream()	A Stream containing the elements in the Collection
Stream.of(T... values)	An ordered Stream of the values
Stream.empty()	An empty Stream
Stream.generate(Supplier<T> s)	An infinite Stream of objects returned by the Supplier
Stream.iterate(T seed, UnaryOperator<T> f)	An infinite Stream of objects starting with the seed, and from then on the object returned by passing the latest object into the UnaryOperator
Other types of streams are DoubleStream, IntStream and LongStream for handling primitives.

Streams and Lambdas
Many of the methods on streams can make use of lambdas for fluent operations on the data in the stream.

One example of this is filter:

Stream<T> filter(Predicate<? super T> predicate)
Predicate is a Functional Interface whose abstract method (test) is used to filter the Stream so that it only contains objects for which test returns true.

boolean test(T t)
Here we use a lambda as a Predicate to filter our Stream so that it only contains bands starting with "M"

Stream<String> bands = Stream.of("Nickleback", "Madness", "Muse", "Kings of Leon", "Iron Maiden", "AC/DC")

bands.filter(band -> band.startsWith("M")).forEach(System.out::println);
//> Madness
//> Muse
Optionals
An Optional<T> is an object that wraps another object of type T that might be null. It can be used to replace old Java code such as this:

private String getInsurer(Person person) {
	if (person == null) {
		return "UNKNOWN";
	}
	Car car = person.getCar();
	if (car == null) {
		return "UNKNOWN";
	}
	Insurance insurance = car.getInsurance();
	if (insurance == null) {
		return "UNKNOWN";
	}
	return insurance.getName();
}
with fluent Java 8 code like:

private String getInsurer(Person person) {
    return Optional.ofNullable(person)
                   .flatMap(Person::getCar)
                   .flatMap(Car::getInsurance)
                   .map(Insurance::getName)
                   .orElse("UNKNOWN");
}
Working With Optionals
Lets breakdown the methods in the example above.

Optional.ofNullable(person) returns an Optional<Person> containing person which may be null.
Optional<Person>.flatMap(Person::getCar) returns an Optional<Car>. This is interesting because Person::getCar returns an Optional<Car> (not everyone has a car) so you may expect to get an Optional<Optional<Car>>; but this is handled by the flatMap method (which only accepts functions that return an Optional).
Optional<Insurance>.map(Insurance::getName) because Insurance::getName returns a String this returns an Optional<String>.
Optional<String>.orElse("UNKNOWN") returns the String in the Optional<String> if it is not null or else "UNKNOWN".
Returning an Optional
The Optional class was designed to let a developer declare to the compiler and other developers that a value might be null

The most common place to do this is in the return type of a method. From the example above we have the method Person::getCar that returns an Optional<Car> that anyone calling the method must handle.

public Optional<Car> getCar() {
    return Optional.ofNullable(car);
}
Default and Static Methods on Interfaces
It is now possible to define two new types of methods on Interfaces in Java 8.

Static Methods on Interfaces
Java now lets you write static methods on interfaces, just like it does for classes. The new Stream interface has several static methods for creating a Stream.

Default Methods on Interfaces
Default methods can be defined on an interface using the keyword default. These default methods can be added to interfaces to introduce new behavior without breaking backwards compatibility.

Date & Time
Java 8 contains a new Date & Time API with these classes in the java.time package:

Class	Time	Date	Zone
Example	03:20 PM	22 Mar 2017	GMT
ZonedDateTime	✅	✅	✅
LocalDateTime	✅	✅	❌
LocalTime	✅	❌	❌
LocalDate	❌	✅	❌
ZoneId	❌	❌	✅
Duration & Period
Duration & Period are two ways of measuring a length of time.

Duration

Time based distance on the timeline
eg: 2 seconds + 3 nanoseconds
Period

Date based distance on the timeline
eg: 3 weeks + 2 days********
