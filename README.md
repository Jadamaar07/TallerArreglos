# README - Sistema de Inventario Interactivo

## Descripción del Proyecto

Este proyecto implementa un sistema de inventario interactivo mediante tres clases principales que trabajan en conjunto para gestionar productos. El sistema permite:

1. Agregar nuevos productos al inventario
2. Visualizar todos los productos registrados
3. Actualizar información de productos existentes
4. Eliminar productos del inventario
5. Gestionar productos caducados automáticamente

## Estructura de Clases

### 1. `Producto.java`
**Responsabilidad**: Representa un producto en el inventario con todos sus atributos.

**Atributos principales**:
- `id`: Identificador único del producto
- `nombre`: Nombre del producto
- `descripcion`: Descripción detallada
- `precio`: Valor monetario
- `cantidad`: Unidades disponibles
- `categoria`: Clasificación del producto
- `caducidad`: Indica si el producto tiene fecha de vencimiento
- `fechaVencimiento`: Fecha de caducidad (si aplica)
- Información del proveedor y fotografías

**Métodos clave**:
- `mostrar()`: Imprime todos los detalles del producto formateados

### 2. `Inventario.java`
**Responsabilidad**: Gestiona la colección de productos y las operaciones CRUD.

**Atributos**:
- `listaProductos`: ArrayList que almacena todos los productos

**Métodos principales**:
- `agregarProducto()`: Añade un nuevo producto
- `mostrarProductos()`: Lista todos los productos
- `actualizarProducto()`: Modifica un producto existente
- `eliminarProducto()`: Remueve un producto
- `productoCaducado()`: Elimina automáticamente productos vencidos (con 3+ días de vencimiento)

### 3. `MenuPrincipal.java`
**Responsabilidad**: Proporciona la interfaz de usuario interactiva.

**Flujo principal**:
1. Muestra un menú con 5 opciones
2. Captura la entrada del usuario
3. Delega las operaciones al objeto `Inventario`
4. Procesa los datos necesarios para cada operación

## Conexión entre Clases

El sistema funciona mediante esta interacción:

1. **MenuPrincipal**:
   - Crea una instancia de `Inventario`
   - Presenta opciones al usuario
   - Recoge datos de entrada
   - Llama a los métodos de `Inventario` según la opción seleccionada

2. **Inventario**:
   - Recibe solicitudes de `MenuPrincipal`
   - Gestiona la lista de productos (ArrayList de objetos `Producto`)
   - Ejecuta las operaciones solicitadas
   - Devuelve feedback al usuario a través de `MenuPrincipal`

3. **Producto**:
   - Proporciona la estructura de datos para cada item
   - Ofrece métodos para mostrar y modificar sus atributos
   - Es instanciado por `Inventario` cuando se agrega un nuevo producto

## Uso del Sistema

1. Ejecute `MenuPrincipal.java`
2. Seleccione una opción del menú:
   - **1**: Agregar producto (solicitará todos los datos necesarios)
   - **2**: Ver listado completo de productos
   - **3**: Actualizar producto (necesita el ID del producto)
   - **4**: Eliminar producto (necesita el ID del producto)
   - **5**: Salir del sistema

3. Para productos con caducidad:
   - Indique `true` cuando se pregunte por caducidad
   - Proporcione la fecha de vencimiento completa (año, mes, día)
   - El sistema eliminará automáticamente productos con más de 3 días vencidos

## Consideraciones

- El sistema no persiste los datos (se pierden al cerrar la aplicación)
- Las validaciones de entrada son básicas
- Los IDs deben ser únicos para cada producto
- Para productos sin caducidad, usar `false` cuando se solicite

Este sistema proporciona una base sólida para la gestión de inventarios que puede extenderse con características adicionales como persistencia de datos, búsquedas avanzadas o integración con sistemas externos.
