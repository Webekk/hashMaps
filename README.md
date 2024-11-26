# HashMap Example in Java

This project demonstrates basic usage of the `HashMap` class in Java, including creating a `HashMap`, adding, removing, and retrieving values, checking if a key exists, and iterating over the map.

## Features
1. **Creating a HashMap** - Creating an instance of `HashMap` with `String` keys and `Integer` values.
2. **Adding values** - Adding key-value pairs to the map using `put()`.
3. **Retrieving values** - Retrieving values using the key with `get()`.
4. **Checking for existence of a key** - Checking if a key is present using `containsKey()`.
5. **Removing an entry** - Removing an entry from the map using `remove()`.
6. **Iterating through the HashMap** - Iterating through the map using a `for-each` loop.

## Code Breakdown

### 1. Create and manipulate a simple `HashMap`

The following code demonstrates basic operations such as adding key-value pairs, checking if a key exists, removing a key-value pair, and retrieving the value associated with a key:

```java
// Creating HashMap
HashMap<String, Integer> map = new HashMap<>();

// Putting values inside HashMap
map.put("klucz1", 10);
map.put("klucz2", 20);

// Retrieving value associated with key "klucz1"
int value = map.get("klucz1");
System.out.println(value);  // Output: 10

// Checking if a key exists in the map
boolean exists = map.containsKey("klucz1");
System.out.println(exists);  // Output: true

// Removing the entry with key "klucz1"
map.remove("klucz1");

// Attempting to get value for removed key
System.out.println(map.get("klucz1"));  // Output: null
```
## How to run:
1.Clone this repository.

2.Compile the Main.java file:

3.Enjoy your learning :)

