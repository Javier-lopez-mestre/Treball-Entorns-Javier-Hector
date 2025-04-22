## Estructura del proyecto


El código fuente está organizado en la carpeta `src/main/java/com/example`, e incluye las siguientes clases:

- `Figura.java`: Clase abstracta que define los métodos `calculoArea()` y `calculoPerimetro()`.
- `Rectangulo.java`: Implementa los métodos para calcular el área y perímetro de un rectángulo.
- `Triangulo.java`: Implementa los métodos para calcular el área y perímetro de un triángulo.
- `Circulo.java`: Implementa los métodos para calcular el área y perímetro de un círculo.
- `Main.java`: Contiene el método `main()` que crea objetos de las figuras y muestra los cálculos.
- `FiguraTest.java`: Clase de test para verificar el comportamiento de las figuras con JUnit.

##  Dependencias

El proyecto utiliza la librería `JUnit 5` para realizar pruebas. Esta dependencia se incluye en el archivo `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.9.3</version>
    <scope>test</scope>
</dependency>
```