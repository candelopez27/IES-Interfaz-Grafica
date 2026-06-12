# IES-Interfaz-Grafica

# SISTEMA DE AUTOGESTIÓN ESTUDIANTIL 

## Objetivo
Desarrollar en Java una aplicación de consola que simule un sistema de autogestión estudiantil. El  sistema permitirá a un estudiante registrar sus materias, gestionar sus asistencias y calificaciones,  conocer su condición académica (regular o libre) y obtener reportes de su situación académica  general. 
Este proyecto aplica en forma integrada todos los temas del primer bloque de la materia: tipos de  datos, estructuras de control, arrays, colecciones, métodos, clases, herencia, polimorfismo, encapsulamiento e interfaces. 


## Diagrama de clases

<p align="center">
  <img src="docs/GIU - Autogestión estudiantil.png" alt="Diagrama de clases" width="800"/>
</p>

> 🔗 [Ver diagrama en Lucidchart](https://lucid.app/lucidchart/b2eaeac0-28cc-4897-8455-b2c72d7da56f/edit?viewport_loc=-478%2C729%2C1239%2C421%2CHWEp-vi-RSF0&invitationId=inv_5bcdf521-160c-4ffb-a895-0b6a3c404661)

## 👥 Integrantes

- Candela López
- Guada Molina
- Gimena Romero

## 📂 Estructura
/src
 ├── PersonaAcademica.java
 ├── Estudiante.java
 ├── Materia.java
 ├── InscripcionMateria.java
 ├── Evaluable.java
 ├── Consultable.java
 └── SistemaDeAutogestionEstudiantil.java


## 🤖 Documentación: Uso de IA y video

Links a conversaciones de Candela:
- [https://chat.openai.com/yyyy](https://chatgpt.com/share/69f4d80a-b204-83e9-b50a-10b42722ca33)]
- [https://claude.ai/share/97197b90-684a-41ae-a43d-f6a00381f829]
- [https://claude.ai/chat/5f681912-f907-4e4f-bc8f-e48810cc88d2]
- [https://claude.ai/chat/a5964c72-ee03-45a8-b7f2-aa0c3b82bebc]
- [https://claude.ai/chat/43921838-1610-496b-87d0-b3a1b9c4d383]
- VIDEO: [https://drive.google.com/file/d/1XfoYzeDP4yHFJ3Shhq4k4tr5WMV1Mkbq/view?usp=sharing]

Documentación de Guadalupe (promps y video):
- [https://drive.google.com/drive/folders/1Np90drfxH5iQxy-YmBdz2l-0J-v7s9YA ]
----------------------------------------------------------------------------------------------------------------------------
# IE2

## Objetivo
Desarrollar en Java una aplicación de escritorio con interfaz gráfica (Swing) que simule 
un sistema de autogestión estudiantil. El sistema permite a un estudiante registrar sus 
materias, gestionar asistencias y calificaciones, conocer su condición académica y obtener 
reportes de su situación general.

Este proyecto aplica arquitectura MVC + DAO con persistencia en archivos de texto (.txt) 
y como bonus una capa paralela de persistencia en MySQL mediante JDBC.

## FIGMA: https://www.figma.com/design/IPiFLc49q3imcI12YmHmoJ/Bienvenida?node-id=10-23&t=69J37ZVVdidazrwD-1 
---

## 🏗️ Arquitectura — IE2
src/

├── controlador/

│   └── Controlador.java

├── modelo/

│   ├── PersonaAcademica.java

│   ├── Estudiante.java

│   ├── Materia.java

│   ├── InscripcionMateria.java

│   ├── Evaluable.java

│   └── Consultable.java

├── vista/

│   ├── VentanaPrincipal.java

│   ├── VentanaRegistroIngresar.java

│   └── CrearMateria.java

└── dao/

├── EstudianteDAO.java

├── MateriaDAO.java

├── InscripcionDAO.java

└── mysql/

├── Conexion.java

├── EstudianteDAOMYSQL.java

├── MateriaDAOMySQL.java

└── InscripcionMateriaDAOMySQL.java

| Capa | Responsabilidad |
|------|----------------|
| Vista | Interfaz gráfica con Swing. Captura datos, muestra resultados, valida formato |
| Controlador | Coordina la lógica de negocio entre Vista y DAO. Sin imports de Swing |
| DAO (.txt) | Lee y escribe archivos de texto usando toTexto() / fromTexto() del modelo |
| DAO (MySQL) | Capa bonus: replica los datos en base relacional vía JDBC |
| Modelo | Entidades del sistema con lógica de negocio. Sin referencias a Vista ni DAO |

---

## ▶️ Instrucciones de ejecución

### Requisitos
- Java 17 o superior
- NetBeans 17 o superior
- XAMPP (solo para el bonus MySQL)
- mysql-connector-j.jar agregado a las librerías del proyecto

### Ejecución básica (persistencia .txt)
1. Clonar el repositorio
2. Abrir el proyecto en NetBeans
3. Ejecutar `VentanaRegistroIngresar.java` como clase principal
4. La primera vez: completar el formulario de registro
5. Las siguientes veces: ingresar el legajo para hacer login

---

## 🗄️ Bonus — Base de datos MySQL (JDBC)

El sistema incluye una capa paralela de persistencia en MySQL que funciona junto con los archivos `.txt` obligatorios. Si MySQL no está activo, la aplicación sigue funcionando normalmente.

### Instrucciones para crear la base de datos

1. Iniciar **Apache** y **MySQL** desde el panel de XAMPP
2. Ir a `http://localhost/phpmyadmin/`
3. Ir a la pestaña **SQL**
4. Copiar y ejecutar el siguiente script:

```sql
CREATE DATABASE IF NOT EXISTS autogestion_estudiantil;
USE autogestion_estudiantil;

CREATE TABLE IF NOT EXISTS estudiante (
    legajo       VARCHAR(50)  NOT NULL PRIMARY KEY,
    nombre       VARCHAR(150) NOT NULL,
    carrera      VARCHAR(150) NOT NULL,
    anio_ingreso INT          NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS materias (
    codigo       VARCHAR(50)  NOT NULL PRIMARY KEY,
    nombre       VARCHAR(150) NOT NULL,
    cuatrimestre INT          NOT NULL,
    anio         INT          NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS inscripciones (
    id                INT          AUTO_INCREMENT PRIMARY KEY,
    legajo_estudiante VARCHAR(50)  NOT NULL,
    codigo_materia    VARCHAR(50)  NOT NULL,
    total_clases      INT          NOT NULL,
    clases_asistidas  INT          NOT NULL,
    notas             VARCHAR(255) NOT NULL,
    FOREIGN KEY (legajo_estudiante) REFERENCES estudiante(legajo) ON DELETE CASCADE,
    FOREIGN KEY (codigo_materia)    REFERENCES materias(codigo)   ON DELETE CASCADE,
    UNIQUE KEY estudiante_materia_unique (legajo_estudiante, codigo_materia)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
```

> El Modelo, el Controlador y la Vista **no fueron modificados** para agregar esta capa — los DAOs MySQL se instancian en el Controlador dentro de bloques `try-catch` independientes, garantizando que si MySQL no está activo la app sigue funcionando con los `.txt`.

## 🤖 Documentación: Uso de IA

### Candela López
- 📄 Documentación en Word: disponible en [Carpeta con prompts](https://docs.google.com/document/d/1De6l9y5kCIDfEaS8D2kuXO0uMiABkw8VJq33leGGJ2Y/edit?usp=sharing)
- 🎥 Video: [IE2 — Candela López](https://drive.google.com/file/d/1t9MePd7guBsE4q4pDnUlXmgmQDVR9cTU/view?usp=sharing)

### Guadalupe Molina
- 📁 [Carpeta con prompts y video](https://drive.google.com/drive/folders/1Np90drfxH5iQxy-YmBdz2l-0J-v7s9YA)

### Gimena Romero
- 📁 [Carpeta con prompts y video](https://drive.google.com/drive/folders/1B-NCPPKvXh4p_UBMo-47e7wK5N4VXygy)
