# Programación Orientada a Objetos (Java)
## Sistema de Gestión de Peajes y Vehículos
#### Universidad Nacional de Colombia

---

Este repositorio contiene el desarrollo del programa **BONUS21ABR**, enfocado en la aplicación de los principios de la **Programación Orientada a Objetos (POO)** en **Java** para modelar un sistema de control de peajes viales. El programa simula la interacción entre diferentes tipos de vehículos, estaciones de peaje y propietarios, aplicando polimorfismo, herencia y gestión de colecciones.

---

## Contenido del Proyecto

El desarrollo incluye clases estructuradas y métodos para gestionar las siguientes entidades y operaciones:

* **Clase Peaje:** Modela la estación de cobro (nombre y ubicación), permitiendo registrar vehículos, calcular tarifas según el tipo de transporte y generar reportes impresos de la operación.
* **Clases de Vehículos (Carro, Camión, Moto):** Implementan jerarquías y polimorfismo para diferenciar características específicas (como el número de ejes en los camiones) y calcular sus respectivas tarifas de peaje.
* **Clase Persona:** Gestiona los datos personales de los usuarios (nombre, apellido, identificación y fecha de nacimiento), permitiéndoles asociar múltiples vehículos y calcular el gasto total acumulado en peajes.
* **Clase Principal (BONUS21ABR):** Coordina la ejecución del programa, instanciando estaciones de peaje, vehículos variados, asignándolos a usuarios y ejecutando los cálculos de tarifas y reportes por consola.

---

## Especificaciones de Ejecución

* **Entorno:** Desarrollado para su compilación y ejecución en entornos compatibles con **Java (JDK 8 o superior)**, como NetBeans, IntelliJ IDEA o Eclipse.
* **Requerimientos:** No se requieren librerías externas adicionales; el proyecto utiliza exclusivamente las estructuras estándar de Java bajo el paquete `con.mycompany.bonus21abr`.
* **Estructura:** El código está organizado modularmente para demostrar los pilares de la POO, destacando la reutilización de código mediante herencia.
