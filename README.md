# Taller 1 primer semestre 2024

##Sistema de gestión de permisos municipales

**Curso:** Laboratorio de Progrmación II

**Profesor:** Oscar Aguayo

**Alumno:** Tomás Eduardo Gutiérrez Olcay

**Matrícula:** 20962137121

**Fecha:** 09/04/2024

## Sistema de Gestión de Permisos Municipales

### Descripción del Problema

Se requiere desarrollar un sistema de gestión de permisos municipales para construcciones, negocios y eventos especiales. Este sistema permitirá a los ciudadanos registrarse en el sistema, buscar permisos existentes, solicitar nuevos permisos y proporcionar información detallada sobre los permisos realizados por la municipalidad.

### Requerimientos

1. Los ciudadanos pueden registrarse y tener una cuenta.
2. Cada permiso debe tener un tipo, fecha de emisión y de vencimiento, costo e identificador único.
3. La municipalidad debe contar con un catálogo de permisos realizados.
4. Los ciudadanos pueden buscar permisos por tipo, fecha de emisión y de vencimiento.
5. Los ciudadanos pueden solicitar nuevos permisos, proporcionando la información necesaria.
6. Cada solicitud debe tener un registro con el ciudadano asociado, el permiso solicitado y la fecha de la transacción.
7. Los permisos de negocio deben especificar el tipo de negocio, tamaño del local y la cantidad de empleados.
8. Los de construcción deben especificar el tipo de construcción (residencial, comercial), los metros cuadrados y la ubicación.
9. Los permisos para eventos especiales deben especificar el tipo de evento, la cantidad esperada de asistentes y medidas de seguridad.

### Funcionalidades

1. Calcular el costo de los permisos según su tipo:
   - CostoPermisoNegocio = costo base + (tamaño local * tarifa por metro cuadrado) + (cantidad de empleados * tarifa por empleado)
   - CostoPermisoConstrucción = costo base + (metros cuadrados a construir * tarifa por metro cuadrado)
   - CostoPermisoEventos = costo base + (cantidad esperada de asistentes / 100 * tarifa por cada 100 asistentes)
   - Tarifa por metro cuadrado = $150.000
   - Tarifa por empleado = $20.000
   - Tarifa por cada 100 asistentes = $100.0000
2. Registrar ciudadanos y permisos municipales.
3. Buscar todos los permisos de un ciudadano.
4. Buscar permisos por tipo, fecha de emisión y de vencimiento.
5. Mostrar todos los permisos de un ciudadano.
6. Obtener información completa de un permiso.

### Diagrama de Clases

![Taller1012024](https://github.com/TGO74/1erTallerLAb2/assets/128320982/f47815a9-2ca5-49db-8dd6-f5138d9c11bd)


### Clases, Atributos y Métodos

#### Clase Ciudadano

- **Atributos:**
  - nombre: String
  - id: int
  - permisosCiudadano : ArrayList<Permiso>

- **Métodos:**
  + registrarse(nombre : String, rut : String) : void
  - buscarPermisoTipo(): ArrayList<Permiso>
  - buscarPermisoFecha(): ArrayList<Permiso>

#### Clase Permiso (Abstracta)

- **Atributos:**
  - tipo: String
  - fechaEmision: LocalDate
  - fechaVencimiento: LocalDate
  - costo: double
  - idPermiso: int

- **Métodos:** 
  - calcularCosto(): double (abstracto)

#### Clase PermisoNegocio 

- **Atributos:**
  - tipoNegocio: String
  - tamañoLocal: double
  - cantidadEmpleados: int

- **Métodos:**
  - calcularCosto(): double

#### Clase PermisoConstruccion

- **Atributos:**
  - tipoConstruccion: String
  - metrosCuadrados: double
  - ubicacion: String

- **Métodos:**
  - calcularCosto(): double

#### Clase PermisoEventoEspecial

- **Atributos:**
  - tipoEvento: String
  - cantidadAsistentes: int
  - medidasSeguridad: String

- **Métodos:**
  - calcularCosto(): double




#### Clase GestionPermisos
Se encarga de relacionar y gestionar las funcionalidades del sistema en si.
- **Métodos:**
- registarCiudadano(ciudadano : Ciudadano) : void
- registrarPermiso( permiso : Permiso) : void
- buscarPermisosCiudadano(ciudadano : Ciudadano) : ArrayList<Permiso>
- buscarPermiso(permiso : Permiso, fechaEmision : LocalDate, fechaVencimiento : LocalDate) : Permiso
- mostrarPermisoCiudadano(ciudadadano : Ciudadano) : ArrayList<Permiso>
- obtenerInformacionPermiso(permiso : Permiso) : Permiso

### Relaciones entre Clases

- Las clases **Negocio**, **Construccion** y **EventoEspecial** son subclases de la clase **Permiso** (herencia).
- La clase **Permiso** tiene una relación de asociación con la clase **Ciudadano**.
- La clase **Permiso** tiene una relación de composición con la clase **GestionPermisos**.
- La clase **GestionPermisos** tiene una relación de agregación con la clase **Ciudadano**.
