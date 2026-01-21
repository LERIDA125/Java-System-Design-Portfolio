# Java System Design Portfolio ☕

Bienvenido a mi colección de soluciones de diseño de sistemas implementadas en Java. Este repositorio consolida la aplicación práctica de principios de **Ingeniería de Software**, **Programación Orientada a Objetos (POO)** y **Patrones de Diseño**.

El objetivo de estos módulos es demostrar la resolución de problemas de negocio complejos mediante código limpio, modular y escalable.

---

## 📂 Estructura del Proyecto

### 1. 🏢 Real-Estate-Management (Gestión Inmobiliaria)
Sistema core para la administración de bienes raíces. Maneja el ciclo de vida de propiedades, desde la captación hasta la concreción de contratos.
- **Dominio:** Contratos de alquiler, ventas, cálculo de comisiones y administración de inquilinos/propietarios.
- **Conceptos Clave:** Polimorfismo en operaciones comerciales, encapsulamiento de reglas de negocio.

### 2. 📨 Messaging-Service-Pattern (Motor de Mensajería)
Diseño de un sistema de notificaciones flexible capaz de gestionar múltiples canales de comunicación.
- **Dominio:** Envío de Emails, SMS y Notificaciones Push.
- **Conceptos Clave:** Implementación de **Patrones de Diseño (Strategy / Observer)** para desacoplar la lógica de envío del tipo de mensaje, permitiendo la extensión sin modificar el código base (Open/Closed Principle).

### 3. 🚌 Transport-Ticketing-System (Sistema de Ticketing)
Simulación de la lógica de negocio detrás de una tarjeta de transporte inteligente (tipo SUBE/Oyster).
- **Dominio:** Gestión de saldos, cálculo de tarifas con descuentos acumulativos, validación de viajes y saldo negativo.
- **Conceptos Clave:** Modelado de estados, manejo de transacciones y relaciones entre entidades (Usuario - Tarjeta - Viaje).

### 4. ✈️ Airport-Traffic-Control (Gestión de Tráfico Aéreo)
Sistema de control y asignación de recursos aeroportuarios.
- **Dominio:** Asignación de pistas de aterrizaje/despegue, gestión de aerolíneas y control de pasajeros.
- **Conceptos Clave:** Relaciones complejas (1-a-N, N-a-M), validaciones estrictas y modelado de infraestructura física.

### 5. 🏃 Marathon-Event-Manager (Gestión de Eventos Deportivos)
Plataforma para la administración de competiciones atléticas masivas.
- **Dominio:** Inscripción de corredores, clasificación automática por categorías (edad/género) y registro de tiempos.
- **Conceptos Clave:** Algoritmos de clasificación, manejo eficiente de Colecciones y filtrado de datos.

---

## 🛠 Stack Tecnológico
- **Lenguaje:** Java (JDK 17+)
- **Testing:** JUnit (Pruebas Unitarias)
- **Paradigmas:** OOP, SOLID Principles
- **Herramientas:** Git, IntelliJ IDEA / Eclipse

---
*Desarrollado por Fernando - Software Developer*
