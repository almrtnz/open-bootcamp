# Resources (Recursos)

[Conditions](##conditions-(condiciones)) | [Conditional statements](##conditional-statements-declaraciones-condicionales) | [Loops](##loops-(bucles))

## Conditions (Condiciones)

Less than *(menor que)*: ` a < b `

Less than or equal to *(menor que o igual a)*: ` a <= b `

Greater than *(mayor que)*: ` a > b `

Greater than or equal to *(mayor que o igual a)*:  ` a >= b `

Equal to *(igual a)*: ` a == b `

Not Equal to *(no es igual a)*: ` a != b `

## Conditional statements *(declaraciones condicionales)*

### if ... else

```java
if (condition) {
  // if condition is true, do this 
  // (si la condición es verdadera, haz esto)

}
else {
  // if condition is false, do this 
  // (si la condición es falsa, haz lo siguiente)
}
```

### if ... else if ... else

We can have multiple `else if` (podemos tener varios `else if`).

```java
if (condition1) {
  // if condition 1 is true, do this 
  // (si la condición 1 es verdadera, haz esto)

}

else if (condition2) {
  // if condition 1 is false and condition 2 is true, do this 
  // (si la condición 1 es falsa y la condición 2 es verdadera, haz esto)
}

else {
  // if condition 1 and 2 are false, do this 
  // (si la condición 1 y 2 son falsas, haz esto)
}
```

### Switch statements (Declaraciones *Switch*)

Use `switch` to select one of many code blocks to be executed. (Utilizar `switch` para seleccionar uno de los muchos bloques de código que se ejecutarán).

```java
switch(expression) {
  case x:
    // when expression equals x, do this
    // (cuando la expresión es igual a x, haz esto)
    break;
  case y:
    // when expression equals y, do this
    // (cuando la expresión es igual a y, haz esto)
    break;
      case z:
    // when expression equals z, do this
    // (cuando la expresión es igual a z, haz esto)
    break;
  default:
    // when expression equals to anything except x, y or z, do this
}
```

> When Java reaches a `break` keyword, it breaks out of the `switch` block and will stop the execution of more code. *(Cuando Java llega a un `break`, rompe el bloque de `switch` y detiene la ejecución de más código.)*

### Ternary operator (Operador ternario)

A shortened `if else` that consists of three operands. *(Un `if else` abreviado que consta de tres operadores).*

Can be used to replace multiple lines of code with a single line. *(Puede utilizarse para sustituir varias líneas de código por una sola).*

```java
variable = (condition) ? expressionTrue :  expressionFalse;
```

## Loops (bucles)

[Loop](https://www.w3schools.com/java/java_while_loop.asp "www.w3schools.com/java/java_while_loop.asp")

> Loops can execute a block of code as long as a specified condition is reached. Loops are handy because they save time, reduce errors, and they make code more readable. *(Los bucles pueden ejecutar un bloque de código mientras se alcance una condición especificada. Los bucles son útiles porque ahorran tiempo, reducen los errores y hacen que el código sea más legible).*

### While loop

The `while loop` loops through a block of code as long as a specified condition is true. *(El bucle while repite un bloque de código mientras una condición especificada sea verdadera).*

```java
while (condition) {
  // while the condition is true, do this
}
```

#### Do/While Loop

The `do/while` loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true. *(El bucle `do/while` es una variante del bucle while. Este bucle ejecutará el bloque de código una vez, antes de comprobar si la condición es verdadera, luego repetirá el bucle mientras la condición sea verdadera).*

```java
do {
  // do this once, then check if the condition is true and loop it
  // (haz esto una vez, luego comprueba si la condición es verdadera y haz un bucle)
}
while (condition);
```

### For loop

When you know exactly how many times you want to loop through a block of code, use the `for` loop instead of a while loop:

```java
for(initialization; condition; action) {
  // code block to be executed
}
```

`initialization` is executed **(one time)** before the execution of the code block.

we need a condition for executing the code block.

the *action* is executed **(every time)** after the code block has been executed.

```java
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
```

> this will print the numbers 0 to 4

```java
for (int i = 0; i < 3; i++) {
  System.out.println("Hello");
}
```

> this will print hello 3 times
