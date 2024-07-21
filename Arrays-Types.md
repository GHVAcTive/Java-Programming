# 📚 Java `Arrays` Methods Cheat Sheet 📚

### 1. `Arrays.asList` 📋
- **Description:** Converts an array to a `List`.
- **Syntax:**
  ```java
  List<T> list = Arrays.asList(array);

#### Example:

    ```java
    String[] array = {"a", "b", "c"};
    List<String> list = Arrays.asList(array);
    ```

### 2. `Arrays.toString` 📝
- **Description**: Returns a string representation of the array.
- **Syntax:**
  ```java
  String str = Arrays.toString(array);
  ```

#### Example:
```java

int[] array = {1, 2, 3};
String str = Arrays.toString(array);  // "[1, 2, 3]"
```
---

### 3. `Arrays.deepToString` 🔍
- **Description:** Returns a string representation of a multi-dimensional array.
- **Syntax:**
  ```java
  String str = Arrays.deepToString(array);
  ```
#### Example:
    ```java

    int[][] array = {{1, 2}, {3, 4}};
    String str = Arrays.deepToString(array);  // "[[1, 2], [3, 4]]"
    ```
---

### 4. `Arrays.sort` 🔢
- **Description:** Sorts the array in ascending order.
- **Syntax:**
  ```java
  Arrays.sort(array);
  ```
#### Example:
    ```java

    int[] array = {3, 1, 2};
    Arrays.sort(array);  // [1, 2, 3]
    ```

---

### 5. `Arrays.equals` 🔄
- **Description:** Compares two arrays for equality.
- **Syntax:**
  ```java
  boolean isEqual = Arrays.equals(array1, array2);
  ```

#### Example:

    ```java
    int[] array1 = {1, 2, 3};
    int[] array2 = {1, 2, 3};
    boolean isEqual = Arrays.equals(array1, array2);  // true
    ```

---

### 6. `Arrays.copyOf` 🖨️
- **Description:** Copies the specified array, truncating or padding with zeros.
- **Syntax:**
  ```java
  int[] newArray = Arrays.copyOf(originalArray, newLength);
  ```

#### Example :
    ```java
    int[] array = {1, 2, 3};
    int[] newArray = Arrays.copyOf(array, 5);  // [1, 2, 3, 0, 0]
    ```
