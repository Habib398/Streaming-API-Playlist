# Streaming-API-Playlist
Esta API permite a los usuarios de una plataforma de streaming (como Netflix o Prime) crear y gestionar listas de reproducción personalizadas. Los usuarios pueden agregar, eliminar y listar las películas o series en sus listas de reproducción.

Tecnologías Utilizadas
JDK 21
Spring Boot
Spring Data MongoDB
Lombok
Validation
JUnit 5
MongoDB

Obtener listas de reproducción por usuario
Método: GET
Descripción: Retorna todas las listas de reproducción asociadas a un usuario específico.

Obtener lista de reproducción por ID
Método: GET
Descripción: Retorna una lista de reproducción específica por su ID.

Crear una nueva lista de reproducción
Método: POST
Descripción: Crea una nueva lista de reproducción.

Eliminar una lista de reproducción
Método: DELETE
Descripción: Elimina una lista de reproducción específica por su ID.

La API incluye validaciones de los datos de entrada para asegurarse de que la información proporcionada por el cliente sea correcta. 
Se han creado pruebas unitarias utilizando JUnit 5 para asegurar el correcto funcionamiento de la API.
git clone https://github.com/tuusuario/playlist-api.git
