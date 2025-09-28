# Práctica Programada 1 — SC-304

Curso: Estructuras de Datos  
Profesor:Luis Andrés Rojas Matey  
Estudiante:Cristel Mariam Vásquez Campos  
Carné:F124038179  




Descripción
Este proyecto implementa un programa en Java llamado Inverso, el cual recibe un número natural como argumento y muestra dicho número junto con su inverso, utilizando un algoritmo recursivo basado en la división entera (cociente y residuo).

Ejemplo de ejecución:
 java Inverso 123
123 → 321


 Recursos consultados
- Documentación oficial de Java SE 21: https://docs.oracle.com/en/java/javase/21/  
- Ejemplos de recursividad en Java: https://www.geeksforgeeks.org/recursion-in-java/  


 Consultas a Chatbots de IA
- Prompt utilizado en ChatGPT:  
  Cómo utilizar git hub.  
  Respuesta resumida:Explicación breve de como hacerlo


 Preguntas

1. ¿Es posible implementar una solución equivalente pero de comportamiento iterativo? 
   Sí, se puede implementar con un ciclo  while que extraiga los dígitos y los acumule en orden inverso.

2. ¿Cree que hay alguna otra manera recursiva de generar el mismo resultado?
   Sí, por ejemplo, utilizando strings como la conversión a  String y la recursión de subcadenas, aunque no cumpliría con el requisito de usar cociente y residuo.

3. ¿Qué relación observa entre el algoritmo para invertir un número natural con las estrategias para pasar de una base numérica a otra? 
   Ambas técnicas se basan en divisiones sucesivas y en el uso de cociente y residuo:  
   - Para invertir un número en base 10, se separan los dígitos.  
   - Para cambiar de base, los residuos se acumulan como los nuevos dígitos en la base deseada.

---
